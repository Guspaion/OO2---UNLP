package ar.edu.info.unlp.parcialBolsero;

import java.util.LinkedList;
import java.util.List;

public class Bolsa extends Item {
	private int capacidad;
	private List<Item> items;
	
	public Bolsa(int tamaño, String nombre, int capacidad) {
		super(tamaño, nombre);
		this.capacidad = capacidad;
		this.items = new LinkedList<Item>();
	}
	
	private int getEspacioOcupado() {
		return this.items.stream()
							.mapToInt(i -> i.getTamaño()).sum();
	}
	
	public boolean hayLugar(int tamañoItem) {
		return ((this.getEspacio() + tamañoItem) <= this.capacidad);
	}
	
	@Override
	public boolean agregarItem(Item item) {
	    if (this.hayLugar(item.getTamaño())) {
	        this.items.add(item);
	        return true;
	    }
	    for (Item i : this.items) {
	        if (i.agregarItem(item)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	@Override
	public Item buscarObjeto(String nombreItem) {
		if(super.getNombre().equals(nombreItem)) {
			return this;
		}
		for(Item i: this.items) {
			Item itemBuscado = i.buscarObjeto(nombreItem);
			if(itemBuscado != null) {
				return itemBuscado;
			}
		}
		return null;
	}
	
	@Override
	public int getEspacio() {
		return(this.capacidad - this.getEspacioOcupado());
	}
	
	public int getEspacioMasGrandeDisponible() {
	    return this.items.stream()
	        .map(Item::getEspacio)
	        .max(Integer::compare)
	        .orElse(0);
	} //Version de gepcimus

	
	/*
	public int getEspacioMasGrandeDisponible() {
		Item bolsaMax = this.items.stream()
						.max((i1, i2) -> Integer.compare(i1.getEspacio(), i2.getEspacio()))
						.orElse(null);
		if(bolsaMax != null) {
			return bolsaMax.getEspacio();
		}
		return 0;
	}
	La cagada aca es que no puedo tirar el .getEspacio() despues del .orElse(null) porque si es null
	tira excepción
	*/
	
	public int getEspacioTotalDisponible() {
		return this.items.stream()
						.mapToInt(i -> i.getEspacio()).sum();
	}
}
