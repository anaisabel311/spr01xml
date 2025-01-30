package es.cursosprhib.spr01xml.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.cursosprhib.spr01xml.servicios.Servicio01;
import es.cursosprhib.spr01xml.servicios.ServicioPrincipal;

public class Test02 {

	public static void main(String[] args) {
		BeanFactory ctx = new ClassPathXmlApplicationContext("a01appContext02.xml");//Spring lee el xml indicado y crea todo el contexto.
		
		
		ServicioPrincipal sp = ctx.getBean("sPrincipal", ServicioPrincipal.class);
		sp.metodoServicio();
		
		
	}

}
