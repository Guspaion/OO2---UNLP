package ar.edu.info.unlp.ejercicio2b;

public class Jugador {
	private int puntuacion;
	private String nombre;
	private String apellido;

	public Jugador(String nombre, String apellido, int puntos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntuacion = puntos;
	}
	
	private void incrementarPuntos() {
		this.puntuacion += 100;
	}
	
	private void decrementarPuntos() {
		this.puntuacion -= 50;
	}
}