package ar.edu.info.unlp.parcialTareista;

public class Inactiva implements EstadoTarea {
	public Inactiva() {
		
	}

	@Override
	public void iniciarTarea(TareaSimple context) {
		context.setEstado(new Iniciada());
		context.setHoraInicio();
	}

	@Override
	public void finalizarTarea(TareaSimple context) {
		
	}

	@Override
	public long getTiempoUtilizado(TareaSimple context) {
		// TODO Auto-generated method stub
		return 0;
	}
}
