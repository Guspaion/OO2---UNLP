package ar.edu.info.unlp.parcialBuildero;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Presupuesto {
	private String usuario;
	private LocalDate fecha;
	private List<Componente> componentes;
	
	public Presupuesto(String usuario) {
		this.usuario = usuario;
		this.fecha = LocalDate.now();
		this.componentes = new LinkedList<Componente>();
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void addComponente(Componente c) {
		this.componentes.add(c);
	}
	
	public double calcularConsumo() {
		return this.componentes.stream()
							.mapToDouble(c -> c.getConsumo())
							.sum();
	}
	
	public double calcularPrecio() {
		return ((this.componentes.stream()
									.mapToDouble(c -> c.getPrecio())
									.sum()) * 1.21);
	}
}
