package Junit;

import static org.junit.Assert.*;
import contacto.Contacto;

import org.junit.Test;

public class ContactoTest {

	@Test
	public void testAgregarContacto() {
		Contacto a = new Contacto("Henry","Gatica","henry@hotmail.com","+56968287900","178459864","laguna salada",1);
		String resultado = Contacto.agregarContacto(a);
		assertTrue(resultado=="Contacto ingresado exitosamente");
	}

//	@Test
//	public void testEditarContacto() {
//		Contacto a = new Contacto("Henry","Gatica","henry@hotmail.com","+56968287900","178459864","laguna salada",0);
//		String resultado = Contacto.editarContacto(a);
//		assertTrue(resultado=="contacto editado");
//	}

	
//	@Test
//	public void testEliminarContacto() {
//		String resultado = Contacto.eliminarContacto("178459864");
//		assertTrue(resultado=="contacto eliminado");
//	}

}
