package billeteraVirtual;

public class Cuenta {

	// atributos de mi Cuenta.
	protected int cuentaId; //numero verificador 
	protected Double saldo;
	protected String tipoCuenta; //corriente; ahorro; internacional
	protected Double tipoMoneda; //dolar;euro;peso


	public Cuenta(int cuentaId, Double saldo) {
		this.cuentaId = cuentaId;
		this.saldo = saldo;
	}

	public Cuenta(int i, String string, double d, Usuario usuario) {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int i, double d, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	// metodo para ver mi saldo en cuenta.
	public Double getSaldo() {
		return saldo;
	}

	// Método para restar saldo a la cuenta
	public void restarSaldo(double monto) throws EstayTerriblePato {
		if (monto <= 0) {
			// esta es una clase en Java ya incorporada que dice que es una excepcion a la regla :O "IllegalArgumentException" 
			throw new IllegalArgumentException("El monto a restar debe ser mayor que 0.");
		}
		// Aqui cree una clase solo para decir no teni plata, eres pobre jajajaja.
		if (monto > saldo) {
			throw new EstayTerriblePato("Saldo insuficiente para realizar la operación.");
		}
		saldo -= monto;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	// metodo para mi operacion que suma al saldo.
	public void sumarSaldo(double monto) {
		if (monto <= 0) { // necesito crear un error en caso de que el monto sea negativo o menor a 0.
			throw new IllegalArgumentException("El monto a depositar debe ser mayor que 0.");
		}
		saldo += monto; // si funciona aqui solo hace que sume el monto + el saldo.
	}

	// generamos para Usuario un get tipo de cuenta para saber que cuenta es la que
	// estamos llamando.
	

	public Double verSaldo() {
		return saldo;
	}

	public int getCuentaId() {
		return cuentaId;
	}

	public void setCuentaId(int cuentaId) {
		this.cuentaId = cuentaId;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public Double getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(Double tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	

}
