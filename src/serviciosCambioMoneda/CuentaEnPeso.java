package serviciosCambioMoneda;

import main.CambioMoneda;

public class CuentaEnPeso extends CambioMoneda {
	
	public CuentaEnPeso( double saldo) {
		super( saldo);
	}
	
    // Metodos @
    // ---------------------------------------------
    @Override
    public double getFactorConversion() {
        return 938;
    }
	

	// Método para convertir saldo a dólares
	@Override
	public double convertirMoneda() {
		//System.out.println(getSaldo());
		//System.out.println(this.getFactorConversion());
		return getSaldo() / this.getFactorConversion();// saldo / 938, 1convertir a dolar
	}

}
