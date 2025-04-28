package ar.edu.info.unlp.ejercicio15;

public class Catalogo {
	private BuilderEquipo builder;
	
	public Catalogo(BuilderEquipo builderIni) {
		this.builder = builderIni;
	}
	
	private void setBuilder(BuilderEquipo builder) {
		this.builder = builder;
	}
	
	public void builderBasico() {
		this.setBuilder(new Basico());
	}
	
	public void builderIntermedio() {
		this.setBuilder(new Intermedio());
	}
	
	public void builderGamer() {
		this.setBuilder(new Gamer());
	}
	
	public Equipo construct() {
		this.builder.buildEquipo();
		return this.builder.getResult();
	}
}
