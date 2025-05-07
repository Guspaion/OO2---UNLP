package ar.edu.info.unlp.ejercicio20;

public class GuerreroBuilder extends CharacterBuilder {
	
	public GuerreroBuilder() {
		
	}

	@Override
	public Arma buildArma() {
		return (new Espada());
	}

	@Override
	public Armadura buildArmadura() {
		return (new Acero());
	}

	@Override
	public void buildHabilidades() {
		super.agregarHabilidad(new Melee());
	}

}
