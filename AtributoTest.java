//package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AtributoTest {

	Atributo a1,a2,a3;
	@Before
	public void setUp() throws Exception {
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
	}

	@After
	public void tearDown() throws Exception {
		a1=null;
		a2=null;
	}

	@Test
	public void testAtributo() {
		a3=new Atributo("alto");
		assertNotNull(a3);
	}

	@Test
	public void testGetValor() {
		assertEquals(a1.getValor(),"moreno");
		assertNotEquals(a1.getValor(),"rubio");
		
		assertEquals(a2.getValor(),"animal");
		assertNotEquals(a2.getValor(),"mono");

	}

}
