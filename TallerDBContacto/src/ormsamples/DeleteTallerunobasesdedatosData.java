/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteTallerunobasesdedatosData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerunobasesdedatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto2 lormContacto2 = orm.Contacto2DAO.loadContacto2ByQuery(null, null);
			// Delete the persistent object
			orm.Contacto2DAO.delete(lormContacto2);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTallerunobasesdedatosData deleteTallerunobasesdedatosData = new DeleteTallerunobasesdedatosData();
			try {
				deleteTallerunobasesdedatosData.deleteTestData();
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
