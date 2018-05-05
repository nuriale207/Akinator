//package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreguntaTest {
	Pregunta pr1,pr2,pr3;
	Atributo a1,a2,a3;
	@Before
	public void setUp() throws Exception {
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		pr1=new Pregunta(a1 ,"�Es moreno?");
		pr2=new Pregunta(a2,"�Es un animal?");
	}

	@After
	public void tearDown() throws Exception {
		a1=null;
		a2=null;
		a3=null;
		pr1=null;
		pr2=null;
	}

	@Test
	public void testPregunta() {
		assertNotNull(pr1);
		assertNull(pr3);
	}

	@Test
	public void testRealizarPregunta() {
		pr1.realizarPregunta();
	}

	@Test
	public void testGetAtributo() {
		assertEquals(pr1.getAtributo(),a1);
		assertNotEquals(pr2.getAtributo(),a1);
	}

}
