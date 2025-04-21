package ar.edu.info.unlp.ejercicio12;

import java.util.List;

public class SistemaOperativo {
	private FileSystem fileSystem;
	
	public SistemaOperativo(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}
	
	public double espacioOcupadoPorFileSystem() {
		return this.fileSystem.tamañoTotalOcupado();
	}
	
	public FileSystem getArchivoMasGrande() {
		return this.fileSystem.archivoMasGrande();
	}
	
	public FileSystem getArchivoMasNueov() {
		return this.fileSystem.archivoMasNuevo();
	}
	
	public FileSystem buscarArchivo(String nombreArchivo) {
		return this.fileSystem.buscarArchivo(nombreArchivo);
	}
	
	public List<FileSystem> buscarTodos(String nombreArchivo){
		return this.fileSystem.buscarTodos(nombreArchivo);
	}
	
	public String listarContenido() {
		return this.fileSystem.listarContenido();
	}
}
