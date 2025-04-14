package ar.edu.info.unlp.ejercicio5;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private int añoEstreno;
	private double puntaje;
	private List<Pelicula> pelisSimilares;
	
	public Pelicula(String titulo, int añoEstreno, double puntaje) {
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.puntaje = puntaje;
		this.pelisSimilares = new LinkedList<Pelicula>();
	}
	
	public boolean esSimilar(Pelicula p) {
		return(pelisSimilares.contains(p));
	}
}
