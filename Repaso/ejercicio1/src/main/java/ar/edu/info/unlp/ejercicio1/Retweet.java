package ar.edu.info.unlp.ejercicio1;

public class Retweet implements Publicacion {
	private Tweet tweetOriginal;
	
	public Retweet(Tweet tweetOriginal) {
		this.tweetOriginal = tweetOriginal;
	}
	
	public String getCuerpo() {
		return this.tweetOriginal.getCuerpo();
	}
}
