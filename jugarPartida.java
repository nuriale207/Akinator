//package Akinator;


public class jugarPartida {
	public static void main (String [ ] args) {

        System.out.println ("Empezamos la ejecución del programa");
        Atributo mago=new Atributo("mago");
        Pregunta pMago=new Pregunta(mago,"¿Es mago/a?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pMago);
        
        Atributo gryffindor=new Atributo("gryffindor");
        Pregunta pGryffindor=new Pregunta(gryffindor,"¿Pertenece o pertenecio a Gryffindor?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pGryffindor);
        
        Atributo hogwarts=new Atributo("hogwarts");
        Pregunta pHogwarts=new Pregunta(hogwarts,"¿Estudia,vive o trabaja en hogwarts?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pHogwarts);
        
        Atributo cicatriz=new Atributo("cicatriz");
        Pregunta pCicatriz=new Pregunta(cicatriz,"¿Tiene una cicatriz?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pCicatriz);
       
        Atributo gafas=new Atributo("gafas");
        Pregunta pGafas=new Pregunta(gafas,"¿Lleva gafas?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pGafas);
         
        Atributo moreno=new Atributo("moreno");
        Pregunta pMoreno=new Pregunta(moreno,"¿¿Es moreno/a??");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pMoreno);
        
        Atributo inteligencia=new Atributo("inteligencia");
        Pregunta pInteligencia=new Pregunta(inteligencia,"¿Destaca por su inteligencia?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pInteligencia);
        
        Atributo castaño=new Atributo("castaño");
        Pregunta pcastaño=new Pregunta(castaño,"¿Es castaña/o" );
        ListaPreguntas.getListaPreguntas().anadirPregunta(pcastaño);
        
        Atributo pelirrojo=new Atributo("pelirrojo");
        Pregunta ppelirrojo=new Pregunta(pelirrojo,"¿Es pelirroja/o" );
        ListaPreguntas.getListaPreguntas().anadirPregunta(ppelirrojo);
        
        
        Atributo miedoArañas=new Atributo("miedo a las arañas");
        Pregunta pmiedoArañas=new Pregunta(miedoArañas,"¿Tiene fobia a las arañas?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pmiedoArañas);
        
        Personaje HarryPotter=new Personaje("Harry Potter");
        HarryPotter.anadirAtributo(moreno);
        HarryPotter.anadirAtributo(gafas);
        HarryPotter.anadirAtributo(hogwarts);
        HarryPotter.anadirAtributo(gryffindor);
        HarryPotter.anadirAtributo(cicatriz);
        HarryPotter.anadirAtributo(mago);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(HarryPotter);
        
        Personaje HermioneGranger=new Personaje("Hermione Granger");
        HermioneGranger.anadirAtributo(mago);
        HermioneGranger.anadirAtributo(gryffindor);
        HermioneGranger.anadirAtributo(hogwarts);
        HermioneGranger.anadirAtributo(castaño);
        HermioneGranger.anadirAtributo(inteligencia);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(HermioneGranger);
        
        Personaje RonWeasley=new Personaje("Ron Weasley");
        RonWeasley.anadirAtributo(mago);
        RonWeasley.anadirAtributo(gryffindor);
        RonWeasley.anadirAtributo(hogwarts);
        RonWeasley.anadirAtributo(pelirrojo);
        RonWeasley.anadirAtributo(miedoArañas);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(RonWeasley);
        
        ListaPreguntas.getListaPreguntas().realizarPreguntas();

    }

}
