package ar.edu.info.unlp.ejercicio7;

public class Calculadora {
	private String valorAcumulado;
	private EstadoCalculadora estado;
	private EstrategiaCalculadora estrategia;
	
	public Calculadora() {
		this.valorAcumulado = "0";
		this.estado = new Esperando();
		this.estrategia = new Mas();
	}
	
	//Para tests
	public EstadoCalculadora getEstado() {
		return this.estado;
	}
	
	//Para tests
	public EstrategiaCalculadora getEstrategia() {
		return this.estrategia;
	}
	
	public String getValorAcumulado() {
		return this.valorAcumulado;
	}
	
	public String getResultado() {
		return this.estado.getResultado(this);
	}
	
	public void setEstado(EstadoCalculadora nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void setEstrategia(EstrategiaCalculadora nuevaEstrategia) {
		this.estrategia = nuevaEstrategia;
	}
	
	public void borrar() {
		this.valorAcumulado = "0";
		setEstado(new Esperando());
	}
	
	public void setValor(double valor) {
	    try {
	        this.valorAcumulado = this.estrategia.calcular(Double.parseDouble(valorAcumulado), valor);
	        this.setEstado(new Esperando());
	    } catch (ArithmeticException e) {
	        this.setEstado(new Error());
	    }
	}
	
	public void mas() {
		this.estado.operar(this, new Mas());
	}
	
	public void menos() {
		this.estado.operar(this, new Menos());
	}
	
	public void por() {
		this.estado.operar(this, new Por());
	}

	public void division() {
		this.estado.operar(this, new Division());
	}
}
