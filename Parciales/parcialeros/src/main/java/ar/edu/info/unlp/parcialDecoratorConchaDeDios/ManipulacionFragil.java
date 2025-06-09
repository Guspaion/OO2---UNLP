package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public class ManipulacionFragil extends ServicioAdicional {

	public ManipulacionFragil(EnvioPaquete comp) {
		super(comp);
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " - frágil";
	}
}
