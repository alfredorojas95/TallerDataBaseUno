/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateTallerunobasesdedatosDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.TallerunobasesdedatosPersistentManager.instance());
			orm.TallerunobasesdedatosPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
