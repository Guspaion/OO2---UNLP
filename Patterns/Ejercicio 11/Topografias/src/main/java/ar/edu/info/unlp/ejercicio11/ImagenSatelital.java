package ar.edu.info.unlp.ejercicio11;

public class ImagenSatelital {
	private Topografia t;
	
	public ImagenSatelital(Topografia t) {
		this.t = t;
	}
	
	public double calcularProporcionDeAgua() {
		return this.t.calcularProporcion();
	}
	
	public boolean compararTopografias(Topografia otraTopografia) {
		return this.t.esLaMisma(otraTopografia);
	}
}
