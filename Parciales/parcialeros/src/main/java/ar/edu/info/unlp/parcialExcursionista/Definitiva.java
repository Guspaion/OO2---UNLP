package ar.edu.info.unlp.parcialExcursionista;

public class Definitiva implements EstadoExcursion {
	public Definitiva() {
		
	}

	@Override
	public int getUsuariosFaltantes(Excursion context) {
		return(context.getCupoMaximo() - context.getCantInscriptos());
	}

	@Override
	public void añadirInscripto(Excursion context, Usuario user) {
		context.addUser(user, context.getInscriptos());
		if(context.getCantInscriptos() >= context.getCupoMaximo()) {
			context.setEstado(new Llena());
		}
	}

	@Override
	public String getInformacion(Excursion context) {
		return(context.getNombre() + "; " + context.getCosto() + "; " + context.getFechaInicio() + 
				"; " + context.getFechaFin() + "; " + context.getMailsInscriptos() +
				"; " + this.getUsuariosFaltantes(context));
	}
}
