package ar.edu.info.unlp.ejercicio11;

public class Tierra implements Topografia {
	public Tierra() {
		
	}

	@Override
	public double calcularProporcion() {
		return 0.0;
	}

	@Override
	public boolean esLaMisma(Topografia otraTopografia) {
		return otraTopografia.esTierra();
	}

	@Override
	public boolean esAgua() {
		return false;
	}

	@Override
	public boolean esTierra() {
		return true;
	}

	@Override
	public boolean esMixta(Mixta otraMixta) {
		return false;
	}
}
