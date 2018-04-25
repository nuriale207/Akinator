//package Akinator;

public class Pregunta {
	
	//atributos
	private Atributo atributoRelacion;
	private String pregunta;
	
	//constructora
	public Pregunta(Atributo pAtributoRelacion, String pPregunta) {
		this.atributoRelacion=pAtributoRelacion;
		this.pregunta= pPregunta;
	}
	
	private void printPregunta() {
		System.out.println(this.pregunta);
	}

	private boolean cogerRespuesta() {
		boolean respuesta= false;
		
		return respuesta;
		
	}
	
	public boolean realizarPregunta() {
		this.printPregunta();
		return this.cogerRespuesta();
	}
	
	public Atributo getAtributo() {
		return this.atributoRelacion;
	}
}
