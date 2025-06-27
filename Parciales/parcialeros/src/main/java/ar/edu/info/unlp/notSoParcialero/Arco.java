package ar.edu.info.unlp.notSoParcialero;

public class Arco implements Arma {
	public Arco() {
		
	}

	@Override
	public int atacarArmadura(Armadura a) {
		return a.defenderseArco();
	}

	@Override
	public int atacarCuero() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int atacarHierro() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int atacarAcero() {
		// TODO Auto-generated method stub
		return 2;
	}

}
