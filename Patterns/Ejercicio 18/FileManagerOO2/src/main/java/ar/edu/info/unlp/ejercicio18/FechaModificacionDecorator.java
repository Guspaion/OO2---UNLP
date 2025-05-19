package ar.edu.info.unlp.ejercicio18;

public class FechaModificacionDecorator extends ArchivoDecorator {
	public FechaModificacionDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + super.getFechaModificacion().toString();
	}
}
