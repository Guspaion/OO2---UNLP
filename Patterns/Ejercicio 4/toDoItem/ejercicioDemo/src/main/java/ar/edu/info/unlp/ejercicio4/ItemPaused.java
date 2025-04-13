package ar.edu.info.unlp.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class ItemPaused implements ItemState {
	public ItemPaused() {
		
	}

	@Override
	public boolean start(ToDoItem context) {
		return false;
	}

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new ItemInProgress());
	}

	@Override
	public boolean finish(ToDoItem context) {
		context.setState(new ItemFinished());
		return true;
	}
	
	@Override
	public Duration workedTime(LocalDate fechaIni, LocalDate fechaFin) {
		return(Duration.between(fechaIni, fechaFin));
	}


	@Override
	public boolean addComment() {
		return true;
	}
}
