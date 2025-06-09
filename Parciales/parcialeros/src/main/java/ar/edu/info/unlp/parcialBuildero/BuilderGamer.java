package ar.edu.info.unlp.parcialBuildero;

public class BuilderGamer extends PCBuilder {

	public BuilderGamer(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void buildProcesador() {
		this.getPresupuesto().addComponente(super.getComponente("Procesador Gamer"));
		this.getPresupuesto().addComponente(super.getComponente("Pad térmico"));
		this.getPresupuesto().addComponente(super.getComponente("cooler"));
	}

	@Override
	public void buildMemoria() {
		this.getPresupuesto().addComponente(super.getComponente("32 GB"));
		this.getPresupuesto().addComponente(super.getComponente("32 GB"));
	}

	@Override
	public void buildDisco() {
		this.getPresupuesto().addComponente(super.getComponente("SSD 500 GB"));
		this.getPresupuesto().addComponente(super.getComponente("SSD 1 TB"));
	}

	@Override
	public void buildTarjeta() {
		this.getPresupuesto().addComponente(super.getComponente("RTX 4090"));
	}

	@Override
	public void buildGabinete() {
		this.getPresupuesto().addComponente(super.getComponente("Gabinete gaymer"));
		double consumo = super.getPresupuesto().calcularConsumo() * 1.5;
		this.getPresupuesto().addComponente(super.getComponente("fuente "+ consumo +" w"));
	}
}
