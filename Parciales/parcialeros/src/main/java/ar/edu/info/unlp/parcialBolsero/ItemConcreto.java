package ar.edu.info.unlp.parcialBolsero;

public class ItemConcreto extends Item {
	private String nombre;
	
	public ItemConcreto(int tamaño, String nombre) {
		super(tamaño, nombre);
	}

	@Override
	protected boolean agregarItem(Item item) {
		return false;
	}

	@Override
	protected Item buscarObjeto(String nombreItem) {
		if (this.nombre.equals(nombreItem)) {
			return this;
		}
		return null;
	}
	
	@Override
	protected int getEspacio() {
		return 0;
	}
}
