package packAkinator;

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
	public void imprimir() {
		System.out.println(this.nombre+" ");
	}
	
	public ListaAtributos getListaAtributos()
	{
		return this.lista;
	}
	
	public void anadirAtributo(Atributo pAtributo) {
		this.lista.anadirAtributo(pAtributo);
	}
	
	//otros metodos
	public boolean comprobarAtributo(Atributo pAtributoRelacion)
	{
		return this.lista.comprobarAtributo(pAtributoRelacion);
	}
}

