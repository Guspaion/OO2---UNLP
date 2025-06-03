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
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	private int getEspacioOcupado() {
		return this.items.stream()
							.mapToInt(i -> i.getTamaño()).sum();
	}
	
	
	public boolean hayLugar(int tamañoItem) {
		return ((this.getEspacioDisponible() + tamañoItem) <= this.capacidad);
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
	
	public int getEspacioDisponible() {
		return(this.capacidad - this.getEspacioOcupado());
	}
	
	@Override
	public int getEspacioMasGrandeDisponible(int espacioMax) {
		int espacioAct;
		for (Item i: this.items) {
			espacioAct = i.getEspacioMasGrandeDisponible(espacioMax);
			if(espacioAct > espacioMax) {
				espacioMax = espacioAct;
			}
		}
		espacioAct = this.getEspacioDisponible();
		if(espacioAct > espacioMax) {
			espacioMax = espacioAct;
		}
		return espacioMax;
	}
	
	@Override
	protected int getEspacioTotalDisponible() {
		int espacioTotal = this.getEspacioDisponible();
		for(Item i: this.items) {
			espacioTotal += i.getEspacioTotalDisponible();
		}
		return espacioTotal;
	}
}
