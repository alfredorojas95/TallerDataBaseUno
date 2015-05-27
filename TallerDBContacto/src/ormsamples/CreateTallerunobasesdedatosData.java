/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateTallerunobasesdedatosData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerunobasesdedatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto2 lormContacto2 = orm.Contacto2DAO.createContacto2();
			// Initialize the properties of the persistent object here
			orm.Contacto2DAO.save(lormContacto2);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTallerunobasesdedatosData createTallerunobasesdedatosData = new CreateTallerunobasesdedatosData();
			try {
				createTallerunobasesdedatosData.createTestData();
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
