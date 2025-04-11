package ar.edu.info.unlp.ejercicio2_patterns;

public class Temporario extends Empleado {
	private int horasTrabajadas;
	
	public Temporario(int cantHijos, boolean esCasado, int horasTrabajadas) {
		super(cantHijos, esCasado);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double sueldoBasico() {
		return 20000 + horasTrabajadas * 300;
	}

	@Override
	public double sueldoAdicional() {
		// TODO Auto-generated method stub
		return 0;
	}
}
