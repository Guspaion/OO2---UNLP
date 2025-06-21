package ar.edu.info.unlp.parcialContenedoristico;

public class AdaptadorListaDesplegable {
	private ListaDesplegable listaAdaptada;
	
	public AdaptadorListaDesplegable(ListaDesplegable l) {
		this.listaAdaptada = l;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.listaAdaptada.setStyle(estilo.getEstiloEtiqueta());
	}
	
	public String imprimir() {
		return this.listaAdaptada.print();
	}
}
