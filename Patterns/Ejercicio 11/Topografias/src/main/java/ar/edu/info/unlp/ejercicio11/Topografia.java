package ar.edu.info.unlp.ejercicio11;

public interface Topografia {
	public abstract double calcularProporcion();
	
	public boolean esLaMisma(Topografia otraTopografia);
	
	public boolean esAgua();
	
	public boolean esTierra();
	
	public boolean esMixta(Mixta otraMixta);
}
