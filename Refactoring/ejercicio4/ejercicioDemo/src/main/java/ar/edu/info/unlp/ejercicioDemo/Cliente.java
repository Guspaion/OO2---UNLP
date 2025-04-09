package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private LocalDate fechaAlta;
	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}
	public int añosDesdeFechaAlta() {
		return(Period.between(this.fechaAlta, LocalDate.now()).getYears());
	}
}
