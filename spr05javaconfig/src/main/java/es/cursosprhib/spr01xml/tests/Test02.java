package es.cursosprhib.spr01xml.tests;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.cursosprhib.spr01xml.config.A02Config;
import es.cursosprhib.spr01xml.servicios.ServicioPrincipal;

public class Test02 {

	public static void main(String[] args) {
		BeanFactory ctx = new AnnotationConfigApplicationContext(A02Config.class);//Spring lee el xml indicado y crea todo el contexto.
		
		
		ServicioPrincipal sp = ctx.getBean("sPrincipal", ServicioPrincipal.class);
		sp.metodoServicio();
		
		
	}

}
