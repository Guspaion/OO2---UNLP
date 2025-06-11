package ar.edu.info.unlp.parcialExcursionista;

public class Llena implements EstadoExcursion {
	public Llena() {
		
	}

	@Override
	public int getUsuariosFaltantes(Excursion context) {
		return 0;
	}

	@Override
	public void añadirInscripto(Excursion context, Usuario user) {
		context.addUser(user, context.getListaEspera());
	}

	@Override
	public String getInformacion(Excursion context) {
		return(context.getNombre() + "; " + context.getCosto() + "; " + context.getFechaInicio() +
				"; " + context.getFechaFin() + "; " + context.getPuntoEncuentro());
	}
}
