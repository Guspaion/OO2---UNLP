package ar.edu.info.unlp.parcialMeteorologico;

public class DecoPromedioTemps extends WeatherDecorator {
	public DecoPromedioTemps(WeatherComponent component) { 
		super(component);
	}
	
	private double getPromedioFarenheit() {
		return super.getTempsFarenheit().stream()
										.mapToDouble(t -> t.doubleValue())
										.average().orElse(0);
	}
	
	public String displayData() {
		return (super.displayData() + " Promedio de temperaturas F: " + this.getPromedioFarenheit());
	}
}
