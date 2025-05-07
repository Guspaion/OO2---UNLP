package ar.edu.info.unlp.ejercicio20;

public class MagoBuilder extends CharacterBuilder {
	
	public MagoBuilder() {
		
	}

	@Override
	public Arma buildArma() {
		return (new Baston());
	}

	@Override
	public Armadura buildArmadura() {
		return (new Cuero());
	}

	@Override
	public void buildHabilidades() {
		super.agregarHabilidad(new Magia());
		super.agregarHabilidad(new Distancia());
	}

}
