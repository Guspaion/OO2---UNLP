package ar.edu.info.unlp.ejercicio11;

import java.util.List;

public class Mixta implements Topografia {
	private List<Topografia> partes;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.partes = List.of(t1, t2, t3, t4);
	}

	@Override
	public double calcularProporcion() {
		return this.partes.stream()
							.mapToDouble(t -> t.calcularProporcion())
							.sum() / 4;
	}
	
	@Override
	public boolean esLaMisma(Topografia otraTopografia) {
		return otraTopografia.esMixta(this);
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
		return this.partes.stream()
							.allMatch(t -> t.esLaMisma(otraMixta));
	}
}
