package ar.edu.info.unlp.ejercicio14;

import java.time.LocalDate;
import java.time.Period;

public class Automovil extends Prestamo {
	private int modelo;
	private double kilometraje;
	
	public Automovil(double costo, int modelo, double kms) {
		super(costo, 0.7);
		this.modelo = modelo;
		this.kilometraje = kms;
	}
	
	private int getAntiguedad() {
		return(LocalDate.now().getYear() - this.modelo);
	}

	@Override
	protected double getCosto() {
		double base = super.getCosto();
		return(base - (base * 0.1 * this.getAntiguedad()));
	}
}
