package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPersonajesTest {
	Atributo a1,a2,a3;
	ListaPersonajes l1;
	Personaje p1,p2,p3;
	@Before
	public void setUp() throws Exception {
		p1=new Personaje("minion");
		p2= new Personaje("bambi");
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		p1.añadirAtributo(a1);
		l1=ListaPersonajes.getListaPersonajes();
		l1.anadirPersonaje(p1);
	}

	@After
	public void tearDown() throws Exception {
		ListaPersonajes.getListaPersonajes().vaciarLista();
	}

	@Test
	public void testGetListaPersonajes() {
	assertNotNull(ListaPersonajes.getListaPersonajes());
	
	}

	@Test
	public void testGetSize() {
		l1=ListaPersonajes.getListaPersonajes();
		assertEquals(l1.getSize(),1);
		l1.anadirPersonaje(p2);
		assertEquals(l1.getSize(),2);
	}

	@Test
	public void testAnadirPersonaje() {
		l1.vaciarLista();
		l1.anadirPersonaje(p1);
		assertNotNull(l1);
		assertEquals(l1.getSize(),1);
	}
	
	@Test
	public void testEliminarPersonajePorAtributo() {
		//si se vacía la lista entera da error
		l1.anadirPersonaje(p2);
		l1.eliminarPersonajePorAtributo(a1, false);
		assertEquals(l1.getSize(),1);
	}

	@Test
	public void testBuscarAtributoMasFrecuente() {

		}

}
