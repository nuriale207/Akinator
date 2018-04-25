//package org.pmoo.Akinator;

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
	public boolean comprobarAtributo(String pAtributoRelacion)
	{
		boolean esta=false;
		Iterator<Atributo>itr=getIterador();
		Atributo unAtributo=null;
		
		while(itr.hasNext() && !esta)
		{
			unAtributo=itr.next();
			if (unAtributo.getValor()==pAtributoRelacion)
			{
				esta=true;
			}
		}
		
		return esta;
		
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
		
		return atributoFrecuente;
		
	}
}
