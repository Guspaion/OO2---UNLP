package ar.edu.info.unlp.ejercicio11;

public class Agua implements Topografia {
	public Agua() {
		
	}

	@Override
	public double calcularProporcion() {
		return 1.0;
	}

	@Override
	public boolean esLaMisma(Topografia otraTopografia) {
		return otraTopografia.esAgua();
	}

	@Override
	public boolean esAgua() {
		return true;
	}

	@Override
	public boolean esTierra() {
		return false;
	}

	@Override
	public boolean esMixta(Mixta otraMixta) {
		return false;
	}
}
