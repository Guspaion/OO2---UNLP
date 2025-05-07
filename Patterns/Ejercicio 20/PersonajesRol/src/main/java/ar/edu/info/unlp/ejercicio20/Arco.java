package ar.edu.info.unlp.ejercicio20;

public class Arco implements Arma {
	
	public Arco() {
		
	}

	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoRecibidoArco();
	}
	
}
