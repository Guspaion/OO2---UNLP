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
		double adicional = super.adicionalPorHijo();
		if(super.esCasado()) {
			adicional += 2000;
		}
		return adicional;
	}
}
