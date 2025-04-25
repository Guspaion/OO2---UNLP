package ar.edu.info.unlp.demo;

import ar.edu.info.unlp.ejercicio13.*;

public class Main {
	private static double getPrecioSandwich(SubteWay sWay) {
		sWay.buildSanwich();
		return sWay.getResult().getPrecioTotal();
	}
	
	public static void main(String[] args) {
		SubteWay subteWay = new SubteWay(new Clasico());
		System.out.println("Precio sandwich clásico: "+getPrecioSandwich(subteWay));
		subteWay.builderSinTACC();
		System.out.println("Precio sandwich sin TACC: "+getPrecioSandwich(subteWay));
		subteWay.builderVegano();
		System.out.println("Precio sandwich vegano: "+getPrecioSandwich(subteWay));
		subteWay.builderVegetariano();
		System.out.println("Precio sandwich vegetariano: "+getPrecioSandwich(subteWay));
	}
}
