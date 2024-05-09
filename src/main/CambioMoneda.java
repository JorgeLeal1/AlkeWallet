package main;

public abstract class  CambioMoneda {
	
	private double saldo;
	
    // Constructor
    // ---------------------------------------------
	public CambioMoneda(double saldo) {
		this.saldo = saldo;
	}
	
    // abstract
    // ---------------------------------------------
	public abstract double convertirMoneda();
	public abstract double getFactorConversion();
	
    // Metodos GET, SET
    // ---------------------------------------------
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
