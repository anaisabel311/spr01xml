package es.cursosprhib.spr01xml.servicios;

public class ServicioPrincipal {
	
	private String descripcion;
	private Servicio01 s01;
	
	
	public void metodoServicio () {
		System.out.println("metodoServicio de la clase ServicioPrincipal");
		s01.m1();
		System.out.println(s01.getDescription());
	}
	
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Servicio01 getS01() {
		return s01;
	}

	public void setS01(Servicio01 s01) {
		this.s01 = s01;
	}
	
	

}
