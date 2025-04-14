package ar.edu.info.unlp.ejercicio5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaPuntaje implements CriterioSugerencia {
	public SugerenciaPuntaje() {
		
	}

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, Set<Pelicula> pelisReproducidas) {
		return grilla.stream()
						.sorted(Pelicula.porPuntaje().thenComparing(Pelicula.porNovedad()))
						.limit(3)
						.collect(Collectors.toList());
	}
}
