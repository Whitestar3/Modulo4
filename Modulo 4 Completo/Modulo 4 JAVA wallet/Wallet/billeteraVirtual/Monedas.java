package billeteraVirtual;

public class Monedas implements CambioMoneda {

    
	// Atributos de la moneda
    protected int monedaID;
    protected String nombreMoneda;
    protected String simboloMoneda;
    protected Double valorMoneda;
    public static final double pesoChileno = 1.0;
    public static final double dolarEstadounidense = 0.001;
    public static final double euro = 0.00099;

    // Constructor para inicializar los atributos
    public Monedas(int monedaID, String nombreMoneda, String simboloMoneda, Double valorMoneda) {
        this.monedaID = monedaID;
        this.nombreMoneda = nombreMoneda;
        this.simboloMoneda = simboloMoneda;
        this.valorMoneda = valorMoneda;
    }

    // Constructor vacío para crear objetos Moneda sin valores iniciales
    public Monedas(double i) {
        this.monedaID = 0;
        this.nombreMoneda = "";
        this.simboloMoneda = "";
        this.valorMoneda = 1.0; // Valor predeterminado de 1
    }
    
    public void pesoChileno() {
        this.monedaID = 1;
        this.nombreMoneda = "pesoChileno";
        this.simboloMoneda = "$";
        this.valorMoneda = (double) 1; 
    
        }
    
    public void dolarEstadounidense() {
        this.monedaID = 2;
        this.nombreMoneda = "Dolar Estadounidense";
        this.simboloMoneda = "U$";
        this.valorMoneda = (double) 0.0011; 
    
        }
    
    public void euro () {
        this.monedaID = 3;
        this.nombreMoneda = "Euro";
        this.simboloMoneda = "€";
        this.valorMoneda = (double) 0.00099; 
    
        }

    // Métodos para convertir entre monedas (este si que me costo (o.O) )
    public double convertirAPeso(double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Peso Chileno")) {
            return monto * this.valorMoneda / monedaDestino.getValorMoneda();
           
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        }
    }

    public double convertirADolar(double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Dólar Estadounidense")) {
            return
            		monto * this.valorMoneda / monedaDestino.getValorMoneda();
        } else { 
        	/* IllegalArgumentException es un mensaje automatico del sistema que te dice que el argumento es nulo
        	 o esta fuera de rango 
        	THROW es para decir una excepcion de la regla */
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        }
    }

    public double convertirAEuro(double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Euro")) {
            return monto * this.valorMoneda / monedaDestino.getValorMoneda();
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        }
    }

    // Getters and setters para acceder y modificar los atributos
    

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }


    public Double getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(Double valorMoneda) {
		this.valorMoneda = valorMoneda;
	}

	// Implementación de los métodos de la interfaz CambioMoneda con un overrider 
    @Override
    public double convertirAPeso(Double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Peso Chileno")) { //peso chileno
            return monto * this.valorMoneda / monedaDestino.getValorMoneda();
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        } //esto es que en caso que no funcione le diga un mensaje y illegalArgumentException
    }

    @Override
    public double convertirADolar(Double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Dólar Estadounidense")) { //moneda americana 
            return monto * this.valorMoneda / monedaDestino.getValorMoneda();
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        }
    }

    @Override
    public double convertirAEuro(Double monto, Monedas monedaDestino) {
        if (monedaDestino.getNombreMoneda().equals("Euro")) { //con euro
            return monto * this.valorMoneda / monedaDestino.getValorMoneda();
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino.getNombreMoneda());
        }
    }
}
