package ar.edu.info.unlp.parcialBuildero;

public abstract class PCBuilder {
	private Catalogo catalogo;
	private Presupuesto presupuesto;
	
	public PCBuilder(Catalogo catalogo) {
		this.catalogo = catalogo;
	}
	
	protected Componente getComponente(String descripcion) {
		return this.catalogo.getComponente(descripcion);
	}
	
	public abstract void buildProcesador();
	public abstract void buildMemoria();
	public abstract void buildDisco();
	public abstract void buildTarjeta();
	public abstract void buildGabinete();
	
	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}
	
	public void setUsuario(String usuario) {
		this.presupuesto.setUsuario(usuario);
	}
}
