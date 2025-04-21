package ar.edu.info.unlp.ejercicio11;

public class Pantano implements Topografia {
	public Pantano() {
		
	}

	@Override
	public double calcularProporcion() {
		return 0.7;
	}

	@Override
	public boolean esLaMisma(Topografia otraTopografia) {
		return otraTopografia.esPantano();
	}

	@Override
	public boolean esAgua() {
		return false;
	}

	@Override
	public boolean esTierra() {
		return false;
	}

	@Override
	public boolean esMixta(Mixta otraMixta) {
		return false;
	}

	@Override
	public boolean esPantano() {
		return true;
	}
}
