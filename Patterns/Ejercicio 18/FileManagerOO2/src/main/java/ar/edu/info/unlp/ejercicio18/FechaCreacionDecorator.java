package ar.edu.info.unlp.ejercicio18;

public class FechaCreacionDecorator extends ArchivoDecorator {
	public FechaCreacionDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + super.getFechaCreacion().toString();
	}
}
