package ar.edu.info.unlp.ejercicio5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad implements CriterioSugerencia {
	public SugerenciaSimilaridad() {
		
	}

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, Set<Pelicula> pelisReproducidas) {
		return grilla.stream()
						.filter(p -> pelisReproducidas.stream().anyMatch(r -> p.esSimilar(r)))
						.sorted(Pelicula.porNovedad())
						.limit(3)
						.collect(Collectors.toList());
	}
}
