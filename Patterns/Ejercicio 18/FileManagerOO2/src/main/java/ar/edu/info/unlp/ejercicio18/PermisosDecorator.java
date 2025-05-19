package ar.edu.info.unlp.ejercicio18;

public class PermisosDecorator extends ArchivoDecorator {
	public PermisosDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyString() {
		return super.prettyPrint() + super.getPermisos();
	}
}
