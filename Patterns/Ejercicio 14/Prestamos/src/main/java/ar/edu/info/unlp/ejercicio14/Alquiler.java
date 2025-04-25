package ar.edu.info.unlp.ejercicio14;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Prestamo {
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	
	public Alquiler(double costo, LocalDate contratoIni, LocalDate contratoFin) {
		super(costo, 0.9);
		this.comienzoContrato = contratoIni;
		this.finContrato = contratoFin;
	}
	
	private int mesesRestantesDeContrato() {
		return Period.between(this.comienzoContrato, this.finContrato).getMonths();
	}

	@Override
	protected double getCosto() {
		return (super.getCosto() * this.mesesRestantesDeContrato());
	}
}
