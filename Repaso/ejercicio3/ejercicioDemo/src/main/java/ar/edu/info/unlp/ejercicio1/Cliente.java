package ar.edu.info.unlp.ejercicio1;

import java.time.LocalDate;

public interface Cliente {
	/** 
	* Retorna el límite de crédito del cliente
	*/
	public double lmtCrdt();  //La firma del metodo debería ser más descriptivo, en este caso pareciera ser un getter
	
	//Corrección
	public double getLimiteDeCredito();
	
	
	/** 
	* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
	*/
	protected double mtFcE(LocalDate f1, LocalDate f2); //Hay una mala elección del nombre de la firma del metodo de nuevo, además el alcance del metodo debeía ser público
	//los nombres de los parámetros no estan del todo mal, pero también podrían ser un poco más descriptivos (capaz?)
	
	//Corrección:
	public double getMontoFacturadoEntreFechas(LocalDate fechaIni, LocalDate fechaFin);
	
	
	
	/** 
	* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
	*/
	private double mtCbE(LocalDate f1, LocalDate f2);  //Mismos problemas que el anterior

	//Corrección:
	public double getMontoCobradoEntreFechas(LocalDate fechaIni, LocalDate fechaFin);
}
