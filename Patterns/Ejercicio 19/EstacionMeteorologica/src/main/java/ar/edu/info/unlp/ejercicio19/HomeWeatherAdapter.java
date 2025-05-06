package ar.edu.info.unlp.ejercicio19;

import java.util.List;

public class HomeWeatherAdapter implements WeatherData {
	private WeatherData estacion;
	
	public HomeWeatherAdapter(WeatherData estacion) {
		this.estacion = estacion;
	}
	
	@Override
	public double getTemperatura() {
		return this.estacion.getTemperatura();
	}

	@Override
	public double getRadiacionSolar() {
		return this.estacion.getRadiacionSolar();
	}

	@Override
	public double getPresion() {
		return this.estacion.getPresion();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.estacion.getTemperaturas();
	}

	@Override
	public String displayData() {
		return "";
	}
}
