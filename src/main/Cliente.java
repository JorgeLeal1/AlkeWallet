package main;

public class Cliente extends Persona {
	private int nroCuenta;

    // Constructor
    // ---------------------------------------------
	public Cliente(String nombre, String rut, int nroCuenta) {
		super(nombre, rut);
		this.nroCuenta = nroCuenta;
	}

    // Metodos GET, SET
    // ---------------------------------------------
	
	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}



}