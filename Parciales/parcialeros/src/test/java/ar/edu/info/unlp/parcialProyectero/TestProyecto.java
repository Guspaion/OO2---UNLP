package ar.edu.info.unlp.parcialProyectero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProyecto {
	private Proyecto p;
	
	@BeforeEach
	void setUp() {
		this.p = new Proyecto("Vacaciones con amiguis", "Salir con amigos", 3, 2000);
		this.p.setEstado(new EnEvaluacion());
	}
	
	@Test
	void testProyecto() {
		this.p.aprobarEtapa();
		assertEquals("Completada", this.p.getNombreEstado());
	}
}
