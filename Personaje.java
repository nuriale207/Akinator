//package org.pmoo.Akinator;

public class Personaje {
	
	//atributos
	private String nombre;
	private ListaAtributos lista;
	
	//constructora
	public Personaje (String pNombre)
	{
		this.nombre=pNombre;
		this.lista=new ListaAtributos();
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
	
	public void añadirAtributo(Atributo pAtributo) {
		this.lista.anadirAtributo(pAtributo);
	}
	
	//otros metodos
	public boolean comprobarAtributo(Atributo pAtributoRelacion)
	{
		return this.lista.comprobarAtributo(pAtributoRelacion);
	}
}

