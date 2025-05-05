package ar.edu.info.unlp.ejercicio19;

public class PresionDecorator extends WeatherDisplayDecorator {
	public PresionDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		return super.displayData() + ("Presión: "+super.getPresion());
	}
}
