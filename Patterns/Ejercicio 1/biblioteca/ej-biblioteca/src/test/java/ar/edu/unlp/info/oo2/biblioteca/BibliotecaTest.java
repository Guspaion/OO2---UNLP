package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca biblioteca;
	Socio socio1;
	Socio socio2;
	VoorheesExporter adapter;
	
	@BeforeEach
	void setUp() {
		this.adapter = new ExporterAdapter();
		this.biblioteca = new Biblioteca();
		this.socio1 = new Socio("Porko Tiliano", "porkoporkins@gmail.com", "777");
		this.socio2 = new Socio("Forro del Uma", "forruma@gmail.es", "1515");
		this.biblioteca.agregarSocio(socio1);
		this.biblioteca.agregarSocio(socio2);
		this.biblioteca.setExporter(adapter);
	}
	
	@Test
	void testExporter() {
		String sociosExportados = this.biblioteca.exportarSocios();
		System.out.print(sociosExportados);
		assertTrue(sociosExportados.contains("Porko Tiliano"));
		assertTrue(sociosExportados.contains("porkoporkins@gmail.com"));
		assertTrue(sociosExportados.contains("777"));
		assertTrue(sociosExportados.contains("Forro del Uma"));  // 😒
		assertTrue(sociosExportados.contains("forruma@gmail.es"));
		assertTrue(sociosExportados.contains("1515"));
	}

}
