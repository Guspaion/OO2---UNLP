package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Twitter x;
	
	User usuario;
	
	Tweet tweetOriginal;
	Tweet tweet1;
	Tweet tweet2;
	Tweet tweet3;

	@BeforeEach
	void setUp() throws Exception {
		x = new Twitter();
		usuario = new User ("Porkus the Samest One");
		x.agregarUsuario(usuario);
		tweetOriginal = new Tweet ("Este es un tweet Original");
		usuario.crearTweet("Tweet1");
		usuario.crearTweet("Tweet2");
		usuario.crearRetweet(tweetOriginal);	
	}
	
	@Test
	void TestCargarUsuario() {
		assertTrue(this.x.cargarUsuario("Forro del Uma"));
		assertFalse(this.x.cargarUsuario("Porkus the Samest One"));
	}
	
	@Test
	void TestExisteUsuario() {
		assertTrue(this.x.existeUsuario("Porkus the Samest One"));
		assertFalse(this.x.existeUsuario("Porkus the Least Same"));
	}
	
	@Test
	void TestEncontrarUsuario() {
		User usuarioEncontrado = this.x.encontrarUsuario("Porkus the Samest One");
		assertEquals(usuario, usuarioEncontrado);
	}
	
	@Test
	void TestEliminarUsuario() {
		assertTrue(this.x.eliminarUsuario("Porkus the Samest One"));
		assertFalse(this.x.eliminarUsuario("El Pomo"));
		assertTrue(this.x.getUsuarios().size() == 0);
	}
}
