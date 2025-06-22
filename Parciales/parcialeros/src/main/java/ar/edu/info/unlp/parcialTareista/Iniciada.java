package ar.edu.info.unlp.parcialTareista;

public class Iniciada implements EstadoTarea {
	public Iniciada() {
		
	}

	@Override
	public void iniciarTarea(TareaSimple context) {

	}

	@Override
	public void finalizarTarea(TareaSimple context) {
		context.setEstado(new Finalizada());
		context.setHoraFin();
	}

	@Override
	public long getTiempoUtilizado(TareaSimple context) {
		// TODO Auto-generated method stub
		return 0;
	}
}
