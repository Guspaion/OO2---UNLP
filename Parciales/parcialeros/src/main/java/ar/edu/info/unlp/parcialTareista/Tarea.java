package ar.edu.info.unlp.parcialTareista;

public abstract class Tarea {
	private String nombre;
	private String descripcion;
	
	public Tarea(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public void add(Tarea t) {
		
	}
	
	public void remove(Tarea t) {
		
	}
	
	public abstract void iniciarTarea();
	public abstract void finalizarTarea();
	public abstract long getEstimacion();
	public abstract long getTiempoUtilizado();
	public abstract long getAvance();
}
