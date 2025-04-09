package ar.edu.info.unlp.ejercicio2a;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private double sueldoBasico;
	
	public Empleado(String nom, String ape, double sueldoBasico, double descuento) {
		this.nombre = nom;
		this.apellido = ape;
		this.sueldoBasico = sueldoBasico;
	}
	
	protected double getSueldoBase(double descuentoBase) {
		return(this.sueldoBasico * (1 - descuentoBase));
	}
}
