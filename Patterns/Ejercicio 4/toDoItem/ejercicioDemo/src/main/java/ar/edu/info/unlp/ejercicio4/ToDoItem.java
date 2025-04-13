package ar.edu.info.unlp.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
	private ItemState state;
	private String name;
	private List<String> comments;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public ToDoItem(ItemState initialState, String name) {
		this.state = initialState;
		this.name = name;
		this.comments = new LinkedList<String>();
	}
	
	public void setState(ItemState state) {
		this.state = state;
	}
	
	public void start() {
		if(this.state.start(this)) {
			this.startDate = LocalDate.now();
		}
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		if(this.state.finish(this)) {
			this.endDate = LocalDate.now();
		}
	}
	
	public Duration WorkedTime() {
		return(this.state.workedTime(startDate, endDate));
	}
	
	public void addComment(String comment) {
		if(this.state.addComment()) {
			this.comments.add(comment);
		}
	}
}
