package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public abstract class ServicioAdicional implements EnvioPaquete {
	private EnvioPaquete component;
	
	public ServicioAdicional(EnvioPaquete comp) {
		this.component = comp;
	}
	
	@Override
	public String getDescripcion() {
		return this.component.getDescripcion();
	}
	
	@Override
	public String getDestinatario() {
		return this.component.getDestinatario();
	}
	
	@Override
	public String getDireccionDestino() {
		return this.component.getDireccionDestino();
	}
	
	@Override
	public double getValorDeclarado() {
		return this.component.getValorDeclarado();
	}
	
	@Override
	public double getCostoEnvio() {
		return this.component.getCostoEnvio();
	}
}
