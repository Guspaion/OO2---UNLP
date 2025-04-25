package ar.edu.info.unlp.ejercicio13;

public class SubteWay {
	private SandwichBuilder builder;
	
	public SubteWay(SandwichBuilder builderIni) {
		this.builder = builderIni;
	}
	
	private void setBuilder(SandwichBuilder nuevoBuilder) {
		this.builder = nuevoBuilder;
	}
	
	public void builderClasico() {
		this.setBuilder(new Clasico());
	}
	
	public void builderVegetariano() {
		this.setBuilder(new Vegetariano());
	}
	
	public void builderVegano() {
		this.setBuilder(new Vegano());
	}
	
	public void builderSinTACC() {
		this.setBuilder(new SinTACC());
	}
	
	public void buildSanwich() {
		this.builder.buildSandwich();
	}
	
	public Sandwich getResult() {
		return this.builder.getResult();
	}
}
