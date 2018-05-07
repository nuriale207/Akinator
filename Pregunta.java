import java.util.Scanner;

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
		boolean respuestaBool= false;
		Scanner reader = new Scanner(System.in);
		String respuestaString = reader.nextLine();
		respuestaString.toLowerCase();
		
		if (respuestaString.contentEquals("si") || respuestaString.contentEquals("sí") || respuestaString.contentEquals("s"))
		{
			respuestaBool=true;
		}
		return respuestaBool;
		
	}
	
	public boolean realizarPregunta() {
		this.printPregunta();
		return this.cogerRespuesta();	
	}
	
	public Atributo getAtributo() {
		return this.atributoRelacion;
	}
}
