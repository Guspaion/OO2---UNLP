package ar.edu.info.unlp.ejercicio2;

public class Papel implements Jugada {
	
	public Papel() {
		
	}

	@Override
	public Resultado jugarContra(Jugada otraJugada) {
		return(otraJugada.juegaContraPapel(this));
		
	}

	@Override
	public Resultado juegaContraTijera(Jugada otraJugada) {
		Resultado result = new Resultado(otraJugada);
		return result;
	}

	@Override
	public Resultado juegaContraPiedra(Jugada otraJugada) {
		Resultado result = new Resultado(this);
		return result;
	}

	@Override
	public Resultado juegaContraPapel(Jugada otraJugada) {
		Resultado result = new Resultado();
		return result;
	}

	@Override
	public Resultado juegaContraLagarto(Jugada otraJugada) {
		Resultado result = new Resultado(otraJugada);
		return result;
	}

	@Override
	public Resultado juegaContraSpock(Jugada otraJugada) {
		Resultado result = new Resultado(this);
		return result;
	}
}
