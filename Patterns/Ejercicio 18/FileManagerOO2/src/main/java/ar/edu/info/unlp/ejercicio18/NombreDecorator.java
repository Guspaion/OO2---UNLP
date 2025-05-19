package ar.edu.info.unlp.ejercicio18;

public class NombreDecorator extends ArchivoDecorator {
	public NombreDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyString() {
		return(super.prettyPrint() + super.getNombre());
	}
}
