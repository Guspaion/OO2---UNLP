package ar.edu.info.unlp.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public interface ItemState {
	
	public boolean start(ToDoItem context) ;
	
	public void togglePause(ToDoItem context);
	
	public boolean finish(ToDoItem context);
	
	public Duration workedTime(LocalDate fechaIni, LocalDate fechaFin);
	
	public boolean addComment();
}
