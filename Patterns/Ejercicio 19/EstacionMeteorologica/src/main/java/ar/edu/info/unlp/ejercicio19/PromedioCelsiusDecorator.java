package ar.edu.info.unlp.ejercicio19;

public class PromedioCelsiusDecorator extends WeatherDisplayDecorator {

	public PromedioCelsiusDecorator(WeatherData component) {
		super(component);
	}
	
	private double getCelsius(double temp) {
		return ((temp - 32) / 1.8);
	}
	
	private double calcularPromedioCelsius() {
		return this.getCelsius(this.getTemperaturas().stream()
														.mapToDouble(t -> t.doubleValue())
														.average()
														.orElse(0));
	}
	
	public String displayData() {
		return super.displayData() + ("Promedio temperaturas C: "+this.calcularPromedioCelsius());
	}
}
