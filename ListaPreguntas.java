
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
			
			String respuesta=preguntaAct.realizarPregunta();
			
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
