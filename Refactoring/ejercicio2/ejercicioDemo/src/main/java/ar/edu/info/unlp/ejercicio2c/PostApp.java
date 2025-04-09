package ar.edu.info.unlp.ejercicio2c;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	List<Post> posts;
	
	public PostApp() {
		this.posts = new LinkedList<Post>();
	}
	
	private boolean addPost(Post p) {
		if(!this.posts.contains(p)) {
			this.posts.add(p);
			return true;
		}
		return false;
	}
	
	private List<Post> generarListaSinUsuario(String uName){
		return(this.posts.stream()
				.filter(p -> p.noEsUsuario(uName))
				.collect(Collectors.toList()));
	}
	
	private List<Post> ordenarListaPorFechasRecientes(List<Post> listaPosts){
		return(listaPosts.stream()
				.sorted((p1, p2) -> p1.getFecha().compareTo(p2.getFecha()))
				.collect(Collectors.toList()));
	}
	
	private List<Post> truncarLista(List<Post> listaPosts, int cant){
		return(listaPosts.stream().limit(cant).collect(Collectors.toList()));
	}
	
	private List<Post> generarListaDeUltimosPosts(String uName, int cant){
		List<Post> ultimosPosts = this.generarListaSinUsuario(uName);
		ultimosPosts = this.ordenarListaPorFechasRecientes(ultimosPosts);
		return(ultimosPosts = this.truncarLista(ultimosPosts, cant));
	}
}
