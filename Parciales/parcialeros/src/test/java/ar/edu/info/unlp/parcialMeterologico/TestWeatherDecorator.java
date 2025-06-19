package ar.edu.info.unlp.parcialMeterologico;

import ar.edu.info.unlp.parcialMeteorologico.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestWeatherDecorator {
	private WeatherComponent station;
	private WeatherComponent decoPresion;
	private WeatherComponent decoRadiacion;
	
	@BeforeEach
	void setUp() {
		this.station = new HomeWeatherStation();
		this.decoPresion = new DecoPresion(this.station);
		this.decoRadiacion = new DecoRadiacion(this.decoPresion);
	}
	
	@Test
	void testEj2() {
		String esperado = " Presion atmosferica: 1008.0 Radiacion solar: 500.0";
		assertEquals(esperado, this.decoRadiacion.displayData());
	}
}
