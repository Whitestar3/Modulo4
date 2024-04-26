package billeteraVirtual;

public class Operaciones {

	// Atributos de la operación
	private int idOperacion; // ID de la transferencia numero unico
	private String tipoOperacion; // Estas hace Transferencia o Retiro.
	private double montoOperacion; // Este es el monto de la operacion
	private String fechaOperacion; // esta es la fecha me sirve para el historico
	private int cuentaOrigen; // esta puede ser entre mis cuentas o otro usuario.
	private int cuentaDestino; // esta para Transferencia y Envio de Dinero

	// Constructor para inicializar los atributos.
	public Operaciones(int idOperacion, String tipoOperacion, double montoOperacion, String fechaOperacion,
			int cuentaOrigen, int cuentaDestino) {
		this.idOperacion = idOperacion;
		this.tipoOperacion = tipoOperacion;
		this.montoOperacion = montoOperacion;
		this.fechaOperacion = fechaOperacion;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
	}

	// Métodos para realizar transferencia de retiro o ingreso de dinero.
	public void realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) throws EstayTerriblePato { //aqui agrege Estayterrible pato ya que es la misma alerta.
		if (cuentaOrigen.getSaldo() >= monto && monto > 0) {
			cuentaOrigen.restarSaldo(monto);
			cuentaDestino.sumarSaldo(monto);
			System.out.println("Transferencia realizada con éxito.");
		} else {
			System.out.println("Error al realizar la transferencia: Saldo insuficiente o monto inválido.");
		}
	}
    //metodo para retirar dinero que podria ser sacar en un cajero o algo similar.
	public void realizarRetiro(Cuenta cuentaOrigen, double monto) throws EstayTerriblePato { //aqui agrege Estayterrible pato ya que es la misma alerta.
		if (cuentaOrigen.getSaldo() >= monto && monto > 0) {
			cuentaOrigen.restarSaldo(monto);
			System.out.println("Retiro realizado con éxito.");
		} else {
			System.out.println("Error al realizar el retiro: Saldo insuficiente o monto inválido.");
		}
	}
		
	
	public int getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(int idOperacion) {
		this.idOperacion = idOperacion;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public double getMontoOperacion() {
		return montoOperacion;
	}

	public void setMontoOperacion(double montoOperacion) {
		this.montoOperacion = montoOperacion;
	}

	public String getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public int getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(int cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public int getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(int cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	
	// Método para generar una representación textual de la operacion, tambien porque me dio error sin ella XDDD
    @Override
    public String toString() {
        return "Operaciones{" +
                "idOperacion=" + idOperacion +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", montoOperacion=" + montoOperacion +
                ", fechaOperacion='" + fechaOperacion + '\'' +
                ", cuentaOrigen=" + cuentaOrigen +
                ", cuentaDestino=" + cuentaDestino +
                '}';
    }
}
