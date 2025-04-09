package ar.edu.info.unlp.ejercicio2c;

import java.time.LocalDateTime;

public class Post {
	private String userName;
	private String texto;
	private LocalDateTime fecha;
	
	public Post(String userName, String texto, LocalDateTime fecha) {
		this.userName = userName;
		this.texto = texto;
		this.fecha = fecha;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	
	public boolean noEsUsuario(String uName) {
		return(this.userName != uName);
	}
}
