package es.cursosprhib.spr01xml.servicios;

import es.cursosprhib.spr01xml.persistencia.ClienteDAO;

public interface ServicioConAccesoADatos {
	
	public void realizaConsulta();
	
	public ClienteDAO getClienteDAO();
	
	public void setClienteDAO (ClienteDAO cDAO);
	
	

}
