package ar.edu.info.unlp.ejercicio2;

public interface Jugada {
	public Resultado jugarContra(Jugada otraJugada);
	
	public Resultado juegaContraTijera(Jugada otraJugada);
	
	public Resultado juegaContraPiedra(Jugada otraJugada);
	
	public Resultado juegaContraPapel(Jugada otraJugada);
	
	public Resultado juegaContraLagarto(Jugada otraJugada);
	
	public Resultado juegaContraSpock(Jugada otraJugada);
}
