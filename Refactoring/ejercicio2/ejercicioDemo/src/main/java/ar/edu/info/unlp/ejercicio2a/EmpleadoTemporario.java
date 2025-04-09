package ar.edu.info.unlp.ejercicio2a;

public class EmpleadoTemporario extends EmpleadoContratado {
	private double horasTrabajadas;

	public EmpleadoTemporario(String nom, String ape, double sueldoBasico, double descuento, double hrs, int cantHijos) {
		super(nom, ape, sueldoBasico, descuento, cantHijos);
		this.horasTrabajadas = hrs;
	}
	
	public double getSueldoTotal(int bonoPorHoras) {
		return (super.getSueldoBase(500)
				+ this.horasTrabajadas * bonoPorHoras);
	}
}
