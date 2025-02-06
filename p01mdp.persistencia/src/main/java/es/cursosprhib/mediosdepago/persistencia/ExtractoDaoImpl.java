package es.cursosprhib.mediosdepago.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.cursosprhib.mediosdepago.modelo.Cuenta;
import es.cursosprhib.mediosdepago.modelo.Extracto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@Repository
public class ExtractoDaoImpl implements ExtractoDao {
	
	private EntityManagerFactory emf; // para la conexión con la bbdd
	private EntityManager em;
	
//Constructor
	@Autowired
	public ExtractoDaoImpl (EntityManagerFactory emf) {
		this.emf = emf;	
	}

	@Override
	public Extracto findExtracto(Cuenta cuenta, int anyo, int mes) {
		em=emf.createEntityManager();
		Extracto resu;
		String jpql ="select e from Extracto e"
						+ "join fetch e.movimientos m"
						+ "join fetch m.tipo tm"
						+ "join fetch e.cuenta c"
						+ "join fetch c.tarjetas t"
						+ "where e.cuenta = :cuenta and e.anyo and e.mes = :mes";
						
		TypedQuery<Extracto> q= em.createQuery(jpql, Extracto.class);
		q.setParameter("cuenta", cuenta);
		q.setParameter("anyo", anyo);
		q.setParameter("mes", mes);
		try {
			resu = q.getSingleResult();
		}catch (NoResultException e) {
			resu = null;
		}
		
		em.close();
		return resu;

	}
	

}
