package ar.edu.info.unlp.parcialBuildero;

public class PCDirector {
	private PCBuilder builder;
	
	public PCDirector(PCBuilder builderIni) {
		this.builder = builderIni;
	}
	
	public void setBuilder(PCBuilder builder) {
		this.builder = builder;
	}
	
	public Presupuesto construct() {
		this.builder.buildDisco();
		this.builder.buildGabinete();
		this.builder.buildMemoria();
		this.builder.buildProcesador();
		this.builder.buildTarjeta();
		return this.builder.getPresupuesto();
	}
}
