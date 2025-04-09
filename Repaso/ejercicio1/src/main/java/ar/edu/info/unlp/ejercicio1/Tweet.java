package ar.edu.info.unlp.ejercicio1;

public class Tweet implements Publicacion {
	private String cuerpo;
	
	public Tweet(String texto) {
		this.cuerpo = texto;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
}
