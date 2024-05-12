package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Main;

class MainTest {
	Main main;
	
	/*
	 * @BeforeEach: Esta anotación se utiliza para marcar un método que se ejecuta
	 * antes de cada prueba. Puedes usarlo para realizar configuraciones
	 * o inicializaciones necesarias antes de cada prueba.
	*/
    @BeforeEach
    void setup() {

       //  System.out.println("Iniciando un test.");
    }
	
	@Test
	public void testVerMenu() {
		main.menu();
	}
	
	@Test
	public void testMain() {
	}
}
