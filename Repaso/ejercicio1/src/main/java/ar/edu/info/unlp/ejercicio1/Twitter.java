package ar.edu.info.unlp.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Twitter {
	private List<User> usuarios;
	
	public Twitter() {
		this.usuarios = new LinkedList<User>();
	}
	
	public void agregarUsuario(User u) {
		this.usuarios.add(u);
	}
	
	public List<User> getUsuarios() {
		return this.usuarios;
	}
	
	public boolean existeUsuario(String screenName) {
		return(this.usuarios.stream().anyMatch(u -> u.mismoNombre(screenName)));
	}
	
	public boolean cargarUsuario(String screenName) {
		if(!this.existeUsuario(screenName)) {
			User nuevoUsuario = new User(screenName);
			this.usuarios.add(nuevoUsuario);
			return true;
		}
		return false;
	}
	
	public User encontrarUsuario(String screenName) {
		return(this.usuarios.stream().filter(u -> u.mismoNombre(screenName)).findFirst()).orElse(null);
	}
	
	public boolean eliminarUsuario(String screenName) {
		User usuario = this.encontrarUsuario(screenName);
		if(usuario != null) {
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
			return true;
		}
		return false;
	}
}
