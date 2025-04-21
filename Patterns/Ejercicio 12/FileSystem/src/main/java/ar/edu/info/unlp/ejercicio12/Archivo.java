package ar.edu.info.unlp.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends FileSystem {
	private double peso;
	
	public Archivo(String nombre, LocalDate fechaCreacion, double peso) {
		super(nombre, fechaCreacion);
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}

	@Override
	public double tamañoTotalOcupado() {
		return this.peso;
	}
	
	@Override
	public String listarContenidoDesde(String path) {
		return(path + "/" + super.getNombre() + "\n");
	}

	@Override
	public FileSystem archivoMasGrande() {
		return this;
	}

	@Override
	public FileSystem archivoMasNuevo() {
		return this;
	}

	@Override
	public Archivo buscarArchivo(String nombreArch) {
		return this;
	}

	@Override
	public List<FileSystem> buscarTodos(String nombreArch) {
		return null;
	}
	
	@Override
	public boolean esArchivo() {
		return true;
	}
}
