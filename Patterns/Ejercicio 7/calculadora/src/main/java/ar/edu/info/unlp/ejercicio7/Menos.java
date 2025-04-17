package ar.edu.info.unlp.ejercicio7;

public class Menos implements EstrategiaCalculadora {
	public Menos() {
		
	}
	
	@Override
	public String calcular(double op1, double op2) {
		return String.valueOf(op1 - op2);
	}
}
