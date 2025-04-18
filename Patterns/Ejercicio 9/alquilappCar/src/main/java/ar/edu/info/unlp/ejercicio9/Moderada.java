package ar.edu.info.unlp.ejercicio9;

public class Moderada implements PoliticaReembolso {
	public Moderada() {
		
	}

	@Override
	public double montoAReembolsar(Reserva reserva) {
		return reserva.reembolsoMitad();
	}
}
