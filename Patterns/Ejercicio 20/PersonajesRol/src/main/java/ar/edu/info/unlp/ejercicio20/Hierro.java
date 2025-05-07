package ar.edu.info.unlp.ejercicio20;

public class Hierro implements Armadura {
	
	public Hierro() {
		
	}

	@Override
	public int dañoRecibidoEspada() {
		return 5;
	}

	@Override
	public int dañoRecibidoArco() {
		return 3;
	}

	@Override
	public int dañoRecibidoBaston() {
		return 1;
	}

}
