package ar.edu.info.unlp.ejercicio19;

public class PromedioFarenheitDecorator extends WeatherDisplayDecorator {

	public PromedioFarenheitDecorator(WeatherData component) {
		super(component);
	}

	private double calcularPromedioFarenheit() {
		return super.getTemperaturas().stream()
										.mapToDouble(t -> t.doubleValue())
										.average()
										.orElse(0);
	}
	
	public String displayData() {
		return super.displayData() + ("Promedio temperaturas F: "+this.calcularPromedioFarenheit());
	}
}
