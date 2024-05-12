package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CuentaBancaria;
import main.Cliente;

public class CuentaBancariaTest {

	CuentaBancaria cuenta;
	Cliente cliente;
	
	/*
	 * @BeforeEach: Esta anotación se utiliza para marcar un método que se ejecuta
	 * antes de cada prueba. Puedes usarlo para realizar configuraciones
	 * o inicializaciones necesarias antes de cada prueba.
	*/
    @BeforeEach
    void setup() {
        //String nombre, String rut, int nroCuenta
		cliente = new Cliente("Jorge", "16330225-k", 16330225);
		//Saldo, cliente
		cuenta = new CuentaBancaria(0,cliente);
		cuenta.setSaldo(50000);
		cuenta.setTipoMoneda("CLP");
		 
       //  System.out.println("Iniciando un test.");
    }
	
	@Test
	public void testVerCuentaBancaria() {
		cuenta.verCuentaBancaria();
	}
	
	@Test
	public void testVerSaldo() {
		cuenta.verSaldo();
	}
	
    @Test
    void testGetSaldo() {
        assertEquals(50000, cuenta.getSaldo(), "El saldo debe ser 50000");
    }
    
    @Test
    void testGetTipoMoneda() {
        assertEquals("CLP", cuenta.getTipoMoneda(), "El tipo de moneda es CLP");
    }
    
	
	@Test
	public void testDepositar() {
		cuenta.depositar(100);
		assertEquals(50100, cuenta.getSaldo(), "El saldo después de depostiar es 50100");
		
        assertTrue(cuenta.depositar(100));
        assertFalse(cuenta.depositar(-100));
	
	}

	@Test
	public void testRetirar() {
		cuenta.depositar(300);
		cuenta.retirar(100);
		assertEquals(50200, cuenta.getSaldo(), "El saldo después de depostiar es 50200");
	
        assertTrue(cuenta.retirar(100));
        assertFalse(cuenta.retirar(-100000000));
	}
	
}
