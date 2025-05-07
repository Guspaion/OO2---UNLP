package ar.edu.info.unlp.ejercicio20;

public abstract class CharacterBuilder {
	private Character character;
	
	public void agregarHabilidad(Habilidad h) {
		this.character.agregarHabilidad(h);
	}
	
	public void buildCharacter(String nombre) {
		this.character = new Character(nombre, this.buildArma(), this.buildArmadura());
		this.buildHabilidades();
	}
	
	public Character getResultado() {
		return this.character;
	}
	
	public abstract Arma buildArma();
	public abstract Armadura buildArmadura();
	public abstract void buildHabilidades();
	
}
