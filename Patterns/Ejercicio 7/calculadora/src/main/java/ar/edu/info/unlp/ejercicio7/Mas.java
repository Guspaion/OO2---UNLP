package ar.edu.info.unlp.ejercicio7;

public class Mas implements EstrategiaCalculadora {
	public Mas() {
		
	}
	
	@Override
	public String calcular(double op1, double op2) {
		return String.valueOf(op1 + op2);
	}
}
