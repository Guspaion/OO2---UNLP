package ar.edu.info.unlp.parcialMeteorologico;

public class DecoCelsius extends WeatherDecorator {
	public DecoCelsius(WeatherComponent component) {
		super(component);
	}
	
	private double getCelsius() {
		return ((super.getTempFarenheit() - 32) / 1.8);
	}
	
	public String displayData() {
		return (super.displayData() + " Temperatura C: " + this.getCelsius());
	}
}
