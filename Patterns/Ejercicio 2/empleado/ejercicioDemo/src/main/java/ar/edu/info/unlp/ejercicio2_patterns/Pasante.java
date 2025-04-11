package ar.edu.info.unlp.ejercicio2_patterns;

public class Pasante extends Empleado {
	private int examenesRendidos;
	
	public Pasante(int cantHijos, boolean esCasado,int examenesRendidos) {
		super(cantHijos, esCasado);
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public double sueldoBasico() {
		return 20000;
	}

	@Override
	public double sueldoAdicional() {
		return(2000 * this.examenesRendidos);
	}
}
