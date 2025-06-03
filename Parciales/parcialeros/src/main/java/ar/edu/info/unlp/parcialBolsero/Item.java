package ar.edu.info.unlp.parcialBolsero;

public abstract class Item {
	private int tamaño;
	private String nombre;
	
	public Item(int tamaño, String nombre) {
		this.tamaño = tamaño;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected int getTamaño() {
		return this.tamaño;
	}
	
	protected boolean agregarItem(Item item) {
		return false;
	}
	
	protected Item buscarObjeto(String nombreItem) {
		if (this.nombre.equals(nombreItem)) {
			return this;
		}
		return null;
	}
	
	protected int getEspacioTotalDisponible() {
		return 0;
	}
	protected int getEspacioMasGrandeDisponible(int espacioMax) {
		return 0;
	}
}
