package ar.edu.info.unlp.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;

	public HomeWeatherStation(double temp, double pres, double radSolar) {
		this.temperatura = temp;
		this.presion = pres;
		this.radiacionSolar = radSolar;
		this.temperaturas = new LinkedList<Double>();
	}
	
	@Override
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}

	@Override
	public double getTemperatura() {
		return this.temperatura;
	}

	@Override
	public double getPresion() {
		return this.presion;
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.temperaturas;
	}

	@Override
	public String displayData() {
		return ("Temperatura: "+this.getTemperatura()+
				"Presion: "+this.getPresion()+
				"Radiacion Solar: "+this.getRadiacionSolar());
	}

	public void agregarTemp(Double temp) {
		this.temperaturas.add(temp);
	}
}
