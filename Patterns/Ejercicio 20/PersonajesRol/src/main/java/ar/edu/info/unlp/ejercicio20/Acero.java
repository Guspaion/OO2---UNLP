package ar.edu.info.unlp.ejercicio20;

public class Acero implements Armadura {
	
	public Acero() {
		
	}

	@Override
	public int dañoRecibidoEspada() {
		return 3;
	}

	@Override
	public int dañoRecibidoArco() {
		return 2;
	}

	@Override
	public int dañoRecibidoBaston() {
		return 1;
	}

}
