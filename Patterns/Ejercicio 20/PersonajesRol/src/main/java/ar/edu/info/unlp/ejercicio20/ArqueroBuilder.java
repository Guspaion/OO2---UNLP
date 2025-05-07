package ar.edu.info.unlp.ejercicio20;

public class ArqueroBuilder extends CharacterBuilder {
	
	public ArqueroBuilder() {
		
	}

	@Override
	public Arma buildArma() {
		return (new Arco());
	}

	@Override
	public Armadura buildArmadura() {
		return (new Cuero());
	}

	@Override
	public void buildHabilidades() {
		super.agregarHabilidad(new Distancia());
	}

}
