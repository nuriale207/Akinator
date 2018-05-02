package packAkinator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPreguntasTest {
	Pregunta pr1,pr2,pr3;
	Atributo a1,a2,a3;
	ListaPreguntas l1;
	ListaPersonajes lp1;
	Personaje p1,p2,p3;
	
	@Before
	public void setUp() throws Exception {
		p1=new Personaje("gigante");
		p2= new Personaje("bambi");
		p1.añadirAtributo(a1);
		p1.añadirAtributo(a3);
		p2.añadirAtributo(a2);
		p2.añadirAtributo(a1);
		lp1=ListaPersonajes.getListaPersonajes();
		lp1.anadirPersonaje(p1);
		lp1.anadirPersonaje(p2);
		a1=new Atributo("moreno");
		a2=new Atributo("animal");
		a3=new Atributo("alto");
		pr1=new Pregunta(a1 ,"¿Es moreno?");
		pr2=new Pregunta(a2,"¿Es un animal?");
		pr3=new Pregunta(a3,"¿Es alto?");
		l1=ListaPreguntas.getListaPreguntas();
		l1.anadirPregunta(pr1);
	
		
	}

	@After
	public void tearDown() throws Exception {
		l1.resetear();
	}

	@Test
	public void testGetListaPreguntas() {
		assertNotNull(l1);
	}
	
	@Test
	public void testAnadirPregunta() {
		l1.resetear();
		l1.anadirPregunta(pr2);
		assertNotNull(l1);
		
	}

	@Test
	public void testRealizarPreguntas() {
		l1.anadirPregunta(pr2);
		l1.anadirPregunta(pr3);
		l1.realizarPreguntas();
	}

}
