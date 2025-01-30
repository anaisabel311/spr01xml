package es.cursosprhib.spr01xml.servicios;

public class FactoriaServicio01Instancia {
	
	public Servicio01 getInstance() {
		System.out.println("Creando servicio por factoria Instancia");
		return new Servicio01Impl();
	}

}
