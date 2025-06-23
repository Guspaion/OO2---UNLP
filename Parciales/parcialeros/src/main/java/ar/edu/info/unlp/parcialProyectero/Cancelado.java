package ar.edu.info.unlp.parcialProyectero;

public class Cancelado extends EstadoProyecto {
	public Cancelado() {
		
	}

	@Override
	public void aprobarEtapa(Proyecto context) {
		
	}

	@Override
	public void modificarMargenGanancia(Proyecto context, double margen) {
		
	}
	
	@Override
	public void cancelarProyecto(Proyecto context) {
		
	}

	@Override
	public String getNombreEstado() {
		return "Cancelado";
	}
}
