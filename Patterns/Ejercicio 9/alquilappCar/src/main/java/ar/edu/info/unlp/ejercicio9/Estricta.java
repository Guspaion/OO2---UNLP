package ar.edu.info.unlp.ejercicio9;

public class Estricta implements PoliticaReembolso {
	public Estricta() {
		
	}

	@Override
	public double montoAReembolsar(Reserva reserva) {
		return 0;
	}
}
