package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public interface Archivo {
	
	public String getNombre();
	public String getExtension();
	public double getTamaño();
	public LocalDate getFechaCreacion();
	public LocalDate getFechaModificacion();
	public String getPermisos();
	public String prettyPrint();
	
}
