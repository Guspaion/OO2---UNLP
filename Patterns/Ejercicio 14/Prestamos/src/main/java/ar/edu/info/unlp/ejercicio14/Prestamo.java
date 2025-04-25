package ar.edu.info.unlp.ejercicio14;

public abstract class Prestamo {
	private double costo;
	private double liquidez;
	
	public Prestamo() {
		
	}
	
	public Prestamo(double costo, double liquidez) {
		this.costo = costo;
		this.liquidez = liquidez;
	}
	
	protected double getCosto() {
		return this.costo;
	}
	
	public double getValorPrendario() {
		return this.getCosto() * this.liquidez;
	}
	
	public void agregarPrestamo(Prestamo p) {
		
	}
	
	public void quitarPrestamo(Prestamo p) {
		
	}
}
