package ar.edu.info.unlp.ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Equipo {
	private List<Componente> componentes;
	
	public Equipo() {
		this.componentes = new LinkedList<Componente>();
	}
	
	public double getPresupuesto() {
		return this.componentes.stream()
								.mapToDouble(c -> c.getPrecio())
								.sum();
	}
	
	public double getConsumo() {
		return this.componentes.stream()
								.mapToDouble(c -> c.getConsumo())
								.sum();
	}
	
	public double getPrecioFinal() {
		return (this.getPresupuesto() * 1.21);
	}
	
	public void agregarComponente(Componente c) {
		this.componentes.add(c);	
	}
}
