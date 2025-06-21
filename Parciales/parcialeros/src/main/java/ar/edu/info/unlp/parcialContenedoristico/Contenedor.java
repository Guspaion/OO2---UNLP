package ar.edu.info.unlp.parcialContenedoristico;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Contenedor extends ComponenteVisual {
	private List<ComponenteVisual> componentes;
	
	public Contenedor() {
		this.componentes = new LinkedList<ComponenteVisual>();
	}

	@Override
	public void add(ComponenteVisual c) {
		this.componentes.add(c);
	}
	
	@Override
	public void remove(ComponenteVisual c) {
		this.componentes.remove(c);		
	}

	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.componentes.stream()
						.forEach(c -> c.aplicarEstilo(estilo));
	}

	@Override
	public String imprimir() {
		return "<contenedor>\n" + 
			       this.componentes.stream()
			                      .map(c -> c.imprimir())
			                      .collect(Collectors.joining("\n")) +
			       "\n</contenedor>";
	}
}
