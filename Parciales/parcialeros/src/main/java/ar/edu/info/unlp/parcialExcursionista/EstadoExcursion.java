package ar.edu.info.unlp.parcialExcursionista;

public interface EstadoExcursion {
	
	public int getUsuariosFaltantes(Excursion context);
	public void añadirInscripto(Excursion context, Usuario user);
	public String getInformacion(Excursion context);
	
}
