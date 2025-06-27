package ar.edu.info.unlp.notSoParcialero;

import java.util.LinkedList;
import java.util.List;

public class Personaje {
	private String nombre;
	private int vida;
	private Arma arma;
	private Armadura armadura;
	private List<Habilidad> habilidades;
	
	public Personaje() {
		this.habilidades = new LinkedList<Habilidad>();
		this.vida = 100;
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarHabilidad(Habilidad h) {
		this.habilidades.add(h);
	}
	
	public boolean tieneVida() {
		return(this.vida > 0);
	}
	
	public void setArma(Arma a) {
		this.arma = a;
	}
	
	public void setArmadura(Armadura a) {
		this.armadura = a;
	}
	
	private void recibirDaño(Arma a) {
		this.vida -= this.armadura.defenderseArma(a);
	}
	
	public void enfrentarPersonaje(Personaje rival) {
		if(this.tieneVida() && rival.tieneVida()) {
			rival.recibirDaño(this.arma);
			if(rival.tieneVida()) {
				this.recibirDaño(rival.getArma());
			}
		} else {
			System.out.println("Uno de los peleadores no tiene vidubi");
		}
	}
}
