package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DataBaseProxy implements DatabaseAccess {
	private DatabaseRealAccess realDB;
	private boolean isLogged;
	
	public DataBaseProxy(DatabaseRealAccess unaDB) {
		this.realDB = unaDB;
		this.isLogged = false;
	}
	
	public void logOn() {
		this.isLogged = true;
	}
	
	public void logOff() {
		this.isLogged = false;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.isLogged) { return this.realDB.getSearchResults(queryString); }		
		throw new RuntimeException("acceso denegado");
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.isLogged) { return this.realDB.insertNewRow(rowData); }
		throw new RuntimeException("acceso denegado");
	}
}
