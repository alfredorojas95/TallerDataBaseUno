/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Contacto2Criteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	public final StringExpression rut;
	public final StringExpression direccion;
	public final IntegerExpression sexo;
	
	public Contacto2Criteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		mail = new StringExpression("mail", this);
		telefono = new StringExpression("telefono", this);
		rut = new StringExpression("rut", this);
		direccion = new StringExpression("direccion", this);
		sexo = new IntegerExpression("sexo", this);
	}
	
	public Contacto2Criteria(PersistentSession session) {
		this(session.createCriteria(Contacto2.class));
	}
	
	public Contacto2Criteria() throws PersistentException {
		this(orm.TallerunobasesdedatosPersistentManager.instance().getSession());
	}
	
	public Contacto2 uniqueContacto2() {
		return (Contacto2) super.uniqueResult();
	}
	
	public Contacto2[] listContacto2() {
		java.util.List list = super.list();
		return (Contacto2[]) list.toArray(new Contacto2[list.size()]);
	}
}

