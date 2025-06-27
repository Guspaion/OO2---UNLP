package ar.edu.info.unlp.notSoParcialero;

public class Espada implements Arma {
	public Espada() {
		
	}

	@Override
	public int atacarArmadura(Armadura a) {
		return a.defenderseEspada();
	}

	@Override
	public int atacarCuero() {
		return 8;
	}

	@Override
	public int atacarHierro() {
		return 5;
	}

	@Override
	public int atacarAcero() {
		return 3;
	}
	
	
}
