package ar.edu.info.unlp.parcialMeteorologico;

public class DecoRadiacion extends WeatherDecorator {
	public DecoRadiacion(WeatherComponent component) {
		super(component);
	}
	
	public String displayData() {
		return (super.displayData() + " Radiacion solar: " + super.getRadiacionSolar());
	}
}
