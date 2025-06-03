package ar.edu.info.unlp.parcialBolsero;

public class Jugador {
	private String nombre;
	private Bolsa bolsa;
	
	public Jugador(String nombre, int capInicial) {
		this.nombre = nombre;
		this.bolsa = new Bolsa(0, "Bolsa inicial", capInicial);
	}
	
	public boolean guardarItem(Item item) {
		return this.bolsa.agregarItem(item);
	}
	
	public Item buscarItem(String nombreItem) {
		return this.bolsa.buscarObjeto(nombreItem);
	}
	
	public int espacioMasGrandeDisponible() {
		return this.bolsa.getEspacioMasGrandeDisponible(0);
	}
	
	public int espacioTotalDisponible() {
		return this.bolsa.getEspacioTotalDisponible();
	}
}
