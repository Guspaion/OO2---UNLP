package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.*;

public class JSONExporter {
	public JSONExporter() {
		
	}
	
	private JSONObject generarJSONObject(Socio socio) {
		JSONObject socioJSON = new JSONObject();
		socioJSON.put("nombre", socio.getNombre());
		socioJSON.put("email", socio.getEmail());
		socioJSON.put("legajo", socio.getLegajo());
		return socioJSON;
	}
	
	public String exportarStringJSON(List<Socio> socios) {
		List<JSONObject> listaObjetos = socios.stream()
			    .map(this::generarJSONObject)
			    .collect(Collectors.toList());

		JSONArray listaJSON = new JSONArray();
		if(listaObjetos.isEmpty()) {
			return "[]";
		}
		listaObjetos.forEach(listaJSON::add);
		return listaJSON.toJSONString();	
	}
}
