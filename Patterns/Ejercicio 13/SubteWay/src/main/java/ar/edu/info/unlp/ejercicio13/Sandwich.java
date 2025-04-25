package ar.edu.info.unlp.ejercicio13;

import java.util.LinkedList;
import java.util.List;

public class Sandwich {
	private List<Ingrediente> ingredientes;
	
	public Sandwich() {
		this.ingredientes = new LinkedList<Ingrediente>();
	}
	
	public void addIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	}
	
	public double getPrecioTotal() {
		return this.ingredientes.stream()
								.filter(i -> i != null)
								.mapToDouble(i -> i.getPrecio())
								.sum();
	}
}
