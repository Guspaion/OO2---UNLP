package ar.edu.info.unlp.ejercicio19;

import java.util.List;

public interface WeatherData {
	public double getRadiacionSolar();
	public double getTemperatura();
	public double getPresion();
	public List<Double> getTemperaturas();
	public String displayData();
}
