package ar.edu.info.unlp.ejercicio2e;

public class Supermercado {
	public Supermercado() {
		
	}
	
	public Pedido notificarPedido(int nroPedido, Direccion direc) {
		String notificacion = "Estimado cliente, le informamos que recibimos su pedido " + nroPedido +
				"el cual será enviado a la dirección " + direc.getDireccionFormateada();
		System.out.println(notificacion);
		return(new Pedido(nroPedido, direc));
	}
}
