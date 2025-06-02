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
	
	protected abstract boolean agregarItem(Item item);
	protected abstract Item buscarObjeto(String nombreItem);
	protected abstract int getEspacio();
}
