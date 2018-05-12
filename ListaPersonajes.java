package packAkinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
		int i=0;
		while(i<this.lista.size()) {
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
			i++;
		}
		
//		for (int i = 0; i < this.lista.size(); i++) 
//		{
//			Personaje unPersonaje= this.lista.get(i);
//			if ((unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("no")) || (!unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("si")))
//			{	
//				this.lista.remove(unPersonaje);
//				//System.out.println("He borrado: " + unPersonaje.getNombre());
//				i--;
//			}
//			else if((unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("si"))|| (unPersonaje.comprobarAtributo(pAtributoRelacion) && pRespuesta.contentEquals("no se"))) {
//				unPersonaje.getListaAtributos().eliminarAtributo(pAtributoRelacion);			
//			}
//			
//		}
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
		if(unaListaT.getSize()==0) {
			Iterator<Personaje>itr2=getIterador();
			while (itr2.hasNext()) {
			System.out.print("¿Estabas pensando en ");
			itr2.next().imprimir();
			System.out.print("?");
			
			Scanner reader = new Scanner(System.in);
			String respuestaString = reader.nextLine().toLowerCase();
			
			if (respuestaString.contentEquals("si")||respuestaString.contentEquals("sí"))
			{
				System.out.println("jejeje soy un genio. ¡Te he ganado!");
				System.exit(0);
			}
				 
		}
			System.out.println("No te vayas a confiar,pero por una vez me has ganado");
			System.exit(0);}
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
				unPersonaje.imprimir();
			}
			
		}
	}
}
