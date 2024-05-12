package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import serviciosCambioMoneda.CuentaEnPeso;

class CuentaEnPesoTest {

	CuentaEnPeso cuentaEnPeso;
	
	/*
	 * @BeforeEach: Esta anotación se utiliza para marcar un método que se ejecuta
	 * antes de cada prueba. Puedes usarlo para realizar configuraciones
	 * o inicializaciones necesarias antes de cada prueba.
	*/
    @BeforeEach
    void setup() {
    	cuentaEnPeso = new CuentaEnPeso(50000);
       //  System.out.println("Iniciando un test.");
    }
    
    // Método para convertir saldo a dólares
    @Test
    void testGetSaldo() {
    	
    	int res = (int) cuentaEnPeso.convertirMoneda();
    	
        assertEquals(53, res, "El saldo debe ser 53,00 dolares");
    }

}
