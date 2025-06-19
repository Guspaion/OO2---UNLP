package ar.edu.info.unlp.parcialMeteorologico;

import java.util.LinkedList;
import java.util.List;

public abstract class WeatherComponent {
	private List<Double> temperaturas;
	
	public WeatherComponent() {
		this.temperaturas = new LinkedList<Double>();
	}
	
	public double getTempFarenheit() {
		return 82.4;
	}
	
	public double getPresion() {
		return 1008;
	}
	
	public double getRadiacionSolar() {
		return 500;
	}
	
	public List<Double> getTempsFarenheit() {
		return this.temperaturas;
	}
	
	public String displayData() {
		return "";
	}
}
