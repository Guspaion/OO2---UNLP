package ar.edu.info.unlp.parcialTareista;

public class Finalizada implements EstadoTarea {
	public Finalizada() {
		
	}

	@Override
	public void iniciarTarea(TareaSimple context) {

	}

	@Override
	public void finalizarTarea(TareaSimple context) {

	}

	@Override
	public long getTiempoUtilizado(TareaSimple context) {
		return (context.getHoraFin() - context.getHoraInicio());
	}
}
