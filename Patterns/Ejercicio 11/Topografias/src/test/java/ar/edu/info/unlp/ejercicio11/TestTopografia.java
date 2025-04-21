package ar.edu.info.unlp.ejercicio11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTopografia {
	private ImagenSatelital imagen;
	private Topografia topografia;
	private Topografia mixta;
	
	@BeforeEach
	void setUp() {
		Topografia mixta = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
		this.topografia = new Mixta(new Agua(), new Tierra(), new Tierra(), mixta);
		this.imagen = new ImagenSatelital(topografia);
	}
	
	@Test
	void testProporcionDeAgua() {
		assertEquals(0.375, this.imagen.calcularProporcionDeAgua());
	}
	
	@Test 
	void testCompararTopografiasIguales(){
		Topografia topografiaClonica = new Mixta(new Agua(), new Tierra(), new Tierra(), mixta);
		assertTrue(this.imagen.compararTopografias(topografiaClonica));
	}
	
	@Test void testCompararTopografiaDistintas() {
		Topografia topografiaDisclonica = new Mixta(new Agua(), new Tierra(), new Tierra(), new Tierra());
		assertTrue(this.imagen.compararTopografias(topografiaDisclonica));
	}
}
