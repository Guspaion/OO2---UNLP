package ar.edu.info.unlp.parcialExcursionista;

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
	private int cupoMaximo;
	private int cupoMinimo;
	private EstadoExcursion estado;
	private List<Usuario> inscriptos;
	private List<Usuario> listaEspera;
	
	public Excursion(String nombre, LocalDate fIni, LocalDate fFin, String pEncuentro, double costo, int cMax, int cMin) {
		this.nombre = nombre;
		this.fechaIni = fIni;
		this.fechaFin = fFin;
		this.puntoEncuentro = pEncuentro;
		this.costo = costo;
		this.cupoMaximo = cMax;
		this.cupoMinimo = cMin;
		this.estado = new Provisoria();
		this.inscriptos = new LinkedList<Usuario>();
		this.listaEspera = new LinkedList<Usuario>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaInicio() {
		return this.fechaIni;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}

	public int getCantInscriptos() {
		return this.inscriptos.size();
	}
	
	public List<Usuario> getInscriptos() {
		return this.inscriptos;
	}
	
	public List<Usuario> getListaEspera() {
		return this.listaEspera;
	}
	
	public void addUser(Usuario user, List<Usuario> users) {
		users.add(user);
	}
	
	public void setEstado(EstadoExcursion nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public String getMailsInscriptos() {
		return(this.inscriptos.stream()
								.map(i -> i.getEmail())
								.collect(Collectors.joining(" - ")));
	}
	
	public void añadirInscripto(Usuario user) {
		this.estado.añadirInscripto(this, user);
	}
	
	public String getInformacion() {
		return this.estado.getInformacion(this);
	}
}
