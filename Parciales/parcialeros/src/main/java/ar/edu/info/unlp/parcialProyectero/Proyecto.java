package ar.edu.info.unlp.parcialProyectero;

import java.time.LocalDate;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenGanancia;
	private int cantIntegrantes;
	private double montoPagoIntegrantes;
	private EstadoProyecto estado;
	
	public Proyecto(String nombre, String obj, int cantInt, double montoInt) {
		this.nombre = nombre;
		this.fechaInicio = LocalDate.now();
		this.objetivo = obj;
		this.margenGanancia = 0.07;
		this.cantIntegrantes = cantInt;
		this.montoPagoIntegrantes = montoInt;
		this.estado = new EnConstruccion();
	}
	
	public void setEstado(EstadoProyecto estado) {
		this.estado = estado;
	}
	
	public void setMargenGanancia(double margen) {
		this.margenGanancia = margen;
	}
	
	public void setFechaFin(LocalDate fFin) {
		this.fechaFin = fFin;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getObjetivo() {
		return this.objetivo;
	}
	
	public String getNombreEstado() {
		return this.estado.getNombreEstado();
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}
	
	public double getCostoProyecto() {
		return (this.cantIntegrantes * this.montoPagoIntegrantes);
	}
	
	public double getPrecioProyecto() {
		return (this.getCostoProyecto() * this.margenGanancia);
	}
	
	public void modificarMargenGanancia(double margen) {
		this.estado.modificarMargenGanancia(this, margen);
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto(this);
	}
}
