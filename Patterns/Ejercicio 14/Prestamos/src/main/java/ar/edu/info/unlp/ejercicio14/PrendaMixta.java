package ar.edu.info.unlp.ejercicio14;

import java.util.List;
import java.util.LinkedList;

public class PrendaMixta extends Prestamo {
	private List<Prestamo> prestamos;

	public PrendaMixta() {
		super();
		this.prestamos = new LinkedList<Prestamo>();
	}

	@Override
	protected double getCosto() {
		return this.prestamos.stream()
								.mapToDouble(p -> p.getValorPrendario())
								.sum();
	}
	
	@Override
	public double getValorPrendario() {
		return this.getCosto() * 0.5;
	}
	
	@Override
	public void agregarPrestamo(Prestamo p) {
		this.prestamos.add(p);
	}
	
	@Override
	public void quitarPrestamo(Prestamo p) {
		if(this.prestamos.contains(p)) {
			this.prestamos.remove(p);
		}
	}
}
