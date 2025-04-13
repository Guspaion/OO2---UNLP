package ar.edu.info.unlp.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public class ItemPending implements ItemState {
	public ItemPending() {
		
	}

	@Override
	public boolean start(ToDoItem context) {
		context.setState(new ItemInProgress());
		return true;
	}

	@Override
	public void togglePause(ToDoItem context) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean finish(ToDoItem context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Duration workedTime(LocalDate fechaIni, LocalDate fechaFin) {
		throw new RuntimeException("La tarea aún no fue inicada");
	}

	@Override
	public boolean addComment() {
		return true;
	}
}
