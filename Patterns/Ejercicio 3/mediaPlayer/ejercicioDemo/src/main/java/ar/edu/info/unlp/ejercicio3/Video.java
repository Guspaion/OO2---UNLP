package ar.edu.info.unlp.ejercicio3;

public class Video extends Media {
	private VideoStream videoStream;
	
	public Video() {
		
	}
	
	public void play() {
		this.videoStream.reproduce();
	}
}
