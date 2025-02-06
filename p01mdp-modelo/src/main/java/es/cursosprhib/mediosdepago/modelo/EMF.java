package es.cursosprhib.mediosdepago.modelo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*/
Patron Singleton
/*/


public class EMF {
	
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getInstance() {
		
		
		if (emf == null){
				emf = Persistence.createEntityManagerFactory("conexion");
		}
	
		return emf;
}
}