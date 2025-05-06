import ar.edu.info.unlp.ejercicio19.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTest {
	private WeatherData weatherAdapter;
	private HomeWeatherStation station;
	
	@BeforeEach
	void setUp() {
		this.station = new HomeWeatherStation(86, 1008, 200);
		this.weatherAdapter = new HomeWeatherAdapter(station);
		this.station.agregarTemp(86.0);
		this.station.agregarTemp(88.0);
		this.station.agregarTemp(79.0);
	}
	
	@Test
	void testEj1() {
		String esperado = "Temperatura F: 86.0, Presión atmosf.: 1008.0, Radiación solar: 200.0, ";
		WeatherData display = new RadiacionDecorator(new PresionDecorator(new FarenheitDecorator(weatherAdapter)));
		assertEquals(esperado, display.displayData());
	}
	
	@Test
	void testPersonalizado() {
		String esperado = "Temperatura C: 30.0, Radiación solar: 200.0, Máximo: 88, Mínimo: 79, Promedio temperaturas F: 84, Promedio temperaturas C: 29, ";
		WeatherData display = new PromedioCelsiusDecorator(new PromedioFarenheitDecorator(new FarenheitMaxMinDecorator(new RadiacionDecorator(new CelsiusDecorator(weatherAdapter)))));
		assertEquals(esperado, display.displayData());
	}
}
