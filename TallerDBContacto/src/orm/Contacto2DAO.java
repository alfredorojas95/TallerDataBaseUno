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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Contacto2DAO {
	public static Contacto2 loadContacto2ByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return loadContacto2ByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 getContacto2ByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return getContacto2ByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return loadContacto2ByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 getContacto2ByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return getContacto2ByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Contacto2) session.load(orm.Contacto2.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 getContacto2ByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Contacto2) session.get(orm.Contacto2.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contacto2) session.load(orm.Contacto2.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 getContacto2ByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contacto2) session.get(orm.Contacto2.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return queryContacto2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return queryContacto2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2[] listContacto2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return listContacto2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2[] listContacto2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return listContacto2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto2 as Contacto2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto2 as Contacto2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contacto2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2[] listContacto2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContacto2(session, condition, orderBy);
			return (Contacto2[]) list.toArray(new Contacto2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2[] listContacto2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContacto2(session, condition, orderBy, lockMode);
			return (Contacto2[]) list.toArray(new Contacto2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return loadContacto2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return loadContacto2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contacto2[] contacto2s = listContacto2ByQuery(session, condition, orderBy);
		if (contacto2s != null && contacto2s.length > 0)
			return contacto2s[0];
		else
			return null;
	}
	
	public static Contacto2 loadContacto2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contacto2[] contacto2s = listContacto2ByQuery(session, condition, orderBy, lockMode);
		if (contacto2s != null && contacto2s.length > 0)
			return contacto2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContacto2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return iterateContacto2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContacto2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TallerunobasesdedatosPersistentManager.instance().getSession();
			return iterateContacto2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContacto2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto2 as Contacto2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContacto2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto2 as Contacto2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contacto2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 createContacto2() {
		return new orm.Contacto2();
	}
	
	public static boolean save(orm.Contacto2 contacto2) throws PersistentException {
		try {
			orm.TallerunobasesdedatosPersistentManager.instance().saveObject(contacto2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Contacto2 contacto2) throws PersistentException {
		try {
			orm.TallerunobasesdedatosPersistentManager.instance().deleteObject(contacto2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Contacto2 contacto2) throws PersistentException {
		try {
			orm.TallerunobasesdedatosPersistentManager.instance().getSession().refresh(contacto2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Contacto2 contacto2) throws PersistentException {
		try {
			orm.TallerunobasesdedatosPersistentManager.instance().getSession().evict(contacto2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto2 loadContacto2ByCriteria(Contacto2Criteria contacto2Criteria) {
		Contacto2[] contacto2s = listContacto2ByCriteria(contacto2Criteria);
		if(contacto2s == null || contacto2s.length == 0) {
			return null;
		}
		return contacto2s[0];
	}
	
	public static Contacto2[] listContacto2ByCriteria(Contacto2Criteria contacto2Criteria) {
		return contacto2Criteria.listContacto2();
	}
}
