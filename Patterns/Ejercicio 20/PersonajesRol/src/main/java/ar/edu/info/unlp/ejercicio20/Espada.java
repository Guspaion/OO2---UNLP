package ar.edu.info.unlp.ejercicio20;

public class Espada implements Arma {
	
	public Espada() {
		
	}

	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.dañoRecibidoEspada();
	}
	
}
