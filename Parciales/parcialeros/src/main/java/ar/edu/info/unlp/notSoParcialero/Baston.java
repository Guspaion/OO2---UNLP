package ar.edu.info.unlp.notSoParcialero;

public class Baston implements Arma {
	public Baston() {
		
	}
	
	@Override
	public int atacarArmadura(Armadura a) {
		return a.defenderseBaston();
	}

	@Override
	public int atacarCuero() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int atacarHierro() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int atacarAcero() {
		// TODO Auto-generated method stub
		return 1;
	}

}
