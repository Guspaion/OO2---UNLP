package ar.edu.info.unlp.ejercicio20;

import java.util.HashSet;
import java.util.Set;

public class Character {
	private String nombre;
	private int HP;
	private Arma arma;
	private Armadura armadura;
	private Set<Habilidad> habilidades;
	
	public Character(String nom, Arma arma, Armadura armadura) {
		this.nombre = nom;
		this.HP = 100;
		this.arma = arma;
		this.armadura = armadura;
		this.habilidades = new HashSet<Habilidad>();
	}
	
	public void agregarHabilidad(Habilidad h) {
		this.habilidades.add(h);
	}
	
	public boolean tieneHP() {
		return HP > 0;
	}
	
	public void atacar(Character objetivo) {
		if(this.tieneHP() && objetivo.tieneHP()) {
			objetivo.recibirAtaque(this.arma.calcularDaño(objetivo.armadura));	
		}
	}
	
	public void recibirAtaque(int daño) {
		this.HP -= daño;
	}
}
