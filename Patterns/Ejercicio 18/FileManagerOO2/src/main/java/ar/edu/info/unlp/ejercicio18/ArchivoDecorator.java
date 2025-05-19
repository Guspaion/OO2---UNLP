package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;

public class ArchivoDecorator implements Archivo {
	private Archivo component;
	
	public ArchivoDecorator(Archivo component) {
		this.component = component;
	}

	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public double getTamaño() {
		return this.component.getTamaño();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}

	@Override
	public String prettyPrint() {
		return " - ";
	}

}
