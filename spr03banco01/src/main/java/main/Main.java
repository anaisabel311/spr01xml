package main;

import vista.BancoVistaImpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vista.BancoVista;

public class Main {
	public static void main(String[] args) {
		
		BeanFactory ctx= new ClassPathXmlApplicationContext("a03BancoApplicationContext.xml");
		
		BancoVista bancoVista = ctx.getBean(BancoVista.class);
		bancoVista.iniciarAplicacion();
	}
}
