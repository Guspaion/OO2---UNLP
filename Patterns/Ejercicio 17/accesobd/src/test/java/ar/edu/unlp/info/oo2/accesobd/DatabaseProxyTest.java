package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	private DataBaseProxy dbProxy;
	private DatabaseRealAccess dbRealAccess;
	
	@BeforeEach
	void setUp() {
		this.dbRealAccess = new DatabaseRealAccess();
		this.dbProxy = new DataBaseProxy(this.dbRealAccess);
	}
	
	@Test
	void testGetSearchResultsLogged() {
		this.dbProxy.logOn();
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbProxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.dbProxy.getSearchResults("select * from comics where id=10"));
	}
	
	@Test
	void testGetSearchResultsNotLogged() {
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
			dbProxy.getSearchResults("select * from comics where id=1");
		});
		assertEquals("acceso denegado", thrown.getMessage());
	}
	
	@Test
	void testInsertNewRowLogged() {
		this.dbProxy.logOn();
        assertEquals(3, this.dbProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dbProxy.getSearchResults("select * from comics where id=3"));
	}
	
	@Test
	void testInsertNewRowNotLogged() {
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
			this.dbProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
		});
		assertEquals("acceso denegado", thrown.getMessage());
	}
}
