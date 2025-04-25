package ar.edu.info.unlp.ejercicio13;

public abstract class SandwichBuilder {
	private Sandwich sandwich;
	
	abstract Ingrediente buildPan();
	abstract Ingrediente buildAderezo();
	abstract Ingrediente buildPrincipal();
	abstract Ingrediente buildAdicional();
	
	public void buildSandwich() {
		this.sandwich = new Sandwich();
		this.sandwich.addIngrediente(buildPan());
		this.sandwich.addIngrediente(buildAderezo());
		this.sandwich.addIngrediente(buildPrincipal());
		this.sandwich.addIngrediente(buildAdicional());
	}
	
	public Sandwich getResult() {
		return this.sandwich;
	}
}
