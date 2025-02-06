package es.cursosprhib.mediosdepago.test;


import es.cursosprhib.mediosdepago.modelo.Cliente;
import es.cursosprhib.mediosdepago.modelo.EMF;
import jakarta.persistence.EntityManager;

public class MdPTest {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Cliente p=em.find(Cliente.class, 16);
		System.out.println(p);
		
	}

}
