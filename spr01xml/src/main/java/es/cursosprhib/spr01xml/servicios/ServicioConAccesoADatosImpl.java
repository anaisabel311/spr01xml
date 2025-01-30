package es.cursosprhib.spr01xml.servicios;

import es.cursosprhib.spr01xml.persistencia.ClienteDAO;

public class ServicioConAccesoADatosImpl implements ServicioConAccesoADatos {
	
	
	private ClienteDAO cDAO;

	@Override
	public void realizaConsulta() {
		System.out.println("Método de negocio invocando al DAO");
		cDAO.consulta();
		
		
	}

	@Override
	public ClienteDAO getClienteDAO() {
		
		return this.cDAO;
	}

	@Override
	public void setClienteDAO(ClienteDAO cDAO) {
		
		this.cDAO = cDAO;
		
	}
	
	

}
