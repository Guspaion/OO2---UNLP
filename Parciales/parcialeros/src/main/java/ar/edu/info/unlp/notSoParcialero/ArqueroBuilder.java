package ar.edu.info.unlp.notSoParcialero;

public class ArqueroBuilder extends BuilderPersonaje {
	public ArqueroBuilder() {
		super();
	}

	@Override
	public void setearArma() {
		super.personaje.setArma(new Arco());
	}

	@Override
	public void setearArmadura() {
		super.personaje.setArmadura(new Cuero());
	}

	@Override
	public void setearHabilidades() {
		super.personaje.agregarHabilidad(new Habilidad("Combate a distancia"));
	}
}
