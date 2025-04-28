package ar.edu.info.unlp.ejercicio15;

public class Intermedio extends BuilderEquipo {
	public Intermedio() {
		super();
	}

	@Override
	protected void buildProcesador() {
		super.agregarComponente(new Componente("Procesador intermedio", "desc. procesador intermedio", 4000, 250));
	}

	@Override
	protected void buildMemoriaRam() {
		super.agregarComponente(new Componente("RAM 16GB", "desc. memoria ram 16gb", 2000, 150));
	}

	@Override
	protected void buildDisco() {
		super.agregarComponente(new Componente("SSD 500GB", "desc. memoria ssd 500gb", 1800, 120));
	}

	@Override
	protected void buildGrafica() {
		super.agregarComponente(new Componente("Grafica GTX 1650", "desc. gtx 1650", 3800, 200));
	}

	@Override
	protected void buildGabinete() {
		super.agregarComponente(new Componente("Gabinete intermedio", "desc. gabinete intermedio", 1000, 0));
		super.agregarComponente(new Componente("Fuente 800W", "desc. fuente 800w", 1500, 100));
	}
}
