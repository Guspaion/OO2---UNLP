package ar.edu.info.unlp.ejercicio7;

public class Operando implements EstadoCalculadora {
	public Operando() {
		
	}

	@Override
	public String getResultado(Calculadora calc) {
		this.setearError(calc);
		return("Error");
	}

	@Override
	public void operar(Calculadora calc, EstrategiaCalculadora est) {
		this.setearError(calc);
	}
	
	public void setearError(Calculadora calc) {
		calc.setEstado(new Error());
	}
}
