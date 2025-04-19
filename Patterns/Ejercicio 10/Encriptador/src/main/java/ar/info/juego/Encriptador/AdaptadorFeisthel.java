package ar.info.juego.Encriptador;

public class AdaptadorFeisthel implements Cifrado {
	private FeistelCipher adaptee;
	
	public AdaptadorFeisthel(FeistelCipher adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String enviar(String mensaje) {
		return this.adaptee.encode(mensaje);
	}

	@Override
	public String recibir(String mensaje) {
		return this.adaptee.encode(mensaje);
	}
}
