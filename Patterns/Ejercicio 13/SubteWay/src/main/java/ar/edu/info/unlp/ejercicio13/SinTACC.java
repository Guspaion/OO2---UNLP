package ar.edu.info.unlp.ejercicio13;

public class SinTACC extends SandwichBuilder {
	public SinTACC() {
		
	}

	@Override
	Ingrediente buildPan() {
		return(new Ingrediente("Pan de chipá", 150));
	}

	@Override
	Ingrediente buildAderezo() {
		return(new Ingrediente("Salsa tártara", 18));
	}

	@Override
	Ingrediente buildPrincipal() {
		return(new Ingrediente("Pollo", 250));
	}

	@Override
	Ingrediente buildAdicional() {
		return(new Ingrediente("Verduras grilladas", 200));
	}
}
