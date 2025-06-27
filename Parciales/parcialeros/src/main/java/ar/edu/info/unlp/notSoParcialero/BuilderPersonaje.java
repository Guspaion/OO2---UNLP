package ar.edu.info.unlp.notSoParcialero;

public abstract class BuilderPersonaje {
	protected Personaje personaje;
	
	public BuilderPersonaje() {
		this.reset();
	}
	
	public void reset() {
		this.personaje = new Personaje();
	}
	
	public void setearNombre(String nombre) {
		this.personaje.setNombre(nombre);
	}
	
	public Personaje getResult() {
		return this.personaje;
	}
	
	public abstract void setearArma();
	public abstract void setearArmadura();
	public abstract void setearHabilidades();
}
