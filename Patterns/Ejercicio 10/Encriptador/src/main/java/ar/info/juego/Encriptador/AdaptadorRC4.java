package ar.info.juego.Encriptador;

public class AdaptadorRC4 implements Cifrado {
	private RC4 adaptee;
	private String key;
	
	public AdaptadorRC4(RC4 adaptee, String key) {
		this.adaptee = adaptee;
		this.key = key;
	}

	@Override
	public String enviar(String mensaje) {
		return this.adaptee.encriptar(mensaje, key);
	}

	@Override
	public String recibir(String mensaje) {
		return this.adaptee.desencriptar(mensaje, key);
	}
}
