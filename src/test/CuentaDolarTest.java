package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import serviciosCambioMoneda.CuentaDolar;

public class CuentaDolarTest {

	CuentaDolar cuentaDolarTest;
	
	/*
	 * @BeforeEach: Esta anotación se utiliza para marcar un método que se ejecuta
	 * antes de cada prueba. Puedes usarlo para realizar configuraciones
	 * o inicializaciones necesarias antes de cada prueba.
	*/
    @BeforeEach
    void setup() {
    	cuentaDolarTest = new CuentaDolar(54.00);
       //  System.out.println("Iniciando un test.");
    }
    
	// Método para convertir dolares a pesos chilenos
    @Test
    void testGetSaldo() {
        assertEquals(50652.0, cuentaDolarTest.convertirMoneda(), "El saldo debe ser 54,00 dolares");
    }
    
    
    
}
