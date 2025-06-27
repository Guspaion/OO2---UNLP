package ar.edu.info.unlp.notSoParcialero;

public class Acero implements Armadura {
	public Acero() {
		
	}

	@Override
	public int defenderseArma(Arma a) {
		return a.atacarAcero();
	}

	@Override
	public int defenderseEspada() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int defenderseArco() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int defenderseBaston() {
		// TODO Auto-generated method stub
		return 1;
	}
}
