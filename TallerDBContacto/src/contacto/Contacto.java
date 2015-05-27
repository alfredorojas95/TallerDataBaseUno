package contacto;


import org.orm.PersistentException;

public class Contacto {

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String rut;
	private String direccion;
	private int sexo;

	public Contacto(String nombre, String apellido, String email,
			String telefono, String rut, String direccion, int sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.rut = rut;
		this.direccion = direccion;
		this.sexo = sexo;
	}

	/**
	 * este método crea un nuevo contacto
	 * @param nuevoContacto
	 * @return
	 */
	public static String agregarContacto(Contacto nuevoContacto) {

		try {
			String condicionContacto = "rut='" + nuevoContacto.getRut() + "'";
			orm.Contacto2 contactoExiste = orm.Contacto2DAO.loadContacto2ByQuery(condicionContacto, null);

			if (contactoExiste == null) {
				
				orm.Contacto2 lormContacto2 = orm.Contacto2DAO.createContacto2();
				
				lormContacto2.setNombre(nuevoContacto.getNombre());
				lormContacto2.setApellido(nuevoContacto.getApellido());
				lormContacto2.setMail(nuevoContacto.getEmail());
				lormContacto2.setTelefono(nuevoContacto.getTelefono());
				lormContacto2.setRut(nuevoContacto.getRut());
				lormContacto2.setDireccion(nuevoContacto.getDireccion());
				lormContacto2.setSexo(nuevoContacto.getSexo());
				
				orm.Contacto2DAO.save(lormContacto2);

				return "Contacto ingresado exitosamente";
			} else {
				return "El contacto ingresado ya existe";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * este método edita un contacto
	 * @param nuevoContacto
	 * @return
	 */
	public static String editarContacto(Contacto nuevoContacto) {
		try {
			String condicionContacto = "rut='" + nuevoContacto.getRut() + "'";
			orm.Contacto2 lormContactoExiste = orm.Contacto2DAO.loadContacto2ByQuery(condicionContacto, null);
			
			if (lormContactoExiste != null) {
				lormContactoExiste.setNombre(nuevoContacto.getNombre());
				lormContactoExiste.setApellido(nuevoContacto.getApellido());
				lormContactoExiste.setMail(nuevoContacto.getEmail());
				lormContactoExiste.setTelefono(nuevoContacto.getTelefono());
				lormContactoExiste.setRut(nuevoContacto.getRut());
				lormContactoExiste.setDireccion(nuevoContacto.getDireccion());
				lormContactoExiste.setSexo(nuevoContacto.getSexo());
				orm.Contacto2DAO.save(lormContactoExiste);
				return "contacto editado";
			} else {
				return "no se puddo editar";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * este metodo elimina un contacto
	 * @param rutContacto
	 * @return
	 */
	public static String eliminarContacto(String rutContacto) {
		try {
			String condicionContacto = "rut='" + rutContacto + "'";
			orm.Contacto2 contactoExiste = orm.Contacto2DAO.loadContacto2ByQuery(condicionContacto, null);
			if (contactoExiste != null) {
				orm.Contacto2DAO.delete(contactoExiste);
				return "contacto eliminado";
			} else {
				return "No se pudo eliminar el contacto";
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Delete the persistent object
		return null;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSexo() {
		return this.sexo;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

}