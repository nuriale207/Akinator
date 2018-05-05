//package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonajeTest {
	Atributo a1,a2,a3;

	Personaje p1,p2,p3;
	@Before
	public void setUp() throws Exception {
		p1=new Personaje("minion");
		p2= new Personaje("bambi");
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		
	}

	@After
	public void tearDown() throws Exception {
		p1=null;
		p2=null;
		p3=null;
	}

	@Test
	public void testPersonaje() {
		p3=new Personaje("superman");
		assertNotNull(p3);
	}

	@Test
	public void testGetNombre() {
		assertEquals(p1.getNombre(),"minion");
		assertNotEquals(p1.getNombre(),"bambi");
		}

	@Test
	public void testGetListaAtributos() {
		p1.anadirAtributo(a1);
		p1.anadirAtributo(a2);
		assertNotNull(p1.getListaAtributos());
		assertFalse(p2.getListaAtributos().comprobarAtributo(a1));
	}

	@Test
	public void testComprobarAtributo() {
		p1.anadirAtributo(a1);
		p1.anadirAtributo(a2);
		assertTrue(p1.comprobarAtributo(a1));
		assertFalse(p1.comprobarAtributo(a3));
		}

}
