package ar.edu.info.unlp.ejercicio19;

public class RadiacionDecorator extends WeatherDisplayDecorator {
	public RadiacionDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		return super.displayData() + ("Radiación solar: "+super.getRadiacionSolar());
	}
}
