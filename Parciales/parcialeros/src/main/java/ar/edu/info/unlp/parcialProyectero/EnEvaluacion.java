package ar.edu.info.unlp.parcialProyectero;

public class EnEvaluacion extends EstadoProyecto {
	public EnEvaluacion() {
		
	}

	@Override
	public void aprobarEtapa(Proyecto context) {
		context.setFechaFin(LocalDate.now());
		context.setEstado(new Confirmada());
	}

	@Override
	public void modificarMargenGanancia(Proyecto context, double margen) {
		if(margen >= 0.11 && margen <= 0.15) {
			context.setMargenGanancia(margen);
		}
	}

	@Override
	public String getNombreEstado() {
		return "En evaluacion";
	}
}
