package ar.edu.info.unlp.ejercicio6;

public class CupoMinimo implements EstadoExcursion {
	public CupoMinimo() {
		
	}

	@Override
	public boolean inscribirUsuario(Excursion context, Usuario user) {
		if(context.cupoMaximoAlcanzado()) {
			context.setEstado(new CupoMaximo());
		}
		return true;
	}

	@Override
	public String informar(Excursion context) {
		return("Emails de inscriptos: "+context.getEmails()+
				"\n Cupos restantes: "+context.usuariosRestanteParaCupoMaximo());
	}
}
