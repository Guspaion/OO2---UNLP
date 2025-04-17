package ar.edu.info.unlp.ejercicio7;

public interface EstadoCalculadora {
	public String getResultado(Calculadora calc);
	public void operar(Calculadora calc, EstrategiaCalculadora est);
}
