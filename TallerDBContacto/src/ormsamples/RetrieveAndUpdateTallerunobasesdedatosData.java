/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTallerunobasesdedatosData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.TallerunobasesdedatosPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto2 lormContacto2 = orm.Contacto2DAO.loadContacto2ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Contacto2DAO.save(lormContacto2);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto2 by Contacto2Criteria");
		orm.Contacto2Criteria lormContacto2Criteria = new orm.Contacto2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContacto2Criteria.uid.eq();
		System.out.println(lormContacto2Criteria.uniqueContacto2());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTallerunobasesdedatosData retrieveAndUpdateTallerunobasesdedatosData = new RetrieveAndUpdateTallerunobasesdedatosData();
			try {
				retrieveAndUpdateTallerunobasesdedatosData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTallerunobasesdedatosData.retrieveByCriteria();
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
