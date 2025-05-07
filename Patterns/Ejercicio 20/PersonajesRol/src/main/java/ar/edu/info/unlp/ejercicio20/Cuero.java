package ar.edu.info.unlp.ejercicio20;

public class Cuero implements Armadura {
	
	public Cuero() {
		
	}

	@Override
	public int dañoRecibidoEspada() {
		return 8;
	}

	@Override
	public int dañoRecibidoArco() {
		return 5;
	}

	@Override
	public int dañoRecibidoBaston() {
		return 2;
	}

}
