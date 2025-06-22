package ar.edu.info.unlp.parcialTareista;

public interface EstadoTarea {
	
	public void iniciarTarea(TareaSimple context);
	public void finalizarTarea(TareaSimple context);
	public long getTiempoUtilizado(TareaSimple context);
	
}
