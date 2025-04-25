package ar.edu.info.unlp.ejercicio14;

public class SoportePrendas {
	private Prestamo prestamo;
	
	public SoportePrendas(Prestamo p) {
		this.prestamo = p;
	}
	
	public double getValorPrenda() {
		return this.prestamo.getValorPrendario();
	}
	
	public void agregarPrestamo(Prestamo p) {
		this.prestamo.agregarPrestamo(p);
	}
	
	public void quitarPrestamo(Prestamo p) {
		this.prestamo.quitarPrestamo(p);
	}
}
