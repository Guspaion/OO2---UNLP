package ar.edu.info.unlp.ejercicio2e;

public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	public Direccion(String loc, String calle, String num, String dpto) {
		this.localidad = loc;
		this.calle = calle;
		this.numero = num;
		this.departamento = dpto;
	}
	
	public String getDireccionFormateada() {
		return ((this.localidad) + ", "
				+ (this.calle) + ", "
				+ (this.numero) + ", "
				+ (this.departamento));
	}
}
