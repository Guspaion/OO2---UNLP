package ar.edu.info.unlp.parcialMeteorologico;

public class DecoPresion extends WeatherDecorator {
	public DecoPresion(WeatherComponent component) {
		super(component);
	}
	
	public String displayData() {
		return (super.displayData() + " Presion atmosferica: " + super.getPresion());
	}
}
