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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Contacto2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	public final StringExpression rut;
	public final StringExpression direccion;
	public final IntegerExpression sexo;
	
	public Contacto2DetachedCriteria() {
		super(orm.Contacto2.class, orm.Contacto2Criteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		sexo = new IntegerExpression("sexo", this.getDetachedCriteria());
	}
	
	public Contacto2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Contacto2Criteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		sexo = new IntegerExpression("sexo", this.getDetachedCriteria());
	}
	
	public Contacto2 uniqueContacto2(PersistentSession session) {
		return (Contacto2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto2[] listContacto2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto2[]) list.toArray(new Contacto2[list.size()]);
	}
}

