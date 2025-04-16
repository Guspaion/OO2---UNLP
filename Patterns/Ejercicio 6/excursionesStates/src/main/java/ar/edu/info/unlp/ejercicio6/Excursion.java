package ar.edu.info.unlp.ejercicio6;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private EstadoExcursion estado;
	
	public Excursion(String nom, LocalDate fIni, LocalDate fFin, String puntoEnc, double costo, int cMin, int cMax, EstadoExcursion estadoInicial) {
		this.nombre = nom;
		this.fechaIni = fIni;
		this.fechaFin = fFin;
		this.puntoEncuentro = puntoEnc;
		this.costo = costo;
		this.cupoMin = cMin;
		this.cupoMax = cMax;
		this.inscriptos = new LinkedList<Usuario>();
		this.enEspera = new LinkedList<Usuario>();
		this.estado = estadoInicial;
	}
	
	public void setEstado(EstadoExcursion nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public boolean cupoMinimoAlcanzado() {
		return(this.cupoMin > this.inscriptos.size());
	}
	
	public boolean cupoMaximoAlcanzado() {
		return(this.cupoMax == this.inscriptos.size());
	}
	
	public void agregarUsuario(Usuario user) {
		if(this.estado.inscribirUsuario(this, user)) {
			this.inscriptos.add(user);
		} else {
			this.enEspera.add(user);
		}
	}
	
	public int usuariosRestantesParaCupoMinimo() {
		return(this.cupoMin - this.inscriptos.size());
	}
	
	public int usuariosRestanteParaCupoMaximo() {
		return(this.cupoMax - this.inscriptos.size());
	} 
	
	public String getEmails(){
		return this.inscriptos.stream()
								.map(u -> u.getEmail())
								.collect(Collectors.joining(", "));
	}
	
	public String toString() {
		return ("Excursión: "+this.nombre+
				"\n Costo: "+this.costo+
				"\n Fecha de inicio: "+this.fechaIni.toString()+
				"\n Fecha de fin: "+this.fechaFin.toString()+
				"\n Punto de encuentro: "+this.puntoEncuentro+
				"\n "+ this.estado.informar(this));
	}
}
