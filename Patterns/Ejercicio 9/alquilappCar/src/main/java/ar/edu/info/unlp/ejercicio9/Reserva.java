package ar.edu.info.unlp.ejercicio9;

import java.time.LocalDate;

public class Reserva {
	private Usuario conductor;
	private AutoEnAlquiler auto;
	private int cantDias;
	private LocalDate fecha;
	private PoliticaReembolso politicaReembolso;
	
	public Reserva(Usuario conductor, AutoEnAlquiler auto, int cantDias, LocalDate fecha, PoliticaReembolso politicaIni) {
		this.conductor = conductor;
		this.auto = auto;
		this.cantDias = cantDias;
		this.fecha = fecha;
		this.politicaReembolso = politicaIni;
	}
	
	private void setPolitica(PoliticaReembolso nuevaPolitica) {
		this.politicaReembolso = nuevaPolitica;
	}
	
	public double montoAPagar() {
		return (this.cantDias * auto.getPrecioPorDia()); //El getter esta medio feo pero me restringe el UML
	}

	public double montoAReembolsar() {
		return this.politicaReembolso.montoAReembolsar(this);
	}
	
	public double reembolsoTotal() {
		return this.montoAPagar();
	}
	
	public double reembolsoMitad(){
		return (this.montoAPagar() * 0.5);
	}
	
	public void flexible() {
		this.setPolitica(new Flexible());
	}
	
	public void moderada() {
		this.setPolitica(new Moderada());
	}
	
	public void estricta() {
		this.setPolitica(new Estricta());
	}
}
