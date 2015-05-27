/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListTallerunobasesdedatosData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto2...");
		orm.Contacto2[] ormContacto2s = orm.Contacto2DAO.listContacto2ByQuery(null, null);
		int length = Math.min(ormContacto2s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContacto2s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto2 by Criteria...");
		orm.Contacto2Criteria lormContacto2Criteria = new orm.Contacto2Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContacto2Criteria.uid.eq();
		lormContacto2Criteria.setMaxResults(ROW_COUNT);
		orm.Contacto2[] ormContacto2s = lormContacto2Criteria.listContacto2();
		int length =ormContacto2s== null ? 0 : Math.min(ormContacto2s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContacto2s[i]);
		}
		System.out.println(length + " Contacto2 record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTallerunobasesdedatosData listTallerunobasesdedatosData = new ListTallerunobasesdedatosData();
			try {
				listTallerunobasesdedatosData.listTestData();
				//listTallerunobasesdedatosData.listByCriteria();
			}
			finally {
				orm.TallerunobasesdedatosPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
