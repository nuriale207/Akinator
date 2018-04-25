import java.util.ArrayList;
import java.util.Iterator;

public class ListaPreguntas{
	
	//atributos
	private ArrayList<Pregunta> lista;
	private static ListaPreguntas miListaPreguntas= new ListaPreguntas();
  
	//construtora
	private ListaPreguntas(){
		
		this.lista =new ArrayList<Pregunta>();
		
		Atributo a1,a2,a3,a4,a5,a6;
		Pregunta p1,p2,p3,p4,p5;
		
		a1 = new Atributo("sexoFemenino");
		a2 = new Atributo("marvel");
		a3 = new Atributo("DC");
		a4 = new Atributo("vengadores");
		a5 = new Atributo("ligaJusticia");
		
		p1=new Pregunta(a1,"¿Es mujer / sexo femenino?");
		p2=new Pregunta(a2,"¿Es del universo de Marvel?");
		p3=new Pregunta(a3,"¿Es del universo de DC?");
		p4=new Pregunta(a4,"¿Pertenece al grupo llamado los Vengadores?");
		p5=new Pregunta(a5,"¿Pertenece a la liga de la justicia?");
		
	}
	
	//getters
	private Iterator<Pregunta> getIterador()
	{
		return this.lista.iterator();
	}
	
	//otros metodos
	
	public ListaPreguntas getListaPreguntas()
	{
		return miListaPreguntas;
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
		Iterator<Pregunta>itr=getIterador();
		Pregunta unaPregunta=null;
		
		while (ListaPersonajes.getListaPersonajes().getSize()>1)
		{
			Atributo atributoAct=ListaPersonajes.getListaPersonajes().buscarAtributoMasFrecuente();
			Pregunta preguntaAct = this.buscarPreguntaPorAtributo(atributoAct);
			
			boolean respuesta=preguntaAct.realizarPregunta();
			ListaPersonajes.eliminarPersonajePorAtributo(atributoAct,respuesta);
			
		}
		
		if (ListaPersonajes.getListaPersonajes().getSize()==0)
		{
			System.out.println("No se cual es tu personaje. Me has ganado");
		}
		else
		{
			//preguntar por el personaje y si lo es imprimir por pantalla --> He acertado
		}
			
	}
	
	
}
