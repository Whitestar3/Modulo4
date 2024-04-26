package billeteraVirtual;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    protected int idUsuario;
    protected String nombreUsuario;
    protected String apellidosUsuario;
    protected String correoElectronico;
    protected String contrasena;
    protected List<Cuenta> cuenta; // Lista de cuentas del usuario
    protected Cuenta cuentaActiva;

    // Constructor para inicializar los atributos
    public Usuario(int idUsuario, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.cuenta = new ArrayList<>(); // Inicializar la lista de cuentas vacía
        cuentaActiva = null; //inicializamos este valor en vacio, porque queremos verificar que tiene algo el usuario
    }
    
    
    

    public  Usuario( String nombreUsuario, String contrasena) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
	}




	// Métodos para agregar y eliminar cuentas
    public void agregarCuenta(Cuenta cuenta) {
        this.cuenta.add(cuenta);
    }

    public void eliminarCuenta(Cuenta cuenta) {
        this.cuenta.remove(cuenta);
    }

    
    // Método para obtener la lista de cuentas que me lo pide el main 
    public List<Cuenta> getCuenta() {
        return cuenta;
    }
  
//declaracion de cuenta su get para verificar si esta activa o no
    public Cuenta getCuentaActiva() {
        if (cuentaActiva != null) { //aqui verificamos si la cuenta existe o no (!= ESO ES NO ES IGUAL A )
            return cuentaActiva; //si se cumple me muestra la cuenta activa
        } else {
            return null; // Si no se cumple me muestra que no existe cuenta.
        }
    }

    // Métodos para obtener información de las cuentas
    public Cuenta obtenerCuentaCorriente() {
        if (cuenta != null && !cuenta.isEmpty()) {
            for (Cuenta cuenta : cuenta) {
                if (cuenta.getTipoCuenta().equals("Corriente")) {
                    return cuenta;
                }
            }
        }
        return null; // No se encontró la cuenta corriente
    }

    public Cuenta obtenerCuentaAhorro() {
        for (Cuenta cuenta : cuenta) {
            if (cuenta.getTipoCuenta().equals("Ahorro")) { //equals se usa para que lea mi String y lo entienda.
                return cuenta;
            }
        }
        return null; // No se encontró la cuenta de ahorro
    }

    public Cuenta obtenerCuentaMonedaInternacional() {
        for (Cuenta cuenta : cuenta) {
            if (cuenta.getTipoCuenta().equals("Moneda Internacional")) { //equals se usa para que lea mi String y lo entienda.
                return cuenta;
            }
        }
        return null; // No se encontró la cuenta en moneda internacional
    }

    // Getters and setters para acceder y modificar los atributos
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
 // Método para obtener la lista de contactos del usuario
    public List<Contacto> getContactoList() {
        // Lógica para obtener la lista de contactos del usuario
        // Por ejemplo, podrías acceder a una lista de contactos que tenga el usuario
        return getContactoList();
    }
    
    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", apellidosUsuario='" + apellidosUsuario + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", cuentas=" + cuenta +
                '}';
    }

}

	