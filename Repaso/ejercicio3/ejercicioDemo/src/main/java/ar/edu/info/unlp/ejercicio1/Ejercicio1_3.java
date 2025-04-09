package ar.edu.info.unlp.ejercicio1;

import java.util.*;

public class Ejercicio1_3 {
	
	/*Para empezar el método es ve muy largo, es posible que se pueda dividir en varios métodos mas pequeños, en principio es evidente que el calculo del promedio de las
	edades podría hacerse por separado al igual que el total de los salarios, a su vez es posible implementar la solución con streams en lugar de implementar un for each
	desde 0. Incluso delegando la tarea de calculo a otros métodos este sigue suiendo muy largo, podríamos separar imprimirPromedioEdades e imprimirSalariosTotales en 2
	métodos distintos. Todo esto asumiendo que la lista de edades y la lista de salarios se encuentran como atributos de la clase donde se encuentran los métodos

	Implementación: */
	
	private List<Integer> edades;
	private List<Double> salarios;

	public Ejercicio1_3() {
		
	}
	
	public OptionalDouble calcularPromedioEdades(){
		return(this.edades.stream().mapToInt(edad -> edad.intValue()).average());
	}
	
	public double calcularTotalSalarios() {
		return(this.salarios.stream().mapToDouble(salario -> salario.doubleValue()).sum());
	}
	
	public void imprimirPromedioEdades() {
		System.out.print("El promedio de edades es " + this.calcularPromedioEdades());
	}
	
	public void imprimirSalarioTotal() {
		System.out.print("El total de salarios es " + this.calcularTotalSalarios());
	}
	
	public void imprimirValores() {
		imprimirPromedioEdades();
		imprimirSalarioTotal();
	}
}
