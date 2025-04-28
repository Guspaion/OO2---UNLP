package ar.edu.info.unlp.ejercicio15;

public class Basico extends BuilderEquipo {
	public Basico() {
		super();
	}

	@Override
	protected void buildProcesador() {
		super.agregarComponente(new Componente("Procesador básico", "desc. procesador basico", 3000, 200));
	}

	@Override
	protected void buildMemoriaRam() {
		super.agregarComponente(new Componente("RAM 8GB", "desc. memoria ram 8gb", 1500, 100));
	}

	@Override
	protected void buildDisco() {
		super.agregarComponente(new Componente("HDD 500GB", "desc. memoria hdd 500gb", 1300, 80));
	}

	@Override
	protected void buildGrafica() {
		
	}

	@Override
	protected void buildGabinete() {
		super.agregarComponente(new Componente("Gabinete estándar", "desc. gabinete estándar", 500, 0));
		super.agregarComponente(new Componente("Fuente estándar", "desc. fuente estándar", 800, 60));
	}
}
