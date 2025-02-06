package es.cursosprhib.spr01xml.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.cursosprhib.spr01xml.config.A02Config;
import es.cursosprhib.spr01xml.config.A03Config;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatos;
import es.cursosprhib.spr01xml.servicios.ServicioPrincipal;

public class Test03 {

	public static void main(String[] args) {
		BeanFactory ctx = new AnnotationConfigApplicationContext(A03Config.class);
		
		
		ServicioConAccesoADatos scio = ctx.getBean(ServicioConAccesoADatos.class);
		scio.realizaConsulta();
		
		
	}

}
