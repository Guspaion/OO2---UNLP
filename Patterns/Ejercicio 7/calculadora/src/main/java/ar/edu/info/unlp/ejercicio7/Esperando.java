package ar.edu.info.unlp.ejercicio7;

public class Esperando implements EstadoCalculadora {
	public Esperando() {
		
	}

	@Override
	public String getResultado(Calculadora calc) {
		return calc.getValorAcumulado();
	}

	@Override
	public void operar(Calculadora calc, EstrategiaCalculadora est) {
		calc.setEstrategia(est);
	}
}
