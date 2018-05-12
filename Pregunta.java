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

	private String cogerRespuesta() {

		Scanner reader = new Scanner(System.in);
		String respuestaString = reader.nextLine();
		respuestaString.toLowerCase();
		
		if (respuestaString.contentEquals("si") || respuestaString.contentEquals("sí") || respuestaString.contentEquals("s"))
		{
			respuestaString="si";
		}
		else if (respuestaString.contentEquals("no") || respuestaString.contentEquals("n"))
			
		{
			respuestaString="no";
		}
		return respuestaString;
		
	}
	
	public String realizarPregunta() {
		this.printPregunta();
		return this.cogerRespuesta();	
	}
	
	public Atributo getAtributo() {
		return this.atributoRelacion;
	}
}
