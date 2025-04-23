package ar.edu.info.unlp.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class SistemaOperativoTest {
	private SistemaOperativo SO;
	private Directorio d1;
	private Directorio d2;
	private Directorio dRaiz;
	private FileSystem archivoMasNuevo;
	private FileSystem archivoMasPesado;
	
	@BeforeEach
	void setUp() {
		this.dRaiz = new Directorio("raiz", LocalDate.now().minusYears(2));
		this.d1 = new Directorio("Porkus multicampeon", LocalDate.now().minusMonths(9));
		this.d2 = new Directorio("Temporada 20-21", LocalDate.now().minusMonths(8));
		this.archivoMasNuevo = new Archivo("Accidente del 98", LocalDate.now().minusDays(11), 40);
		this.archivoMasPesado = new Archivo("La Gran Derrota 2", LocalDate.now().minusDays(35), 61);
		this.dRaiz.agregarContenido(new Archivo("un archivo", LocalDate.now().minusDays(32), 20));
		this.dRaiz.agregarContenido(d1);
		this.dRaiz.agregarContenido(d2);
		this.d1.agregarContenido(new Archivo("La Gran Final", LocalDate.now().minusDays(44), 31));
		this.d1.agregarContenido(new Archivo("La Gran Derrota", LocalDate.now().minusDays(41), 41));
		this.d1.agregarContenido(this.archivoMasPesado);
		this.d2.agregarContenido(this.archivoMasNuevo);
		this.SO = new SistemaOperativo(dRaiz);
	}
	
	@Test
	void stringTest() {
		System.out.print(this.SO.listarContenido());
	}
	
	@Test
	void archivoNuevoTest() {
		System.out.println("El archivo mas nuevo es "+this.SO.getArchivoMasNuevo().getNombre());
		assertEquals(this.archivoMasNuevo, this.SO.getArchivoMasNuevo());
	}
	
	@Test
	void archivoPesadoTest() {
		System.out.println("El archivo mas pesado es: "+this.SO.getArchivoMasGrande().getNombre());
		assertEquals(this.archivoMasPesado, this.SO.getArchivoMasGrande());
	}
	
	@Test
	void espacioOcupadoTest() {
		assertEquals(289, this.SO.espacioOcupadoPorFileSystem());
	}
}
