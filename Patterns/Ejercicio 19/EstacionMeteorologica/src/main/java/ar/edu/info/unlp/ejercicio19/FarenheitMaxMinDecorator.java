package ar.edu.info.unlp.ejercicio19;

public class FarenheitMaxMinDecorator extends WeatherDisplayDecorator {

	public FarenheitMaxMinDecorator(WeatherData component) {
		super(component);
	}
	
	private double maxHistorico() {
		return super.getTemperaturas().stream()
										.max((t1 ,t2) -> Double.compare(t1.doubleValue(), t2.doubleValue()))
										.orElse(null);
	}
	
	private double minHistorico() {
		return super.getTemperaturas().stream()
										.min((t1, t2) -> Double.compare(t1.doubleValue(), t2.doubleValue()))
										.orElse(null);
	}		

	public String displayData() {
		return super.displayData() + ("Máximo: "+Math.round(this.maxHistorico())+
									", Mínimo: "+Math.round(this.minHistorico())+", ");
	}
}
