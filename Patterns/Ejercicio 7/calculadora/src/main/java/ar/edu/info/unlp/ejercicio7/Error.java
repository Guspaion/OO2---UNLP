package ar.edu.info.unlp.ejercicio7;

public class Error implements EstadoCalculadora {
	public Error() {
		
	}

	@Override
	public String getResultado(Calculadora calc) {
		return("Error");
	}

	@Override
	public void operar(Calculadora calc, EstrategiaCalculadora est) {}
}
