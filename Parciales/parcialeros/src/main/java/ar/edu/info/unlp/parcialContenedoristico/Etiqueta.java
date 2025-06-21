package ar.edu.info.unlp.parcialContenedoristico;

public class Etiqueta extends ComponenteVisual {
	private String texto;
	private ConfiguracionDeEstilo estilo;
	
	public Etiqueta(String texto, ConfiguracionDeEstilo estilo) {
		this.texto = texto;
		this.estilo = estilo;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo;
	}
	
	public String imprimir() {
		return "<etiqueta estilo = "+estilo.getEstiloEtiqueta()+">"
				+this.texto+"</etiqueta>";
	}
}
