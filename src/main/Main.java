package main;

import java.util.Scanner;

import serviciosCambioMoneda.*;

public class Main {
	
	public static void menu() {
		System.out.println("\n***MENU CUENTA BANCARIA ***");		
		System.out.println("-------------------");	
		System.out.println(" 0- Salir");		
		System.out.println(" 1- Depositar");
		System.out.println(" 2- Retirar");
		System.out.println(" 3- Ver Saldo");
		System.out.println(" 4- Ver Cuenta Bancaria");
		System.out.println(" 5- Convertir Pesos a Dolar");		
		System.out.println(" 6- Convertir Dolar a Pesos");		
		System.out.println("-------------------\n");
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nombre, run;
		int numeroCuenta;
		double monto;
		
	    // Registrar Cliente
	    // ---------------------------------------------
		
		System.out.println("APERTURA DE CUENTA BANCARIA: ");
		System.out.println("------------------------------");
		

		System.out.print("Ingrese Nombre: ");
		nombre = scanner.nextLine();
		
		System.out.print("Ingrese Run: ");		
		run = scanner.nextLine();

		System.out.print("Ingrese numero de Cuenta: ");
		numeroCuenta = scanner.nextInt(); 
		//Cliente(String nombre, String rut, String tipo)
		Cliente cliente = new Cliente(nombre, run,  numeroCuenta);
		
		
	    // ---------------------------------------------	
		 monto = 50000;
		//CuentaBancaria(double saldo, Cliente titular)
		CuentaBancaria cuenta = new CuentaBancaria(monto, cliente);
		cuenta.setTipoMoneda("CLP");
		System.out.print("\nPor apertura de cuenta("+numeroCuenta+") su saldo es: "+monto+"("+cuenta.getTipoMoneda()+")\n");
		
		// ---------------------------------------------	
    	int opc = 0;
    	
    	do {
			menu();
			
		    System.out.print("Ingrese opcion: ");
		    opc = scanner.nextInt(); 
	
			switch (opc) {
				
				case 0:
					System.out.println("Good bye!");
				break;
				
				case 1:
				    System.out.print("Ingrese monto a depositar ("+cuenta.getTipoMoneda()+"): ");
				    Double saldo = scanner.nextDouble(); 
					
					if(cuenta.depositar(saldo)) { 
						System.out.println("Monto depositado correctamente!"); 
					}else {
						System.out.println("Favor ingrese numero mayor a cero.");
					}
				break;
					
				case 2:
				    System.out.print("Ingrese monto a retirar ("+cuenta.getTipoMoneda()+"): ");
				    Double saldo1 = scanner.nextDouble(); 
				    
					if(cuenta.retirar(saldo1)) { 
						System.out.println("Monto retirado correctamente!"); 
					}else {
						System.out.println("Saldo insuficiente para realizar el retiro.");
					}
				break;
					
				case 3:
					System.out.println("Saldo: "+ cuenta.verSaldo()+ " ("+cuenta.getTipoMoneda()+")");
				break;
					
				case 4:
					cuenta.verCuentaBancaria();
				break;
				
				case 5:
					
					if(cuenta.getTipoMoneda().equals("USD")) {
			            System.out.println("El tipo de moneda ya se encuentra en USD.");
					}else {

				        // Convertir saldo en dólares
				        CuentaEnPeso cuentaCL = new CuentaEnPeso(cuenta.verSaldo());
				        cuenta.setSaldo(cuentaCL.convertirMoneda()); 
				        cuenta.setTipoMoneda("USD");
				        System.out.println("Saldo convertido a Dolar: "+ cuenta.verSaldo()+ " ("+cuenta.getTipoMoneda()+")");
					}
				break;
				
				case 6: 
					if(cuenta.getTipoMoneda().equals("CLP")) {
			            System.out.println("El tipo de moneda ya se encuentra en CLP.");
					}else {
						
			            // Convertir saldo  en pesos chilenos
				        CuentaDolar cuentaUSD = new CuentaDolar(cuenta.verSaldo());
						cuenta.setSaldo(cuentaUSD.convertirMoneda());  
			            cuenta.setTipoMoneda("CLP");
			            System.out.println("Saldo convertido a pesos Chilenos: "+ cuenta.verSaldo()+ " ("+cuenta.getTipoMoneda()+")");
					}
				break;
	
					
				default:
					System.out.println("Opcion inválida, favor intente nuevamente");
				break;
			
			}
			
    	} while (opc != 0);

    	scanner.close();
		
	}

}
