package ar.edu.info.unlp.ejercicio12;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Directorio extends FileSystem {
	private List<FileSystem> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		contenido = new LinkedList<FileSystem>();
	}
	
	public List<FileSystem> filtrarArchivos(List<FileSystem> lista){
		System.out.println("Entrando al directorio: "+this.getNombre());
		for (FileSystem fs: this.contenido) {
			if(fs.esArchivo()) {
				lista.add(fs);
				System.out.println("Archivo encontrado: "+fs.getNombre());
			} else {
				((Directorio) fs).filtrarArchivos(lista);
			}
		}
		return lista;
	}

	@Override
	public double tamañoTotalOcupado() {
		return (this.contenido.stream()
								.mapToDouble(d -> d.tamañoTotalOcupado())
								.sum() + 32);
	}

	@Override
	public FileSystem archivoMasGrande() {
		List<FileSystem> archivos = new LinkedList<FileSystem>();
		archivos = this.filtrarArchivos(archivos);
		return archivos.stream()
						.max((a1, a2) -> Double.compare(a1.tamañoTotalOcupado(), a2.tamañoTotalOcupado()))		
						.orElse(null);
	}

	@Override
	public FileSystem archivoMasNuevo() {
		List<FileSystem> archivos = new LinkedList<FileSystem>();
		archivos = this.filtrarArchivos(archivos);
		return archivos.stream()
						.min((a1, a2) -> Integer.compare(a1.getDiasDesdeCreacion(), a2.getDiasDesdeCreacion()))
						.orElse(null);
	}

	@Override
	public FileSystem buscarArchivo(String nombreArch) {
		List<FileSystem> archivos = new LinkedList<FileSystem>();
		archivos = this.filtrarArchivos(archivos);
		return archivos.stream()
					.map(a -> a.buscarArchivo(nombreArch))
					.findFirst()
					.orElse(null);
	}

	@Override
	public List<FileSystem> buscarTodos(String nombreArch) {
		List<FileSystem> archivos = new LinkedList<FileSystem>();
		archivos = this.filtrarArchivos(archivos);
		return archivos.stream()
					.map(a -> a.buscarArchivo(nombreArch))
					.collect(Collectors.toList());
	}

	@Override
	public String listarContenidoDesde(String path) {
		String miPath = path + "/" + this.getNombre();
		
		return miPath + "\n" +
			this.contenido.stream()
				.map(c -> c.listarContenidoDesde(miPath))
				.collect(Collectors.joining());
	}
	
	@Override
	public boolean esArchivo() {
		return false;
	}
	
	public void agregarContenido(FileSystem fs) {
		this.contenido.add(fs);
	}
}
