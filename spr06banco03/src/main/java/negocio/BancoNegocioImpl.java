package negocio;

import persistencia.BancoDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistencia.BancoDao;

@Service ("pepito")
public class BancoNegocioImpl implements BancoNegocio {
	
	private BancoDao bancoDao;
	
// constructor
	@Autowired
	public BancoNegocioImpl (BancoDao bancoDao) {
		this.bancoDao=bancoDao;
	}

	/*
	 * public BancoNegocioImpl (@Qualifier("DAObean")BancoDao bancoDao) { this.bancoDao=bancoDao; }
	 * 
	 * puedes utilizar la anotación @Qualifier dentro de un constructor, precediendo un 
	 * atributo, ya que no puede preceder a un constructor ni a un método.
	 * 
	 */
	
	/*
	 * public BancoNegocioImpl() { bancoDao = new BancoDaoImpl(); }
	 */
	

	public void transferencia(long dni1, long dni2, double cantidad) {
		bancoDao.actualizaSaldo(dni1, cantidad);
		bancoDao.actualizaSaldo(dni2, -cantidad);
	}

	public BancoDao getBancoDao() {
		return bancoDao;
	}

	public void setBancoDao(BancoDao bancoDao) {
		this.bancoDao = bancoDao;
	}

}
