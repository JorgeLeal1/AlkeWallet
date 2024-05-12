package main;

import serviciosCuenta.CuentaDepositar;
import serviciosCuenta.CuentaRetirar;
import serviciosCuenta.CuentaVerSaldo;

public class CuentaBancaria implements  CuentaDepositar, CuentaRetirar, CuentaVerSaldo{
	
	private double saldo;
	private String tipoMoneda;
	
	private Cliente titular;
	
    // Constructor
    // ---------------------------------------------

	
	public CuentaBancaria(double saldo, Cliente titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	// Metodos de la clase
    // ---------------------------------------------
	
	//Muestra por pantalla un resumen de la cuenta bancaria
	public void verCuentaBancaria() {
		System.out.println("N° Cuenta: "+ titular.getNroCuenta());
		System.out.println("Titular:  "+ titular.getRut() +", "+ titular.getNombre());
		System.out.println("Saldo Actual: "+ saldo + " ("+ tipoMoneda +")");
	}
	

    // Metodos GET, SET
    // ---------------------------------------------
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
    // Metodos @
    // ---------------------------------------------
	
	@Override
	public double verSaldo() {
		return saldo;
	}

	@Override
	public boolean retirar(double monto) {
		 if (monto > 0 && this.saldo >= monto) {
			saldo -= monto;
			
			return true;
		} else {
			
			return false;
		}
	}

	@Override
	public boolean depositar(double monto) {
		 if (monto > 0) {
			 saldo += monto;
				return true;
			} else {
				return false;
			}
	}

}