package ar.edu.info.unlp.notSoParcialero;

public class GuerreroBuilder extends BuilderPersonaje {
	public GuerreroBuilder() {
		super();
	}

	@Override
	public void setearArma() {
		super.personaje.setArma(new Espada());
	}

	@Override
	public void setearArmadura() {
		super.personaje.setArmadura(new Acero());
	}

	@Override
	public void setearHabilidades() {
		super.personaje.agregarHabilidad(new Habilidad("Combate cuerpo a cuerpo"));
	}
}
