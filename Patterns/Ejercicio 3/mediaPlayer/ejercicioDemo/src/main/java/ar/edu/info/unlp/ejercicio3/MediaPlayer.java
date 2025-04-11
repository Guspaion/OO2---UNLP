package ar.edu.info.unlp.ejercicio3;

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new LinkedList<Media>();
	}
	
	public void play() {
		this.media.stream().forEach(m -> m.play());
	}
}
