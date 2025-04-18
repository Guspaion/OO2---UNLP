package ar.edu.info.unlp.ejercicio9;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlaza;
	private String marca;
	
	public AutoEnAlquiler(double precioPorDia, int cantPlaza, String marca) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlaza = cantPlaza;
		this.marca = marca;
	}
	
	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
}
