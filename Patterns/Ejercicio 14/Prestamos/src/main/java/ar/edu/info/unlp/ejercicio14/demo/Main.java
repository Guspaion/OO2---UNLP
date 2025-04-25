package ar.edu.info.unlp.ejercicio14.demo;

import java.time.LocalDate;

import ar.edu.info.unlp.ejercicio14.*;

public class Main {
	public static void main(String[] args) {
		SoportePrendas soporte = new SoportePrendas(new PrendaMixta());
		soporte.agregarPrestamo(new Automovil(3000, 2021, 5100));
		soporte.agregarPrestamo(new Alquiler(1600, LocalDate.of(2023, 4, 13), LocalDate.of(2027, 4, 1)));
		System.out.println("Coste total de la prenda: "+soporte.getValorPrenda());
	}
}
