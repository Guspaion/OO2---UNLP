package ar.edu.info.unlp.ejercicio5;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Decodificador {
	private CriterioSugerencia criterio;
	private List<Pelicula> grilla;
	private Set<Pelicula> pelisReproducidas;
	
	public Decodificador(CriterioSugerencia criterioInicial) {
		this.criterio = criterioInicial;
		this.pelisReproducidas = new HashSet<Pelicula>();
		this.grilla = new LinkedList<Pelicula>();
	}
	
	public void setCriterio(CriterioSugerencia criterioNuevo) {
		this.criterio = criterioNuevo;
	}
	
	public void agregarPelicula(Pelicula p) {
		this.grilla.add(p);
	}
	
	public void reproducirPelicula(Pelicula p) {
		this.pelisReproducidas.add(p);
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return(this.criterio.sugerirPeliculas(grilla, pelisReproducidas));
	}
}
