package ar.edu.info.unlp.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class ItemFinished implements ItemState {
	public ItemFinished() {
		
	}

	@Override
	public boolean start(ToDoItem context) {
		return false;
	}

	@Override
	public void togglePause(ToDoItem context) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean finish(ToDoItem context) {
		return true;
	}
	
	@Override
	public Duration workedTime(LocalDate fechaIni, LocalDate fechaFin) {
		return Duration.between(fechaIni, fechaFin);
	}

	@Override
	public boolean addComment() {
		return false;
	}
}
