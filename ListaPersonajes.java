
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersonajes {

	//atributos
	private static ListaPersonajes miListaPersonajes=new ListaPersonajes();
	private ArrayList<Personaje> lista;
	
	  
	//constructora
	private ListaPersonajes()
	{
		  this.lista=new ArrayList<Personaje>();
	}
	
	//getters
	public static ListaPersonajes getListaPersonajes()
	{
		return miListaPersonajes;
	}
	
	public int getSize()
	{
		return this.lista.size();
	}
	
	
	private Iterator<Personaje> getIterador()
	{
		return this.lista.iterator();
	}
	
	//otros metodos.
	public void anadirPersonaje(Personaje pPersonaje)
	{
		this.lista.add(pPersonaje);
	}

//	Hemos recorrido la lista de personajes con un indice porque si lo recorriamos con un iterador, al eliminar un personaje, en la siguiente vuelta se saltaba un personaje
	public void eliminarPersonajePorAtributo(Atributo pAtributoRelacion, String pRespuesta)
	{
		
		for (int i = 0; i < this.lista.size(); i++) 
		{
			Personaje unPersonaje= this.lista.get(i);
			if ((unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("no")) || (!unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("si")))
			{	
				this.lista.remove(unPersonaje);
				//System.out.println("He borrado: " + unPersonaje.getNombre());
				i--;
			}
			else if((unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("si"))|| (unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("no se"))) {
				unPersonaje.getListaAtributos().eliminarAtributo(pAtributoRelacion);			
			}
			
		}
	}
	public Atributo buscarAtributoMasFrecuente()
	{
		Iterator<Personaje>itr=getIterador();
		Personaje unPersonaje=null;
		ListaAtributos unaLista=null;
		ListaAtributos unaListaT=new ListaAtributos();
		while(itr.hasNext()) {
			unPersonaje=itr.next();
			unaLista=unPersonaje.getListaAtributos();
			unaListaT.concatenarListas(unaLista);
	
		}
		return unaListaT.buscarAtributoMasFrecuente();
	}
	
	public void vaciarLista() {
		this.lista=new ArrayList<Personaje>();
	}
	
	public void imprimir() {
		Personaje unPersonaje=null;
		Iterator<Personaje>itr=getIterador();
		while(itr.hasNext()) {
			unPersonaje=itr.next();
			if(unPersonaje!=null) {
				System.out.print(unPersonaje.getNombre());
			}
			
		}
	}
}
