package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public class ConSeguro extends ServicioAdicional {

	public ConSeguro(EnvioPaquete comp) {
		super(comp);
	} 
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + (super.getValorDeclarado() * 0.2);
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " con seguro";
	}
}
