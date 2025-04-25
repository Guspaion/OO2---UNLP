package ar.edu.info.unlp.ejercicio13;

public class Clasico extends SandwichBuilder {
	public Clasico() {
		
	}

	@Override
	Ingrediente buildPan() {
		return(new Ingrediente("Brioche", 200));
	}

	@Override
	Ingrediente buildAderezo() {
		return(new Ingrediente("Aderezo a base de mayonesa", 20));
	}

	@Override
	Ingrediente buildPrincipal() {
		return(new Ingrediente("Carne de ternera", 300));
	}

	@Override
	Ingrediente buildAdicional() {
		return(new Ingrediente("Tomate", 80));
	}
}
