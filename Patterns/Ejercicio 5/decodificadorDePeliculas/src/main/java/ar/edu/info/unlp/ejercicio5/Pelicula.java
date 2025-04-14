package ar.edu.info.unlp.ejercicio5;

import java.util.Comparator;
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
	
	public void agregarSimilar(Pelicula p) {
		this.pelisSimilares.add(p);
		if(!p.esSimilar(this)) {
			p.agregarSimilar(this);
		}
	}
	
	public boolean esSimilar(Pelicula p) {
		return(pelisSimilares.contains(p));
	}
	
	public Integer getAñoEstreno() {
		return(this.añoEstreno);
	}
	
	public Double getPuntaje() {
		return(this.puntaje);
	}
	
    public static Comparator<Pelicula> porNovedad() {
    	return (p1, p2) -> p2.getAñoEstreno().compareTo(p1.getAñoEstreno());
    }
    
    public static Comparator<Pelicula> porPuntaje() {
    	return (p1, p2) -> p2.getPuntaje().compareTo(p1.getPuntaje());
    }
}