package Akinator;

public class Pregunta {
	private String atributoRelacion;
	private String pregunta;
	
	public Pregunta(String pAtributoRelacion, String pPregunta) {
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
	
	public void realizarPregunta() {
		this.printPregunta();		
	}
	
	public String getAtributo() {
		return this.atributoRelacion;
	}
}
