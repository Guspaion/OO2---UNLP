package ar.edu.info.unlp.ejercicio9;

public class Flexible implements PoliticaReembolso {
	public Flexible() {
		
	}
	
	@Override
	public double montoAReembolsar(Reserva reserva) {
		return(reserva.reembolsoTotal());
	}
}
