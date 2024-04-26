package billeteraVirtual;

public interface CambioMoneda {


	//metodo para convertir peso a dolar y euro.
	
	    double convertirAPeso(Double monto, Monedas monedaDestino);

	    double convertirADolar(Double monto, Monedas monedaDestino);

	    double convertirAEuro(Double monto, Monedas monedaDestino);
	}
	
