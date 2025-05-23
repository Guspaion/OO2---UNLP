package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Pedido {
	private List<Producto> productos;
	private FormaPago formaPago;
	private Cliente cliente;
	
	public double prod() {
		
		double costoProductos = this.productos.stream()
							.mapToDouble(p -> p.getPrecio())
							.sum();
	
		double extraFormaPago = this.formaPago.getExtra();
		
		int añosDesdeFechaAlta = this.cliente.añosDesdeFechaAlta();
		
		return this.getPrecioFinal(costoProductos);
		

	}
	
	public double getPrecioFinal(double precio) {
		double precioTotal = precio + this.formaPago.getExtra();
		if(this.cliente.añosDesdeFechaAlta() > 5) {
			return precioTotal * 0.9;
		}
		return(precioTotal);
	}
	
	
}
