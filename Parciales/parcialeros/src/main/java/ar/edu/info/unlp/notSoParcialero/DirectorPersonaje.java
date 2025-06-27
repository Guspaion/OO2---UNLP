package ar.edu.info.unlp.notSoParcialero;

public class DirectorPersonaje {
	private BuilderPersonaje builder;
	
	public DirectorPersonaje(BuilderPersonaje builderIni) {
		this.builder = builderIni;
	}
	
	public void setBuilder(BuilderPersonaje builder) {
		this.builder = builder;
	}
	
	public Personaje buildPersonaje(String nombre) {
		this.builder.reset();
		this.builder.setearNombre(nombre);
		this.builder.setearArma();
		this.builder.setearArmadura();
		this.builder.setearHabilidades();
		return this.builder.getResult();
	}
}
