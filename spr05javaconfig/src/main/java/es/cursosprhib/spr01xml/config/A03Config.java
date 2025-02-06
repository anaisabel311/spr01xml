package es.cursosprhib.spr01xml.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import es.cursosprhib.spr01xml.persistencia.ClienteDAO;
import es.cursosprhib.spr01xml.persistencia.ClienteDAOImpl;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatos;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatosImpl;

@Configuration
@Import({A03ConfigProduccion.class, A03ConfigDesarrollo.class})
//@ImportResource ({ficheros.xml}) se puede combinar ficheros de configuración y .xml
public class A03Config {
	
//  @Autowire
//	DataSource ds;
	
	@Bean ("cDAO")
//	@Profile ("xxxxx")
//  public ClienteDato cliDAO (), con el @Autowire	
	public ClienteDAO cliDAO (DataSource ds) {
		return new ClienteDAOImpl (ds);
		
		
	}
	@Bean
	 public ServicioConAccesoADatosImpl neg (ClienteDAO cDAO) {
		 ServicioConAccesoADatosImpl serv = new ServicioConAccesoADatosImpl();
		 serv.setClienteDAO(cDAO);
		 return serv;
		 
	 }
	 

}
