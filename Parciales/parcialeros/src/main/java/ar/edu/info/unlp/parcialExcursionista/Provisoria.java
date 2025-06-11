package ar.edu.info.unlp.parcialExcursionista;

public class Provisoria implements EstadoExcursion {
	public Provisoria() {
		
	}

	@Override
	public int getUsuariosFaltantes(Excursion context) {
		return(context.getCupoMinimo() - context.getCantInscriptos());
	}

	@Override
	public void añadirInscripto(Excursion context, Usuario user) {
		context.addUser(user, context.getInscriptos());
		if(context.getCantInscriptos() >= context.getCupoMinimo()) {
			context.setEstado(new Definitiva());
		}
	}

	@Override
	public String getInformacion(Excursion context) {
		return(context.getNombre() + "; " + context.getCosto() + "; " + context.getFechaInicio() + "; "
				+ context.getFechaFin() + "; " + context.getPuntoEncuentro() +
				"; " + this.getUsuariosFaltantes(context));
	}
}
