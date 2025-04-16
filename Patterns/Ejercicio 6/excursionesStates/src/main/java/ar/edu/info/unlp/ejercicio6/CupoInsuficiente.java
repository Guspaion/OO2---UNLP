package ar.edu.info.unlp.ejercicio6;

public class CupoInsuficiente implements EstadoExcursion {
	public CupoInsuficiente() {
		
	}

	@Override
	public boolean inscribirUsuario(Excursion context, Usuario user) {
		if(context.cupoMinimoAlcanzado()) {
			context.setEstado(new CupoMinimo());
		}
		return true;
	}

	@Override
	public String informar(Excursion context) {
		return("Usuarios restante para llenar el cupo mínimo: "
				+ context.usuariosRestantesParaCupoMinimo());
	}

}
