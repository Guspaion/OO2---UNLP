package ar.edu.info.unlp.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class User {
	private String screenName;
	private List<Publicacion> tweets;
	
	public User(String screenName) {
		this.screenName = screenName;
		this.tweets = new LinkedList<Publicacion>();
	}
	
	public boolean mismoNombre(String otroScreenName) {
		return(this.screenName == otroScreenName);
	}
	
	private boolean verificarLong(String texto) {
		return(texto.length() > 0 && texto.length() <= 280);
	}
	
	public boolean crearTweet(String texto) {
		if(this.verificarLong(texto)) {
			Publicacion nuevoTweet = new Tweet(texto);
			this.tweets.add(nuevoTweet);
			return true;
		}
		return false;
	}
	
	public Publicacion crearRetweet(Tweet tweetOriginal) {
		Publicacion nuevoTweet = new Retweet(tweetOriginal);
		this.tweets.add(nuevoTweet);
		return nuevoTweet;
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
}
