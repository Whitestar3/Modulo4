package billeteraVirtual;

import java.util.ArrayList;
import java.util.List;

public class Contacto extends Usuario {

    // Atributos de los contactos
    protected int contactoId;
    protected String nombreC;
    protected String email; // changed parameter name from correoElectronico to email
    protected int rut;
    protected int numeroCuenta;

    // Constructor que hereda atributos de la clase USUARIO
    public Contacto(int idUsuario, String nombreUsuario, String email, int rut, int numeroCuenta) {
        super(idUsuario, nombreUsuario); // Pass the correct parameters to super()
        this.nombreC = nombreC;
        this.email = email; // changed parameter name from correoElectronico to email
        this.rut = rut;
        this.numeroCuenta = numeroCuenta;
    }

    // Método para agregar a un nuevo contacto a la lista de contactos
    public void addContacto(String nombreC, String email, int rut, int numeroCuenta) {
        int newContactoId = generateContactoId(); // Generar un ID de contacto único
        Contacto nuevoContacto = new Contacto(newContactoId, nombreC, email, rut, numeroCuenta); //aqui creamos el contacto
        contactoList.add(nuevoContacto); //aqui lo agregamos
    }

    public Contacto getContactoById(int contactoId) {  //llamamos al contacto.
        for (Contacto contacto : contactoList) {
            if (contacto.contactoId == contactoId) {
                return contacto;
            }
        }
        return null;
    }

    public List<Contacto> getAllContactos() { // llamamos todos los contactos para verlos.
        return contactoList;
    }

    // Método para actualizar un contacto
    public void updateContacto(int contactoId, String nombreC, String email, int rut, int numeroCuenta) {
        Contacto contactoToUpdate = getContactoById(contactoId);
        if (contactoToUpdate != null) {
            contactoToUpdate.nombreC = nombreC;
            contactoToUpdate.email = email; 
            contactoToUpdate.rut = rut;
            contactoToUpdate.numeroCuenta = numeroCuenta;
        }
    }

    // Método para generar un ID de contacto único
    private int nextContactoId = 1000;
// aqui generamos que el numero vaya sumandose osea parte en 1000 el siguiente sera 1001
    private int generateContactoId() {
        return nextContactoId++;
    }

    // Lista de contactos en caso de que necesite llamarla.
    private List<Contacto> contactoList = new ArrayList<>();

	public List<Contacto> getContactoList() {
		return contactoList;
	}

	public void setContactoList(List<Contacto> contactoList) {
		this.contactoList = contactoList;
	}

	public void getEmail() {
	}
	
	public String getNombreC() {
		return nombreC;
	}


	public int getContactoId() {
		return contactoId;
	}

	public void setContactoId(int contactoId) {
		this.contactoId = contactoId;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
//metodo para main contacto que fastidio :/ porque necesito que me devuelva el correo.
	public String getEmailAddress() {
	return email;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
}

