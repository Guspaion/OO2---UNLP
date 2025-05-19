package ar.edu.info.unlp.ejercicio18;

public class TamañoDecorator extends ArchivoDecorator {
	public TamañoDecorator(Archivo component) {
		super(component);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + super.getTamaño() + "MB";
	}
}
