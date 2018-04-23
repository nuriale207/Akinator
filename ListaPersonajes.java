import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonajes {

	//atributos
	private static ListaPersonajes miListaPersonajes=new ListaPersonajes();
	private ArrayList<Personaje> lista;
	private ListaAtributos listaTodosLosAtributos;
	  
	//constructora
	private ListaPersonajes ()
	{
		  this.lista=new ArrayList<Personaje>();
		  this.listaTodosLosAtributos=new ListaAtributos();
	}
	
	//getters
	public ListaPersonajes getListaPersonajes()
	{
		return miListaPersonajes;
	}
	
	private Iterator<Personaje> getIterador()
	{
		return this.lista.iterator();
	}
	
	//otros metodos
	public void eliminarPersonajePorAtributo(String pAtributoRelacion, boolean pRespuesta)
	{
		Iterator<Personaje>itr=getIterador();
		Personaje unPersonaje=null;
		boolean esta=false;
		
		while(itr.hasNext())
		{
			unPersonaje=itr.next();
			if ((unPersonaje.comprobarAtributo(pAtributoRelacion) && !pRespuesta) || (!unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta))
			{
				this.lista.remove(unPersonaje);
			}
		}
		
	}
}
