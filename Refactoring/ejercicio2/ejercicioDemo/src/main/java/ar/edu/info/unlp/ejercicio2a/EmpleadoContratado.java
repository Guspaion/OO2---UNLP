package ar.edu.info.unlp.ejercicio2a;

public class EmpleadoContratado extends Empleado {
	private int cantidadHijos;

	public EmpleadoContratado(String nom, String ape, double sueldoBasico, double descuento, int cantHijos) {
		super(nom, ape, sueldoBasico, descuento);
		this.cantidadHijos = cantHijos;
	}
	
	protected double getSueldoBase(int bonoPorHijos) {
		return(super.getSueldoBase(0.13) + this.cantidadHijos * bonoPorHijos);
	}
}
