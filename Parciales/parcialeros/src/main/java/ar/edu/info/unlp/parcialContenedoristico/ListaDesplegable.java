package ar.edu.info.unlp.parcialContenedoristico;

public class ListaDesplegable {
	private String text;
	private String style;
	
	public ListaDesplegable(String text, String style) {
		this.text = text;
		this.style = style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	public String print() {
		return "<listaDesplegable" + this.style + ">"
				+ this.text + "<listaDesplegable/>";
	}
}
