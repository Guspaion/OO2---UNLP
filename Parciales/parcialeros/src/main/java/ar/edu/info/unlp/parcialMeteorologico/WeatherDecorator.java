package ar.edu.info.unlp.parcialMeteorologico;

public abstract class WeatherDecorator extends WeatherComponent {
	private WeatherComponent component;
	
	public WeatherDecorator(WeatherComponent component) {
		super();
		this.component = component;
	}
	
	public String displayData() {
		return component.displayData();
	}
}
