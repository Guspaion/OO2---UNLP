package ar.edu.info.unlp.ejercicio14;

public class Inmueble extends Prestamo {
	private String direccion;
	private double superficie;
	
	public Inmueble(double costo, String direccion, double superficie) {
		super(costo, 0.2);
		this.direccion = direccion;
		this.superficie = superficie;
	}

	@Override
	protected double getCosto() {
		return (super.getCosto() * this.superficie);
	}
}
