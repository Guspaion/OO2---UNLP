package ar.edu.info.unlp.notSoParcialero;

public class Hierro implements Armadura {
	public Hierro() {
		
	}

	@Override
	public int defenderseArma(Arma a) {
		return a.atacarHierro();
	}

	@Override
	public int defenderseEspada() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int defenderseArco() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int defenderseBaston() {
		// TODO Auto-generated method stub
		return 1;
	}

}
