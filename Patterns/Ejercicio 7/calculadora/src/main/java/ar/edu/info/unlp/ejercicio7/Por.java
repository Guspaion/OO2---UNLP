package ar.edu.info.unlp.ejercicio7;

public class Por implements EstrategiaCalculadora {
	public Por() {
		
	}

	@Override
	public String calcular(double op1, double op2) {
		return String.valueOf(op1 * op2);
	}
}
