package ar.edu.info.unlp.notSoParcialero;

public class Cuero implements Armadura {
	public Cuero() {
		
	}

	@Override
	public int defenderseArma(Arma a) {
		return a.atacarCuero();
	}

	@Override
	public int defenderseEspada() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int defenderseArco() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int defenderseBaston() {
		// TODO Auto-generated method stub
		return 2;
	}

}
