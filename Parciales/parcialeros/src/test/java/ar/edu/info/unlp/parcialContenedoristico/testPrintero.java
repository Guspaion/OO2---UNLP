package ar.edu.info.unlp.parcialContenedoristico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testPrintero {
	private ComponenteVisual container;
	private ComponenteVisual button;
	private ComponenteVisual tag;
	private ConfiguracionDeEstilo estilo;
	
	@BeforeEach
	void setUp() {
		this.estilo = new ConfiguracionDeEstilo();
		this.container = new Contenedor();
		this.button = new Boton("Aceptar", "accept()", estilo);
		this.tag = new Etiqueta("Parcial de Objetos", estilo);
		this.container.add(this.button);
		this.container.add(this.tag);
	}
	
	@Test
	void testPrintero() {
		String esperado = 
				"<contenedor>\n"
				+ "<boton estilo = 'color:red; text-size:10px' texto = Aceptar accion = accept()/>\n"
				+ "<etiqueta estilo = 'color:blue; text-size:12px'>Parcial de Objetos</etiqueta>\n"
				+ "</contenedor>";
		assertEquals(esperado, this.container.imprimir());
	}
}
