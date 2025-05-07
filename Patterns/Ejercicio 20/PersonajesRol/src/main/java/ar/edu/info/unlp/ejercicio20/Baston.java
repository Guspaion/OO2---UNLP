package ar.edu.info.unlp.ejercicio20;

public class Baston implements Arma {
	
	public Baston() {
		
	}

	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoRecibidoBaston();
	}

}
