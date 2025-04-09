package ar.edu.info.unlp.ejercicio2;

public class Resultado {
	private Jugada ganadora;
	
	public Resultado(Jugada jugadaGanadora) {
		this.ganadora = jugadaGanadora;
	}
	
	public Resultado() {
		
	}
	
	public Jugada getGanador() {
		return ganadora;
	}
}
