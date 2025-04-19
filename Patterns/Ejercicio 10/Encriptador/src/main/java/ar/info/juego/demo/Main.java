package ar.info.juego.demo;

import ar.info.juego.Encriptador.*;

public class Main {
	public static void Main(String[] args) {
		Mensajero mensajero = new Mensajero(new AdaptadorFeisthel(new FeistelCipher("forro-del-uma")));
		String mensaje = new String("Porkus the samest one");
		System.out.println("Mensaje cifrado con Feisthel: "+mensajero.enviar(mensaje));
		mensajero.setCifrado(new AdaptadorRC4(new RC4(), "porkus-the-samest-one"));
		mensaje = new String("Forrísimo del uma");
		System.out.println("Mensaje cifrado con RC4: "+mensajero.enviar(mensaje));
	}
}
