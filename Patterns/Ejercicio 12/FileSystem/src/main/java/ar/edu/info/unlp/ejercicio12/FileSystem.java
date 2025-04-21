package ar.edu.info.unlp.ejercicio12;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

public abstract class FileSystem {
	private String nombre;
	private LocalDate fechaCreacion;
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public String listarContenido() {
		return this.listarContenidoDesde("");
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDiasDesdeCreacion() {
		return Period.between(this.fechaCreacion, LocalDate.now()).getDays();
	}
	
	public abstract double tamañoTotalOcupado();
	
	public abstract FileSystem archivoMasGrande();
	
	public abstract FileSystem archivoMasNuevo();
	
	public abstract FileSystem buscarArchivo(String nombreArch);
	
	public abstract List<FileSystem> buscarTodos(String nombreArch);
	
	public abstract String listarContenidoDesde(String path);
	
	public abstract boolean esArchivo();
}
