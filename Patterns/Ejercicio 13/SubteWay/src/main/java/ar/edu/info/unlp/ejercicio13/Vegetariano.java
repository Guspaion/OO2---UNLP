package ar.edu.info.unlp.ejercicio13;

public class Vegetariano extends SandwichBuilder {
	public Vegetariano() {
		
	}

	@Override
	Ingrediente buildPan() {
		return(new Ingrediente("Pan de semillas", 120));
	}

	@Override
	Ingrediente buildAderezo() {
		return null;
	}

	@Override
	Ingrediente buildPrincipal() {
		return(new Ingrediente("Provoleta grillada", 200));
	}

	@Override
	Ingrediente buildAdicional() {
		return(new Ingrediente("Berenjenas al escabeche", 100));
	}
}
