package ar.edu.info.unlp.ejercicio19;

import java.util.List;

public abstract class WeatherDisplayDecorator implements WeatherData {
	private WeatherData component;
	
	public WeatherDisplayDecorator(WeatherData component) {
		this.component = component;
	}

	@Override
	public double getRadiacionSolar() {
		return this.component.getRadiacionSolar();
	}

	@Override
	public double getTemperatura() {
		return this.component.getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.component.getPresion();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.component.getTemperaturas();
	}

	@Override
	public String displayData() {
		return this.component.displayData();
	}
}
