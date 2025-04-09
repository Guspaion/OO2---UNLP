package ar.edu.info.unlp.ejercicio2d;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Producto(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public double precioTotalDeProducto() {
		return(this.precio * this.cantidad);
	}
}
