package ar.edu.info.unlp.ejercicio6;

public interface EstadoExcursion {
	public boolean inscribirUsuario(Excursion context, Usuario user);
	
	public String informar(Excursion context);
}
