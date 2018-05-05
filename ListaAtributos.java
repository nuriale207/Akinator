//package packAkinator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaAtributos {
	
	//atributos
	private ArrayList<Atributo>lista;
	
	//constructora
	public ListaAtributos()
	{
		this.lista=new ArrayList<Atributo>();
	}
	
	//getters
	private Iterator<Atributo> getIterador()
	{
		return this.lista.iterator();
	}
	
	//otros metodos
	public void anadirAtributo(Atributo pAtributo)
	{
		this.lista.add(pAtributo);
	}
	
	public boolean comprobarAtributo(Atributo pAtributoRelacion)
	{
		boolean esta=false;
		Iterator<Atributo>itr=getIterador();
		Atributo unAtributo=null;
		
		while(itr.hasNext() && !esta)
		{
			unAtributo=itr.next();
			if (unAtributo==pAtributoRelacion)
			{
				esta=true;
			}
		}
		
		return esta;
		
	}
	
	private void quitarAtributosIgualesQue(Atributo pAtributo)
	{
		Iterator<Atributo>itr=getIterador();
		Atributo unAtributo = null;
		
		while (itr.hasNext())
		{
			unAtributo=itr.next();
			if (unAtributo==pAtributo)
			{
				this.lista.remove(pAtributo);
			}
		}
	}
	
	public Atributo buscarAtributoMasFrecuente()
	{
		Iterator<Atributo>itr=getIterador();
		Atributo unAtributo = null;
		int veces=0;
		int mayorVeces=0;
		Atributo atributoFrecuente=null;
		
		while(itr.hasNext())
		{
			unAtributo=itr.next();
			veces=Collections.frequency(this.lista, unAtributo);
			if (veces>mayorVeces)
			{
				mayorVeces=veces;
				atributoFrecuente=unAtributo;
			}
		}
		
		//this.quitarAtributosIgualesQue(atributoFrecuente);
		
		return atributoFrecuente;
		
	}
	private ArrayList<Atributo> getLista(){
		return this.lista;
	}
	public ArrayList<Atributo> concatenarListas(ListaAtributos pListaAtributos) {
		ListaAtributos lista;
		this.lista.addAll(pListaAtributos.getLista());
		 return this.lista;
}
	public void eliminarAtributo(String pValor) {
		for(Atributo unAtributo: this.lista) {
			if(pValor==unAtributo.getValor()) {
				this.lista.remove(unAtributo);
			}
		}
		
		
	}
}
