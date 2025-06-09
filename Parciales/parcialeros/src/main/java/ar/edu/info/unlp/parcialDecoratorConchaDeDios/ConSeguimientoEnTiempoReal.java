package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public class ConSeguimientoEnTiempoReal extends ServicioAdicional {

	public ConSeguimientoEnTiempoReal(EnvioPaquete comp) {
		super(comp);
	}
	
	public double getCostoEnvio() {
		return super.getCostoEnvio() + 2000;
	}
}
