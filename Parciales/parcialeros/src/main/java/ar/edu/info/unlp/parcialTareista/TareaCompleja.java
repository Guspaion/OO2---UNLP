package ar.edu.info.unlp.parcialTareista;

import java.util.LinkedList;
import java.util.List;

public class TareaCompleja extends Tarea {
	private List<Tarea> subtareas;
	
	public TareaCompleja(String nombre, String descripcion) {
		super(nombre, descripcion);
		this.subtareas = new LinkedList<Tarea>();
	}
	
	@Override
	public void add(Tarea t) {
		this.subtareas.add(t);
	}
	
	@Override
	public void remove(Tarea t) {
		this.subtareas.remove(t);
	}

	@Override
	public long getEstimacion() {
		return (this.subtareas.stream()
								.mapToLong(t -> t.getEstimacion())
								.sum());
	}

	@Override
	public long getTiempoUtilizado() {
		return (this.subtareas.stream()
								.mapToLong(t -> t.getTiempoUtilizado())
								.sum());
	}
	
	public long getAvance() {
		return(this.getTiempoUtilizado() / this.getEstimacion());
	}

	@Override
	public void iniciarTarea() {
		this.subtareas.stream()
						.forEach(t -> t.iniciarTarea());
	}

	@Override
	public void finalizarTarea() {
		this.subtareas.stream()
						.forEach(t -> t.finalizarTarea());
	}
}
