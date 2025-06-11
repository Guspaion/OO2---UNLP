package ar.edu.info.unlp.parcialExcursionista;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class TestParana {
	private Excursion e;
	private Usuario u1;
	private Usuario u2;
	private Usuario u3;
	
	@BeforeEach
	void setUp() {
		this.e = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now().plusDays(4),
								LocalDate.now().plusDays(10), "Porko Dio", 20000, 1, 2);
		this.u1 = new Usuario("Porkins", "the Tilian", "porkoTheMostTilian01@gmail.com");
		this.u2 = new Usuario("Chadlentain", "Volatil", "volatility@gmail.com");
		this.u3 = new Usuario("Edgar", "Edgardius", "info_dick_master@gmail.com");
		this.e.añadirInscripto(u1);
		this.e.añadirInscripto(u2);
	}
	
	@Test
	void testAñadirUsuario() {
		this.e.añadirInscripto(u3);
		assertTrue(this.e.getListaEspera().contains(u3));
	}
	
	@Test
	void testInformación() {
		String esperado = "Dos días en kayak bajando el Paraná; 20000; " + LocalDate.now().plusDays(4) + "; "
				+ LocalDate.now().plusDays(10) + "; Porko Dio";
		assertEquals(this.e.getInformacion(), esperado);
	}
}
