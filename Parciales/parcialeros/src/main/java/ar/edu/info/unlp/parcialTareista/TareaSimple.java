package ar.edu.info.unlp.parcialTareista;

public class TareaSimple extends Tarea {
	private long horaInicio;
	private long horaFin;
	private long estimacion;
	private EstadoTarea estado;
	
	public TareaSimple(String nombre, String descripcion, long estimacion) {
		super(nombre, descripcion);
		this.estimacion = estimacion;
		this.estado = new Inactiva();
	}
	
	public long getHoraInicio() {
		return this.horaInicio;
	}
	
	public void setHoraInicio() {
		this.horaInicio = System.currentTimeMillis();
	}
	
	public long getHoraFin() {
		return this.horaFin;
	}
	
	public void setHoraFin() {
		this.horaFin = System.currentTimeMillis();
	}
	
	public void setEstado(EstadoTarea estado) {
		this.estado = estado;
	}
	
	public void iniciarTarea() {
		this.estado.iniciarTarea(this);
	}
	
	public void finalizarTarea() {
		this.estado.finalizarTarea(this);
	}

	@Override
	public long getEstimacion() {
		return this.estimacion;
	}

	@Override
	public long getTiempoUtilizado() {
		return this.estado.getTiempoUtilizado(this);
	}
	
	@Override
	public long getAvance() {
		return 0;
	}
}
