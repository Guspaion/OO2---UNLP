package ar.edu.info.unlp.ejercicio13;

public class Vegano extends SandwichBuilder {
	public Vegano() {
		
	}

	@Override
	Ingrediente buildPan() {
		return(new Ingrediente("Pan integral", 100));
	}

	@Override
	Ingrediente buildAderezo() {
		return(new Ingrediente("Salsa criolla", 20));
	}

	@Override
	Ingrediente buildPrincipal() {
		return(new Ingrediente("Milanes de girgolas", 500));
	}

	@Override
	Ingrediente buildAdicional() {
		return null;
	}
}
