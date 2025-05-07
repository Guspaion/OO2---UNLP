package ar.edu.info.unlp.ejercicio20;

public class CharCreator {
	private CharacterBuilder builder;
	
	public CharCreator(CharacterBuilder builderIni) {
		this.builder = builderIni;
	}
	
	private void setBuilder(CharacterBuilder builderNuevo) {
		this.builder = builderNuevo;
	}
	
	public void builderGuerrero() {
		this.setBuilder(new GuerreroBuilder());
	}
	
	public void builderArquero() {
		this.setBuilder(new ArqueroBuilder());
	}
	
	public void builderMago() {
		this.setBuilder(new MagoBuilder());
	}
	
	public Character getResultado(String nombre) {
		this.builder.buildCharacter(nombre);
		return this.builder.getResultado();
	}
}
