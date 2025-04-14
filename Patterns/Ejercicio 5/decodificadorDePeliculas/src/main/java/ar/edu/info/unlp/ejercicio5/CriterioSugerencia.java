package ar.edu.info.unlp.ejercicio5;

import java.util.List;
import java.util.Set;

public interface CriterioSugerencia {
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, Set<Pelicula> pelisReproducidas);
}
