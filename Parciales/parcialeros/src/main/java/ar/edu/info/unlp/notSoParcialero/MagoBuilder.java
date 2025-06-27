package ar.edu.info.unlp.notSoParcialero;

public class MagoBuilder extends BuilderPersonaje {
	public MagoBuilder() {
		super();
	}

	@Override
	public void setearArma() {
		super.personaje.setArma(new Baston());
	}

	@Override
	public void setearArmadura() {
		super.personaje.setArmadura(new Cuero());
	}

	@Override
	public void setearHabilidades() {
		super.personaje.agregarHabilidad(new Habilidad("Magia"));
		super.personaje.agregarHabilidad(new Habilidad("Combate a distancia"));
	}
}
