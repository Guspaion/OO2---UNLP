package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public class ArchivoConcreto implements Archivo {
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	public ArchivoConcreto(String nom, String ext, double tam, LocalDate fCrea, LocalDate fMod, String permi) {
		this.nombre = nom;
		this.extension = ext;
		this.tamaño = tam;
		this.fechaCreacion = fCrea;
		this.fechaModificacion = fMod;
		this.permisos = permi;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public double getTamaño() {
		return Math.round(this.tamaño);
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.fechaModificacion;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}

	@Override
	public String prettyPrint() {
		return("Datos del archivo: \n");
	}

}
