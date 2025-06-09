package ar.edu.info.unlp.parcialBuildero;

public class BuilderIntermedio extends PCBuilder {

	public BuilderIntermedio(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void buildProcesador() {
		this.getPresupuesto().addComponente(super.getComponente("Procesador Intermedio"));
	}

	@Override
	public void buildMemoria() {
		this.getPresupuesto().addComponente(super.getComponente("16 GB"));
	}

	@Override
	public void buildDisco() {
		this.getPresupuesto().addComponente(super.getComponente("SSD 500 GB"));
	}

	@Override
	public void buildTarjeta() {
		this.getPresupuesto().addComponente(super.getComponente("GTX 1650"));
	}

	@Override
	public void buildGabinete() {
		this.getPresupuesto().addComponente(super.getComponente("Gabinete Intermedio"));
		this.getPresupuesto().addComponente(super.getComponente("Fuente 800 w"));
	}

}
