
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaPreguntas{
	
	//atributos
	private ArrayList<Pregunta> lista;
	private static ListaPreguntas miListaPreguntas= new ListaPreguntas();
  
	//construtora
	private ListaPreguntas(){
		
		this.lista =new ArrayList<Pregunta>();
		
		Atributo a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
		Pregunta p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
		
		a1 = new Atributo("sexoFemenino");
		a2 = new Atributo("marvel");
		a3 = new Atributo("DC");
		a4 = new Atributo("vengadores");
		a5 = new Atributo("ligaJusticia");
		a6 = new Atributo("peloCastano");
		a7 = new Atributo("peloNegro");
		a8 = new Atributo("peloRubio");
		a9 = new Atributo("peloRojo");
		a10= new Atributo("peloBlanco");
		a11= new Atributo("sinPelo");
		
		p1=new Pregunta(a1,"¿Es mujer / sexo femenino?");
		p2=new Pregunta(a2,"¿Es del universo de Marvel?");
		p3=new Pregunta(a3,"¿Es del universo de DC?");
		p4=new Pregunta(a4,"¿Pertenece al grupo llamado los Vengadores?");
		p5=new Pregunta(a5,"¿Pertenece a la liga de la justicia?");
		p6=new Pregunta(a6,"¿Tiene pelo castano?");
		p7=new Pregunta(a7,"¿Tiene pelo negro?");
		p8=new Pregunta(a8,"¿Tiene pelo rubio?");
		p9=new Pregunta(a9,"¿Es pelirrojo?");
		p10=new Pregunta(a10,"¿Tiene pelo blanco?");
		p11=new Pregunta(a11,"¿Es calvo?");
		
	}
	
	//getters
	private Iterator<Pregunta> getIterador()
	{
		return this.lista.iterator();
	}
	
	//otros metodos
	
	public static ListaPreguntas getListaPreguntas()
	{
		return miListaPreguntas;
	}
	public void anadirPregunta(Pregunta pPregunta) {
		this.lista.add(pPregunta);
	}
	
	private Pregunta buscarPreguntaPorAtributo(Atributo pAtributo)
	{
		Iterator<Pregunta>itr=getIterador();
		Pregunta unaPregunta=null;
		boolean encontrado=false;
		
		while (!encontrado)
		{
			unaPregunta=itr.next();
			if (unaPregunta.getAtributo()==pAtributo)
			{
				encontrado=true;
			}
		}
		
		return unaPregunta;
	}
	
	public void realizarPreguntas()
	{	
		while (ListaPersonajes.getListaPersonajes().getSize()>1)
		{
			Atributo atributoAct=ListaPersonajes.getListaPersonajes().buscarAtributoMasFrecuente();
			Pregunta preguntaAct = this.buscarPreguntaPorAtributo(atributoAct);
			
			boolean respuesta=preguntaAct.realizarPregunta();
			
			ListaPersonajes.getListaPersonajes().eliminarPersonajePorAtributo(atributoAct,respuesta);
			
		}
		
		if (ListaPersonajes.getListaPersonajes().getSize()==0)
		{
			System.out.println("No se cual es tu personaje. Me has ganado");
		}
		else
		{
			System.out.print("¿Estabas pensando en ");
			ListaPersonajes.getListaPersonajes().imprimir();
			System.out.print("?");
			
			Scanner reader = new Scanner(System.in);
			String respuestaString = reader.nextLine().toLowerCase();
			
			if (respuestaString.contentEquals("si")||respuestaString.contentEquals("sí"))
			{
				System.out.println("jejeje soy un genio. ¡Te he ganado!");
			}
			else {System.out.println("No te vayas a confiar,pero por una vez me has ganado");}
		}
			
	}
	
	public void resetear() {
		this.lista=new ArrayList<Pregunta>();
	}
	
}

