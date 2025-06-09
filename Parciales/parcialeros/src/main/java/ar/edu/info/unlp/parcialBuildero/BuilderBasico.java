package ar.edu.info.unlp.parcialBuildero;

public class BuilderBasico extends PCBuilder {
	
	public BuilderBasico(Catalogo catalogo) {
		super(catalogo);
	}

	@Override
	public void buildProcesador() {
		this.getPresupuesto().addComponente(super.getComponente("Procesador Básico"));
	}
	
	@Override
	public void buildMemoria() {
		this.getPresupuesto().addComponente(super.getComponente("8 GB"));
	}

	@Override
	public void buildDisco() {
		this.getPresupuesto().addComponente(super.getComponente("HDD 500GB"));
	}

	@Override
	public void buildTarjeta() {

	}

	@Override
	public void buildGabinete() {
		this.getPresupuesto().addComponente(super.getComponente("Gabiente Estándar"));		
	}
}
