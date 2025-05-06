package ar.edu.info.unlp.ejercicio19;

public class CelsiusDecorator extends WeatherDisplayDecorator {
	public CelsiusDecorator(WeatherData component) {
		super(component);
	}
	
	private double getCelsius() {
		return ((super.getTemperatura() - 32) / 1.8);
	}

	public String displayData() {
		return super.displayData() + ("Temperatura C: "+this.getCelsius()+", ");
	}
}
