package main;

import vista.BancoVistaImpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import vista.BancoVista;

public class Main {
	public static void main(String[] args) {
		
		BeanFactory ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		BancoVista bancoVista = ctx.getBean(BancoVista.class);
		bancoVista.iniciarAplicacion();
	}
}
