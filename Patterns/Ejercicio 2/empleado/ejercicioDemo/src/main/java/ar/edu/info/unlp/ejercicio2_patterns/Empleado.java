package ar.edu.info.unlp.ejercicio2_patterns;

public abstract class Empleado {
	private int cantidadHijos;
	private boolean esCasado;
	
	public Empleado(int cantHijos, boolean esCasado) {
		this.cantidadHijos = cantHijos;
		this.esCasado = esCasado;
	}
	
	public double sueldo() {
		return(this.sueldoAdicional() + this.sueldoBasico() + this.descuento());
	}
	
	public abstract double sueldoBasico();
	
	public abstract double sueldoAdicional();
	
	public double descuento() {
		return(this.sueldoAdicional() * 0.5 + this.sueldoBasico() * 0.13);
	}
	
	protected boolean esCasado() {
		return(this.esCasado);
	}
	
	protected double adicionalPorHijo() {
		return(this.cantidadHijos * 2000);
	}
}
