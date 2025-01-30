package es.cursosprhib.spr01xml.servicios;

public class Servicio01Impl implements Servicio01{
	
	private String descripcion;
	
// CONSTRUCTORES
	
	public Servicio01Impl() {
		System.out.println("Constructor por defecto de Servicio01Impl");
	}

	public Servicio01Impl (String descripcion) {
		this.descripcion=descripcion;
		System.out.println("Constructor Servicio01Impl (String)");
	}
	
	public Servicio01Impl (String descripcion, int num) {
		this.descripcion=descripcion;
		System.out.println(num);
		System.out.println("Constructor Servicio01Impl (String)");
	}
	
	public Servicio01Impl (String descripcion, int num, String description) {
		this.descripcion=descripcion;
		
		System.out.println("Constructor Servicio01Impl (String)");
		System.out.println(num);
		System.out.println("Otro constructor con String, int, String");
	}
	
	@Override
	public void m1() {
		
		
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
