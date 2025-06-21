package ar.edu.info.unlp.parcialContenedoristico;

public class Boton extends ComponenteVisual {
	private String texto;
	private String accion;
	private ConfiguracionDeEstilo estilo;
	
	public Boton(String texto, String accion, ConfiguracionDeEstilo estilo) {
		this.texto = texto;
		this.accion = accion;
		this.estilo = estilo;
	}

	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estilo = estilo;
	}
	
	public String imprimir() {
		return "<boton estilo = "+estilo.getEstiloBoton()+" texto = "+this.texto
				+" accion = "+this.accion+"/>";
	}
}
