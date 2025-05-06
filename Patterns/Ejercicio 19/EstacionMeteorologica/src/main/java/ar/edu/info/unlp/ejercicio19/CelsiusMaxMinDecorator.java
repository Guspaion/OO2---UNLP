package ar.edu.info.unlp.ejercicio19;

public class CelsiusMaxMinDecorator extends WeatherDisplayDecorator {
	public CelsiusMaxMinDecorator(WeatherData component) {
		super(component);
	}
	
	public double getCelsius(double temp) {
		return ((temp - 32) - 1.8);
	}
	
	private double maxHistorico() {
		return this.getCelsius(super.getTemperaturas().stream()
										.max((t1 ,t2) -> Double.compare(t1.doubleValue(), t2.doubleValue()))
										.orElse(null));
	}
	
	private double minHistorico() {
		return this.getCelsius(super.getTemperaturas().stream()
										.min((t1, t2) -> Double.compare(t1.doubleValue(), t2.doubleValue()))
										.orElse(null));
	}		

	public String displayData() {
		return super.displayData() + ("Máximo: "+this.maxHistorico()+
									", Mínimo: "+this.minHistorico()+", ");
	}
}
