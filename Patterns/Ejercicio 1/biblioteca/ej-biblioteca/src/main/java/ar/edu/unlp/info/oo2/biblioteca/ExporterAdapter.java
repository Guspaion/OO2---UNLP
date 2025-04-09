package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class ExporterAdapter extends VoorheesExporter {
	private JSONExporter exporterAdaptee;
	
	public ExporterAdapter() {
		this.exporterAdaptee = new JSONExporter();
	}
	
	public String exportar(List<Socio> socios) {
		return(this.exporterAdaptee.exportarStringJSON(socios));
	}
}
