package ar.edu.info.unlp.parcialMeteorologico;

public class DecoFarenheit extends WeatherDecorator {
	public DecoFarenheit(WeatherComponent component) {
		super(component);
	}
	
	public String displayData() {
		return (super.displayData() + " Temperatura F: " + super.getTempFarenheit());
	}
}
