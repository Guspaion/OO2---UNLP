package ar.edu.info.unlp.ejercicio15;

public class Gamer extends BuilderEquipo {
	public Gamer() {
		super();
	}

	@Override
	protected void buildProcesador() {
		super.agregarComponente(new Componente("Procesador gamer", "desc. procesador gamer", 4500, 300));
		super.agregarComponente(new Componente("Pad térmico", "desc. pad térmico", 2000, 100));
		super.agregarComponente(new Componente("Cooler", "desc. cooler", 1500, 80));
	}

	@Override
	protected void buildMemoriaRam() {
		Componente c = new Componente("RAM 32GB", "desc. memoria ram 32gb", 2500, 120);
		super.agregarComponente(c);
		super.agregarComponente(c);
	}

	@Override
	protected void buildDisco() {
		super.agregarComponente(new Componente("SSD 500GB", "desc. memoria ssd 500gb", 1800, 120));
		super.agregarComponente(new Componente("SSD 1000GB", "desc. memoria ssd 1000gb", 3000, 200));
	}

	@Override
	protected void buildGrafica() {
		super.agregarComponente(new Componente("RTX 4090", "desc. grafica rtx 4090", 5000, 300));
	}

	@Override
	protected void buildGabinete() {
		super.agregarComponente(new Componente("Gabinete Gamer", "desc. gabinete gamer", 1500, 0));
		String fuente = "fuente "+super.getConsumoActual()+"W";
		super.agregarComponente(new Componente("Fuente Gamer", "desc. "+fuente, 3500, 200));
	}
}
