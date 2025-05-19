package ar.edu.info.unlp.ejercicio18;

public class ExtensionDecorator extends ArchivoDecorator {
	public ExtensionDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyString() {
		return(super.prettyPrint() + super.getExtension());
	}
}
