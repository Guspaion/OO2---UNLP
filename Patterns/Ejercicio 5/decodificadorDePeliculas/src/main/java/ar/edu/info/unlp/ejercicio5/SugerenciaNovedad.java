package ar.edu.info.unlp.ejercicio5;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SugerenciaNovedad implements CriterioSugerencia {
	public SugerenciaNovedad() {
		
	}

	@Override
	public List<Pelicula> sugerirPeliculas(List<Pelicula> grilla, Set<Pelicula> pelisReproducidas) {
		return grilla.stream()
						.sorted(Pelicula.porNovedad())
						.limit(3)
						.collect(Collectors.toList());
	}
}
