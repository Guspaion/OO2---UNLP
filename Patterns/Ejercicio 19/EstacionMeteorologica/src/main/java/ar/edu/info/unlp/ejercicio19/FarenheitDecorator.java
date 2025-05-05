package ar.edu.info.unlp.ejercicio19;

public class FarenheitDecorator extends WeatherDisplayDecorator {
	public FarenheitDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		return super.displayData() + ("Temperatura F: "+super.getTemperatura());
	}
}
