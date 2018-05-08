//package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPersonajesTest {
	Atributo a1,a2,a3,i1,i2,i3,i4,s1,s2,s3,a4;
	ListaPersonajes l1;
	Personaje p1,p2,p3,p4,p5;
	@Before
	public void setUp() throws Exception {
		
		p1=new Personaje("minion");
		p2=new Personaje("bambi");
		p3=new Personaje("Iron Man");
		p4=new Personaje("spiderman");
		p5=new Personaje("flash");
		
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		i1=new Atributo("marvel");
		i2=new Atributo("hombre");
		i3=new Atributo("rico");
		s3=new Atributo("humanoMutado");	
		a4=new Atributo("dc");	
		
		p1.anadirAtributo(a1);
		p2.anadirAtributo(a2);
		
		p3.anadirAtributo(i1);
		p3.anadirAtributo(i2);
		p3.anadirAtributo(i3);
		
		p4.anadirAtributo(i1);
		p4.anadirAtributo(i2);
		p4.anadirAtributo(s3);
		
		p5.anadirAtributo(i2);
		p5.anadirAtributo(a4);
		
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p1);
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
		assertEquals(ListaPersonajes.getListaPersonajes().getSize(),1);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p2);
		assertEquals(ListaPersonajes.getListaPersonajes().getSize(),2);
	}

	@Test
	public void testAnadirPersonaje() {
		ListaPersonajes.getListaPersonajes().vaciarLista();
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p1);
		assertNotNull(ListaPersonajes.getListaPersonajes());
		assertEquals(ListaPersonajes.getListaPersonajes().getSize(),1);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p2);
		assertEquals(ListaPersonajes.getListaPersonajes().getSize(),2);
	}
	
	@Test
	public void testEliminarPersonajePorAtributo() {
		//si se vacia la lista entera da error
		
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p3);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p2);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p4);
		
		ListaPersonajes.getListaPersonajes().eliminarPersonajePorAtributo(i1, false);
		assertEquals(ListaPersonajes.getListaPersonajes().getSize(),2);
	}

	@Test
	public void testBuscarAtributoMasFrecuente() {
		
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p3);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p2);
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p4);
		
		assertEquals(ListaPersonajes.getListaPersonajes().buscarAtributoMasFrecuente(),i1);
		
		ListaPersonajes.getListaPersonajes().anadirPersonaje(p5);
		
		assertEquals(ListaPersonajes.getListaPersonajes().buscarAtributoMasFrecuente(),i2);
		
	}

}

