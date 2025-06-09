package ar.edu.info.unlp.parcialBuildero;

import java.util.LinkedList;
import java.util.List;

public class Catalogo {
	private static final Componente Componente = null;
	private List<Componente> componentes;
	
	public Catalogo() {
		this.componentes = new LinkedList<Componente>();
	}
	
	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public Componente getComponente(String desc) {
		return this.componentes.stream()
								.filter(c -> c.getNombre().equals(desc))
								.findFirst()
								.orElse(null);
	}
}
