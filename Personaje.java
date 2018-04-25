//package org.pmoo.Akinator;

public class Personaje {
	
	//atributos
	private String nombre;
	private ListaAtributos lista;
	
	//constructora
	public Personaje (String pNombre, ListaAtributos pLista)
	{
		this.nombre=pNombre;
		this.lista=pLista;
	}
	
	//getters 
	public String getNombre()
	{
		return this.nombre;
	}
	
	public ListaAtributos getListaAtributos()
	{
		return this.lista;
	}
	
	//otros metodos
	public boolean comprobarAtributo(String pAtributoRelacion)
	{
		return this.lista.comprobarAtributo(pAtributoRelacion);
	}
}
