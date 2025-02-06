package es.cursosprhib.spr01xml.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.cursosprhib.spr01xml.config.A01Config;
import es.cursosprhib.spr01xml.servicios.Servicio01;

public class Test01 {

	public static void main(String[] args) {
		BeanFactory ctx = new AnnotationConfigApplicationContext(A01Config.class);//Spring lee la clase de configurarion indicado y crea todo el contexto.
		
		/*
		 * Servicio01 s = ctx.getBean ("s01", Servicio01.class); s.m1();
		 * s.setDescription("Mi primer bean");
		 */
		
		Servicio01 sNuevo = ctx.getBean("s01", Servicio01.class);
		System.out.println(sNuevo.getDescription());
		
		
	}

}
