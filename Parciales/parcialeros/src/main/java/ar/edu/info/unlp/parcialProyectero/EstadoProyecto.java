package ar.edu.info.unlp.parcialProyectero;

public abstract class EstadoProyecto {
	
	public abstract void aprobarEtapa(Proyecto context);
	public abstract void modificarMargenGanancia(Proyecto context, double margen);
	public abstract String getNombreEstado();
	
	public void cancelarProyecto(Proyecto context) {
		context.setObjetivo(context.getObjetivo().concat("(Cancelado)"));
		context.setFechaFin(LocalDate.now());
		context.setEstado(new Cancelado());
	}
}
