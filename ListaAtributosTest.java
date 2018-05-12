//package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaAtributosTest {
	Atributo a1,a2,a3;
	ListaAtributos l1,l2,l3;
	@Before
	public void setUp() throws Exception {
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		l1=new ListaAtributos();
		l1.anadirAtributo(a1);
	}

	@After
	public void tearDown() throws Exception {
		a1=null;
		a2=null;
		a3=null;
	}

	@Test
	public void testListaAtributos() {
		l2=new ListaAtributos();
		l2.anadirAtributo(a1);
		assertNotNull(l2);
		
	}

	@Test
	public void testAnadirAtributo() {
		l1.anadirAtributo(a2);
		assertTrue(l1.comprobarAtributo(a2));
	}

	@Test
	public void testComprobarAtributo() {
		l2=new ListaAtributos();
		l2.anadirAtributo(a1);
		assertTrue(l2.comprobarAtributo(a1));
		assertFalse(l2.comprobarAtributo(a2));
	}

	@Test
	public void testBuscarAtributoMasFrecuente() {
		l2=new ListaAtributos();
		l2.anadirAtributo(a1);
		l2.anadirAtributo(a2);
		l2.anadirAtributo(a1);
		l2.buscarAtributoMasFrecuente();
		//assertEquals(l2.buscarAtributoMasFrecuente(),a1);
	}
	

	@Test
	public void testConcatenarListas() {
		l3=new ListaAtributos();
		l3.anadirAtributo(a1);
		l3.anadirAtributo(a2);
		l3.anadirAtributo(a3);
		
		l2=new ListaAtributos();
		l2.anadirAtributo(a2);
		l2.anadirAtributo(a3);
		l2.concatenarListas(l1);
		assertTrue(l2.comprobarAtributo(a1));
	}
	
	@Test
	public void testEliminarAtributo() {
		l1.eliminarAtributo(a1);
		assertFalse(l1.comprobarAtributo(a1));
		
		l1.eliminarAtributo(a1);
	}

}
