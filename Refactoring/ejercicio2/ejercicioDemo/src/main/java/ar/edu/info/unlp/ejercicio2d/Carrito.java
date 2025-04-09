package ar.edu.info.unlp.ejercicio2d;

import java.util.LinkedList;
import java.util.List;

public class Carrito {
	private List<Producto> productos;
	
	public Carrito() {
		this.productos = new LinkedList<Producto>();
	}
	
	public double getPrecioTotal() {
		return(this.productos.stream()
				.mapToDouble(p -> p.precioTotalDeProducto()).sum());
	}
}
