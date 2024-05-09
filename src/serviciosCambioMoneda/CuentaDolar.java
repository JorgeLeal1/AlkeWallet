package serviciosCambioMoneda;
import main.CambioMoneda;

public class CuentaDolar extends CambioMoneda {
	
	public CuentaDolar( double saldo) {
		super(saldo);
	}

    // Metodos @
    // ---------------------------------------------
    @Override
    public double getFactorConversion() {
        return  938; 
    }
	
	// Método para convertir dolares a pesos chilenos
	@Override
	public double convertirMoneda() {
		//System.out.println(getSaldo());
		//System.out.println(this.getFactorConversion());
		
		return getSaldo() * this.getFactorConversion();
	}
	 
	 
}