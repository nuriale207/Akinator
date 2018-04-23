import java.util.ArrayList;

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
	
	//otros metodos
	
}
