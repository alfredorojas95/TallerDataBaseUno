package servicio;

import contacto.Contacto;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class ServicioContactoDos {

	/**
	 * Este método agrega un nuevo contacto a la base de datos
	 * @param nuevoContacto
	 * @return
	 */
	public String agregarContacto(Contacto nuevoContacto){
		return Contacto.agregarContacto(nuevoContacto);
	}
	
	/**
	 * Este método edita un contacto existente en la base de datos
	 * @param NuevoContacto
	 * @return
	 */
	public String editarContacto(Contacto NuevoContacto){
		return Contacto.editarContacto(NuevoContacto);
	}
	
	/**
	 * Este método elimina un contacto en la base de datos
	 * @param rutContacto
	 * @return
	 */
	public String eliminarContacto(String rutContacto){
		return Contacto.eliminarContacto(rutContacto);
	}
}
