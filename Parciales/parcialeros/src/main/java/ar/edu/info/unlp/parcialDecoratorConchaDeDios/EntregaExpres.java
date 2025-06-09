package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public class EntregaExpres extends ServicioAdicional {

	public EntregaExpres(EnvioPaquete comp) {
		super(comp);
	}
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + (super.getValorDeclarado() * 0.5);
	}
	
	public String getDescripcion() {
		return super.getDescripcion() + " - Entrega Expréss";
	}
}
