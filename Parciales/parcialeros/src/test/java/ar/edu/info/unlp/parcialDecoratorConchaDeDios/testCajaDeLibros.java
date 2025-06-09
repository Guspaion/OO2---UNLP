package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testCajaDeLibros {
	private EnvioPaquete pBase;
	private EnvioPaquete seguro;
	private EnvioPaquete entregaExpres;
	
	@BeforeEach
	void setUp() {
		this.pBase = new Paquete("Caja de libros", "John Silver", "1847 Lexington Avenue, New York, NY 10029", 20000);
		this.seguro = new ConSeguro(pBase);
		this.entregaExpres = new EntregaExpres(seguro);
	}
	
	@Test
	void testDescripcion() {
		assertEquals("Caja de libros con seguro - Entrega Expréss", this.entregaExpres.getDescripcion());
	}
	
	@Test
	void testCostoEnvio() {
		assertEquals(15000, this.entregaExpres.getCostoEnvio());
	}
}
