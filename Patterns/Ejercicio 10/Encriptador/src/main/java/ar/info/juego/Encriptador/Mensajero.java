package ar.info.juego.Encriptador;

public class Mensajero {
	private Cifrado cifrado;
	
	public Mensajero(Cifrado cifradoInicial) {
		this.cifrado= cifradoInicial;
	}
	
	public String enviar(String mensaje) {
		return this.cifrado.enviar(mensaje);
	}
	
	public String recibir(String mensaje) {
		return this.cifrado.recibir(mensaje);
	}
	
	public void setCifrado(Cifrado nuevoCifrado) {
		this.cifrado = nuevoCifrado;
	}
}
