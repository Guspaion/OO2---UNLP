package ar.edu.info.unlp.ejercicio15;

public abstract class BuilderEquipo {
	private Equipo equipo;
	
	public BuilderEquipo() {
		this.equipo = new Equipo();
	}
	
	public Equipo getResult() {
		return this.equipo;
	}
	
	public double getConsumoActual() {
		return this.equipo.getConsumo();
	}
	
	public void buildEquipo() {
		this.buildProcesador();
		this.buildMemoriaRam();
		this.buildDisco();
		this.buildGrafica();
		this.buildGabinete();
	}
	
	protected void agregarComponente(Componente c) {
		this.equipo.agregarComponente(c);
	}
	
	protected abstract void buildProcesador();
	protected abstract void buildMemoriaRam();
	protected abstract void buildDisco();
	protected abstract void buildGrafica();
	protected abstract void buildGabinete();
}
