package ar.edu.info.unlp.parcialTareista;

import ar.edu.info.unlp.parcialMeteorologico.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAvance {
	private Tarea TPrincipal;
	private Tarea subTCompleja;
	private Tarea subT1;
	private Tarea subT2;
	private Tarea subT3;
	private Tarea subT4;
	
	@BeforeEach
	void setUp() {
		this.TPrincipal = new TareaCompleja("preparar almuerzo", "desc. tarea principal");
		this.subTCompleja = new TareaCompleja("realizar compras", "desc. subtarea compleja");
		this.subT1 = new TareaSimple("ir al supermercado", "desc. subtarea 1", 3);
		this.subT2 = new TareaSimple("ir a la verduleria", "desc. subtarea 2", 1);
		this.subT3 = new TareaSimple("cocinar", "desc. subtarea 3", 2);
		this.subT4 = new TareaSimple("preparar la mesa", "desc.subtarea 3", 1);
		this.TPrincipal.add(subTCompleja);
		this.TPrincipal.add(subT3);
		this.TPrincipal.add(subT4);
		this.subTCompleja.add(subT1);
		this.subTCompleja.add(subT2);
		this.subTCompleja.iniciarTarea(); this.subTCompleja.finalizarTarea();
		this.subT3.iniciarTarea();
	}
	
	@Test
	void testAvance() {
		assertEquals(0.43, Math.round(this.TPrincipal.getAvance()));
	}
}
