package ar.edu.info.unlp.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPoliticas {
	private AutoEnAlquiler auto;
	private Usuario user;
	private Reserva reserva;
	
	@BeforeEach
	void setUp() {
		this.auto = new AutoEnAlquiler(100, 4, "Porko Forza");
		this.user = new Usuario("Corvo Tilinao");
		this.reserva = new Reserva(user, auto, 5, LocalDate.now().plusDays(5), new Flexible());
	}
	
	@Test
	void testGrande() {
		System.out.println("Política flexible: "+this.reserva.montoAReembolsar());
		this.reserva.moderada();
		System.out.println("Política moderada: "+this.reserva.montoAReembolsar());
	}
}
