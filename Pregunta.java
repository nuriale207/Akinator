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
		String respuestaString = reader.nextLine().toLowerCase();
		
		if (respuestaString=="si"||respuestaString=="sí")
		{
			respuestaBool=true;
		}
		reader.close();
		return respuestaBool;
		
	}
	
	public boolean realizarPregunta() {
		System.out.println(this.pregunta);
		boolean respuestaBool= false;
		Scanner reader = new Scanner(System.in);
		String respuestaString = reader.nextLine();
		
		//System.out.println(respuestaString);
		if (respuestaString.contentEquals("si"))
		{
			
			respuestaBool=true;
		}
		
		return respuestaBool;
		
//		this.printPregunta();
//		return this.cogerRespuesta();
	}
	
	public Atributo getAtributo() {
		return this.atributoRelacion;
	}
}
