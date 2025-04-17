package ar.edu.info.unlp.ejercicio7;

public class Division implements EstrategiaCalculadora {
	public Division() {
		
	}

	@Override
	public String calcular(double op1, double op2) {
	    if (op2 == 0) {
	        throw new ArithmeticException("No se puede dividir por cero, maestro.");
	    }
	    return String.valueOf(op1 / op2);
	}
}
