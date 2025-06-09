package ar.edu.info.unlp.parcialDecoratorConchaDeDios;

public class Paquete implements EnvioPaquete {
	private String descripcion;
	private String destinatario;
	private String direccionDestino;
	private double valorDeclarado;
	
	public Paquete(String desc, String dest, String direc, double valor) {
		this.descripcion = desc;
		this.destinatario = dest;
		this.direccionDestino = direc;
		this.valorDeclarado = valor;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public String getDestinatario() {
		return this.destinatario;
	}

	@Override
	public String getDireccionDestino() {
		return this.direccionDestino;
	}

	@Override
	public double getValorDeclarado() {
		return this.valorDeclarado;
	}

	@Override
	public double getCostoEnvio() {
		return (this.getValorDeclarado() * 0.05);
	}
	
}
