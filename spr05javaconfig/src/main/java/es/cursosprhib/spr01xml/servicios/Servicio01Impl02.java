package es.cursosprhib.spr01xml.servicios;

public class Servicio01Impl02 implements Servicio01 {
	
	private String descripcion;

	@Override
	public void m1() {
		System.out.println("Este método lo hace mucho mejor !!!");
		
	}

	@Override
	public String getDescription() {
		return descripcion;
	}

	@Override
	public void setDescription(String descripcion) {
		this.descripcion = descripcion;
		
	}
	
	

}
