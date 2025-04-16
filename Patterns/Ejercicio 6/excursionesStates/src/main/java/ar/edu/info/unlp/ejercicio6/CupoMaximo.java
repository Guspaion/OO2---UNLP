package ar.edu.info.unlp.ejercicio6;

public class CupoMaximo implements EstadoExcursion {
	public CupoMaximo() {
		
	}

	@Override
	public boolean inscribirUsuario(Excursion context, Usuario user) {
		return false;
	}

	@Override
	public String informar(Excursion context) {
		return("");
	}
}
