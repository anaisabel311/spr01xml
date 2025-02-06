package es.cursosprhib.mediosdepago.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.cursosprhib.mediosdepago.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

@Repository
public class ClienteDaoImpl implements ClienteDao{
	
	private EntityManagerFactory emf; // para la conexión con la bbdd
	private EntityManager em;
	
	//Constructor
	
		@Autowired
		public ClienteDaoImpl (EntityManagerFactory emf) {
			this.emf = emf;	
		}

		
	
	@Override
	public List<Cliente> findAll() {
		em=emf.createEntityManager();
		List<Cliente> resu;
		String jpql ="select c from Cliente c";
		TypedQuery<Cliente> q= em.createQuery(jpql, Cliente.class);
		resu = q.getResultList();
		em.close();
		return resu;
	}

	@Override
	public List<Cliente> findByNombre(String nombre) {
		em=emf.createEntityManager();
		List<Cliente> resu;
		String jpql ="select c from Cliente c where c.nombre like :nom or c.apellido1 like :nom or c.apellido2 like :nom";
		TypedQuery<Cliente> q= em.createQuery(jpql, Cliente.class);
		q.setParameter ("nom", "%" + nombre + "%");
		resu = q.getResultList();
		em.close();
		return resu;
		
	}

	@Override
	public Cliente findByIdEager(Integer id) {
		em=emf.createEntityManager();
		Cliente resu;
		String jpql ="select c from Cliente c left join fetch c.cuentas where c.idPersona = :id";
		TypedQuery<Cliente> q= em.createQuery(jpql, Cliente.class);
		q.setParameter("id", id);
		try {
			resu = q.getSingleResult();
		}catch (NoResultException e) {
			resu = null;
		}
		
		em.close();
		return resu;

	}
	
	
	

}
