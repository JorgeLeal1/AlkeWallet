package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cliente;

public class ClienteTest {
	Cliente cliente;
	
    @BeforeEach
    void setup() {
        //String nombre, String rut, int nroCuenta
		cliente = new Cliente("Jorge", "16330225-k", 16330225);

       //  System.out.println("Iniciando un test.");
    }
    
    @Test
    void testGetSaldo() {
        assertEquals(16330225, cliente.getNroCuenta(), "El numero de cuenta es 16330225");
    }

}
