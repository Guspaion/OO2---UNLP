package ar.edu.info.unlp.ejercicio2_patterns;

import java.time.LocalDate;
import java.time.Period;

public class Planta extends Empleado {
	private LocalDate fechaIngreso;

	public Planta(int cantHijos, boolean esCasado) {
		super(cantHijos, esCasado);
		
	}
	
	public int getAntiguedad() {
		return((Period.between(this.fechaIngreso, LocalDate.now())).getYears());
	}

	@Override
	public double sueldoBasico() {
		return 50000;
	}

	@Override
	public double sueldoAdicional() {
		double adicional = super.adicionalPorHijo();
		if(super.esCasado()) {
			adicional += 5000;
		}
		return(adicional + (this.getAntiguedad() * 2000));
	}

}
