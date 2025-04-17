package ar.edu.info.unlp.ejercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora calc;
	
	@BeforeEach
	void setUp() {
		this.calc = new Calculadora();
	}
	
	@Test
	void testSuma() {
		this.calc.setValor(8);
		this.calc.setValor(8);
		assertEquals("16.0", this.calc.getResultado());
		this.calc.setValor(4);
		assertEquals("20.0", this.calc.getResultado());
	}
	
	@Test
	void testResta() {
		this.calc.setValor(5);
		this.calc.menos();
		this.calc.setValor(10);
		assertEquals("-5.0", this.calc.getResultado());
		this.calc.setValor(-5);
		assertEquals("0.0", this.calc.getResultado());
	}
	
	@Test
	void testMultiplicacion() {
		this.calc.setValor(2);
		this.calc.por();
		this.calc.setValor(4);
		assertEquals("8.0", this.calc.getResultado());
		this.calc.setValor(10);
		assertEquals("80.0", this.calc.getResultado());
	}
	
	@Test
	void testDivision() {
		this.calc.setValor(16);
		this.calc.division();
		this.calc.setValor(4);
		assertEquals("4.0", this.calc.getResultado());
		this.calc.setValor(2);
		assertEquals("2.0", this.calc.getResultado());
		this.calc.setValor(0);
		assertEquals("Error", this.calc.getResultado());
	}
	
	@Test
	void testEncunciado() {
		Calculadora calc = new Calculadora(); 
		calc.setValor(5); // Establece el valor inicial 
		calc.mas(); // Prepara para sumar 
		calc.setValor(3); // Suma 3 al valor acumulado 
		System.out.println(calc.getResultado()); // Imprimirá "8.0"
		calc.por();
		calc.setValor(2);
		assertEquals(calc.getResultado(), "16.0");
	}
}
