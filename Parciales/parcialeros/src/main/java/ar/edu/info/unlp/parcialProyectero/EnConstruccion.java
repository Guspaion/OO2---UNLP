package ar.edu.info.unlp.parcialProyectero;

public class EnConstruccion extends EstadoProyecto {
	public EnConstruccion() {
		
	}
	
	@Override
	public void aprobarEtapa(Proyecto context) {
		if(context.getPrecioProyecto() > 0) {
			context.setEstado(new EnEvaluacion());
		} else {
			throw new RuntimeException("Oh shit");
		}
	}

	@Override
	public void modificarMargenGanancia(Proyecto context, double margen) {
		if (margen >= 0.08 && margen <= 0.10) {
			context.setMargenGanancia(margen);
		}
	}

	@Override
	public String getNombreEstado() {
		return "En construccion";
	}
}	
