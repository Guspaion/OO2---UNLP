package ar.edu.info.unlp.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecodificador {
	private Decodificador decod;
	private Pelicula p1;
	private Pelicula p2;
	private Pelicula p3;
	private Pelicula p4;
	private Pelicula p5;
	private CriterioSugerencia criterioInicial;
	List<Pelicula> listaEsperada;
	
	@BeforeEach
	void setUp() {
		this.criterioInicial = new SugerenciaNovedad();
		this.decod = new Decodificador(criterioInicial);
		p1 = new Pelicula("Trombosis 5", 2021, 2.73);
		p2 = new Pelicula("Porko Tiliano: El Regreso", 2023, 5.62);
		p3 = new Pelicula("Corruptor 2", 1998, 7.21);
		p4 = new Pelicula("El Eternauta", 2003, 9.21);
		p5 = new Pelicula("Mambru: La Gran Guerra", 2001, 8.31);
		p1.agregarSimilar(p3);
		p2.agregarSimilar(p4);
		decod.agregarPelicula(p1);
		decod.agregarPelicula(p2);
		decod.agregarPelicula(p3);
		decod.agregarPelicula(p4);
		decod.agregarPelicula(p5);
		decod.reproducirPelicula(p1);
		decod.reproducirPelicula(p5);
		this.listaEsperada = new LinkedList<Pelicula>();
	}
	
	@Test
	void testSugerenciaNovedad() {
		listaEsperada.add(p2);
		listaEsperada.add(p1);
		listaEsperada.add(p4);
		assertTrue(listaEsperada.equals(this.decod.sugerirPeliculas()));
	}
	
	@Test
	void testSugerenciaSimilaridad() {
		CriterioSugerencia nuevoCriterio = new SugerenciaSimilaridad();
		this.decod.setCriterio(nuevoCriterio);
		listaEsperada.add(p3);
		assertTrue(listaEsperada.equals(this.decod.sugerirPeliculas()));
	}
	
	@Test
	void testSugerenciaPuntaje() {
		CriterioSugerencia nuevoCriterio = new SugerenciaPuntaje();
		this.decod.setCriterio(nuevoCriterio);
		listaEsperada.add(p4);
		listaEsperada.add(p5);
		listaEsperada.add(p3);
		assertTrue(listaEsperada.equals(this.decod.sugerirPeliculas()));
	}
}
