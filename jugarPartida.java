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
        
        Atributo sexoFemenino=new Atributo("sexoFemenino");
        Pregunta pSexoFemenino=new Pregunta(sexoFemenino,"¿Es mujer/sexo femenino?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pSexoFemenino);
        
        Atributo marvel=new Atributo("marvel");
        Pregunta pMarvel=new Pregunta(marvel,"¿Pertenece al universo de Marvel?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pMarvel);
        
        Atributo dc=new Atributo("dc");
        Pregunta pDc=new Pregunta(dc,"¿Pertenece al universo de DC?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pDc);
        
        Atributo xmen=new Atributo("xmen");
        Pregunta pXmen=new Pregunta(xmen,"¿Pertenece a X-men?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pXmen);
        
        Atributo ligaJusticia=new Atributo("ligaJusticia");
        Pregunta pLigaJusticia=new Pregunta(ligaJusticia,"¿Pertenece a la liga de la justicia?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pLigaJusticia);
        
        Atributo vengadores=new Atributo("vengadores");
        Pregunta pVengadores=new Pregunta(vengadores,"¿Pertenece al grupo llamado Los Vengadores?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pVengadores);
        
        
        Atributo rapidezCurativa=new Atributo("rapidezCurativa");
        Pregunta pRapidezCurativa=new Pregunta(rapidezCurativa,"¿Tiene la habilidad de curarse rápidamente?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pRapidezCurativa);
        
        Atributo fuerzaSobrehumana=new Atributo("fuerzaSobrehumana");
        Pregunta pFuerzaSobrehumana=new Pregunta(fuerzaSobrehumana,"¿Tiene fuerza sobrehumana?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pFuerzaSobrehumana);
        
        Atributo humanoMutado=new Atributo("humanoMutado");
        Pregunta pHumanoMutado=new Pregunta(humanoMutado, "¿Es un humano mutado?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pHumanoMutado);
        
        Atributo rico=new Atributo("rico");
        Pregunta pRico=new Pregunta(rico,"¿Es rico?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pRico);
        
        Atributo sarcastico=new Atributo("sarcastico");
        Pregunta pSarcastico=new Pregunta(sarcastico,"¿Es habitual en el/ella ser sarcastico?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pSarcastico);
        
        Atributo cientifico=new Atributo("cientifico");
        Pregunta pCientifico=new Pregunta(cientifico,"¿Es cientifico/a?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pCientifico);
        
        Atributo tecnologiaAvanzada=new Atributo("tecnologiaAvanzada");
        Pregunta pTecnologiaAvanzada=new Pregunta(tecnologiaAvanzada,"¿Trabaja con tecnologia avanzada?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pTecnologiaAvanzada);
        
        Atributo volar=new Atributo("volar");
        Pregunta pVolar=new Pregunta(volar,"¿Puede volar?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pVolar);
        
        Atributo velocidadSobrehumana=new Atributo("velocidadSobrehumana");
        Pregunta pVelocidadSobrehumana=new Pregunta(velocidadSobrehumana,"¿Tiene velocidad sobrehumana?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pVelocidadSobrehumana);
        
        Atributo gigante=new Atributo("gigante");
        Pregunta pGigante=new Pregunta(gigante, "¿Es el personaje un gigante o muy grande?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pGigante);
        
        Atributo relacionadoAnimal=new Atributo("relacionadoAnimal");
        Pregunta pRelacionadoAnimal=new Pregunta(relacionadoAnimal,"¿Su nombre esta relacionado con algun animal?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pRelacionadoAnimal);
        
        Atributo envejecimientoRetardado=new Atributo("envejecimientoRetardado");
        Pregunta pEnvejecimientoRetardado=new Pregunta(envejecimientoRetardado,"¿Envejece mas lento que la media?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pEnvejecimientoRetardado);
        
        Atributo artesMarciales=new Atributo("artesMarciales");
        Pregunta pArtesMarciales=new Pregunta(artesMarciales,"¿Sabe Artes Marciales?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pArtesMarciales);
        
        Atributo guardianesGalaxia=new Atributo("guardianesGalaxia");
        Pregunta pGuardianesGalaxia=new Pregunta(guardianesGalaxia,"¿Pertenece al grupo llamado Guardianes de la Galaxia?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pGuardianesGalaxia);
        
        Atributo artesMisticas=new Atributo("artesMisticas");
        Pregunta pArtesMisticas=new Pregunta(artesMisticas,"¿Destaca en las Artes Místicas?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pArtesMisticas);
        
        Atributo levitar=new Atributo("levitar");
        Pregunta pLevitar=new Pregunta(levitar,"¿Puede levitar?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pLevitar);
        
        Atributo teletransportacion=new Atributo("teletransportacion");
        Pregunta pTeletransportacion=new Pregunta(teletransportacion,"¿Puede teletransportarse?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pTeletransportacion);
        
        Atributo manipulacionTiempo=new Atributo("manipulacionTiempo");
        Pregunta pManipulacionTiempo=new Pregunta(manipulacionTiempo,"¿Puede manipular el tiempo mediante algun objeto?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pManipulacionTiempo);
    
        Atributo visionLaser=new Atributo("visionLaser");
        Pregunta pVisionLaser=new Pregunta(visionLaser,"¿Tiene vision laser?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pVisionLaser);
        
        Atributo agilidad=new Atributo("agilidad");
        Pregunta pAgilidad=new Pregunta(agilidad,"¿Es especialmente agil?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pAgilidad);
        
        Atributo rubio=new Atributo("rubio");
        Pregunta pRubio=new Pregunta(rubio,"¿Tiene el pelo rubio?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pRubio);
        
        Atributo sinPelo=new Atributo("sinPelo");
        Pregunta pSinPelo=new Pregunta(sinPelo,"¿Es calvo o no tiene pelo?");
        ListaPreguntas.getListaPreguntas().anadirPregunta(pSinPelo);
        
        
        /*lista de atributos: mago, gryffindor, hogwarts, cicatriz, gafas, moreno, inteligencia, castaño, pelirrojo, miedoArañas, sexoFemenino, 
         * marvel, dc, xmen, ligaJusticia, vengadores, rapidezCurativa, fuerzaSobrehumana, humanoMutado, rico, sarcastico, cientifico
         * tecnologiaAvanzada, volar, velocidadSobrehumana, gigante, relacionadoAnimal, envejecimientoRetardado, artesMarciales,
         * guardianesGalaxia, artesMisticas, levitar, teletransportacion, manipulacionTiempo, visionLaser, agilidad, rubio, sinPelo,
        */
        Personaje HarryPotter=new Personaje("Harry Potter");
        HarryPotter.anadirAtributo(moreno);
        HarryPotter.anadirAtributo(gafas);
        HarryPotter.anadirAtributo(hogwarts);
        HarryPotter.anadirAtributo(gryffindor);
        HarryPotter.anadirAtributo(cicatriz);
        HarryPotter.anadirAtributo(mago);
        HarryPotter.anadirAtributo(rico);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(HarryPotter);
        
        Personaje HermioneGranger=new Personaje("Hermione Granger");
        HermioneGranger.anadirAtributo(mago);
        HermioneGranger.anadirAtributo(gryffindor);
        HermioneGranger.anadirAtributo(hogwarts);
        HermioneGranger.anadirAtributo(castaño);
        HermioneGranger.anadirAtributo(inteligencia);
        HermioneGranger.anadirAtributo(sexoFemenino);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(HermioneGranger);
        
        Personaje RonWeasley=new Personaje("Ron Weasley");
        RonWeasley.anadirAtributo(mago);
        RonWeasley.anadirAtributo(gryffindor);
        RonWeasley.anadirAtributo(hogwarts);
        RonWeasley.anadirAtributo(pelirrojo);
        RonWeasley.anadirAtributo(miedoArañas);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(RonWeasley);
        
        Personaje IronMan=new Personaje("Iron Man / Tony Stark");
        IronMan.anadirAtributo(marvel);
        IronMan.anadirAtributo(castaño);
        IronMan.anadirAtributo(rico);
        IronMan.anadirAtributo(sarcastico);
        IronMan.anadirAtributo(cientifico);
        IronMan.anadirAtributo(inteligencia);
        IronMan.anadirAtributo(volar);
        IronMan.anadirAtributo(vengadores);
        IronMan.anadirAtributo(tecnologiaAvanzada);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(IronMan);
        
        Personaje Spiderman=new Personaje("Spiderman / Peter Parker");
        Spiderman.anadirAtributo(marvel);
        Spiderman.anadirAtributo(castaño);
        Spiderman.anadirAtributo(inteligencia);
        Spiderman.anadirAtributo(vengadores);
        Spiderman.anadirAtributo(cientifico);
        Spiderman.anadirAtributo(humanoMutado);
        Spiderman.anadirAtributo(fuerzaSobrehumana);
        Spiderman.anadirAtributo(velocidadSobrehumana);
        Spiderman.anadirAtributo(rapidezCurativa);
        Spiderman.anadirAtributo(relacionadoAnimal);
        Spiderman.anadirAtributo(agilidad);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Spiderman);
        
        Personaje CapitanAmerica=new Personaje("Capitan America / Steve Rogers");
        CapitanAmerica.anadirAtributo(marvel);
        CapitanAmerica.anadirAtributo(inteligencia);
        CapitanAmerica.anadirAtributo(humanoMutado);
        CapitanAmerica.anadirAtributo(vengadores);
        CapitanAmerica.anadirAtributo(rubio);
        CapitanAmerica.anadirAtributo(velocidadSobrehumana);
        CapitanAmerica.anadirAtributo(rapidezCurativa);
        CapitanAmerica.anadirAtributo(fuerzaSobrehumana);
        CapitanAmerica.anadirAtributo(agilidad);
        CapitanAmerica.anadirAtributo(artesMarciales);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(CapitanAmerica);
        
        Personaje Hulk=new Personaje("Hulk / Bruce Banner");
        Hulk.anadirAtributo(marvel);
        Hulk.anadirAtributo(inteligencia);
        Hulk.anadirAtributo(humanoMutado);
        Hulk.anadirAtributo(vengadores);
        Hulk.anadirAtributo(moreno);
        Hulk.anadirAtributo(fuerzaSobrehumana);
        Hulk.anadirAtributo(rapidezCurativa);
        Hulk.anadirAtributo(velocidadSobrehumana);
        Hulk.anadirAtributo(gigante);
        Hulk.anadirAtributo(inteligencia);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Hulk);
        
        Personaje Lobezno=new Personaje("Lobezno");
        Lobezno.anadirAtributo(marvel);
        Lobezno.anadirAtributo(moreno);
        Lobezno.anadirAtributo(fuerzaSobrehumana);
        Lobezno.anadirAtributo(humanoMutado);
        Lobezno.anadirAtributo(relacionadoAnimal);
        Lobezno.anadirAtributo(rapidezCurativa);
        Lobezno.anadirAtributo(xmen);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Lobezno);		
        
        Personaje Thor=new Personaje("Thor");
        Thor.anadirAtributo(marvel);
        Thor.anadirAtributo(rubio);
        Thor.anadirAtributo(fuerzaSobrehumana);
        Thor.anadirAtributo(envejecimientoRetardado);
        Thor.anadirAtributo(vengadores);
        Thor.anadirAtributo(volar);
        Thor.anadirAtributo(rapidezCurativa);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Thor);
        
        Personaje ViudaNegra=new Personaje("Viuda Negra / Natasha ");
        ViudaNegra.anadirAtributo(sexoFemenino);
        ViudaNegra.anadirAtributo(marvel);
        ViudaNegra.anadirAtributo(vengadores);
        ViudaNegra.anadirAtributo(pelirrojo);
        ViudaNegra.anadirAtributo(agilidad);
        ViudaNegra.anadirAtributo(artesMarciales);
        ViudaNegra.anadirAtributo(inteligencia);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(ViudaNegra);
       
        Personaje StarLord=new Personaje("Star Lord / Peter Quill");
        StarLord.anadirAtributo(marvel);
        StarLord.anadirAtributo(guardianesGalaxia);
        StarLord.anadirAtributo(rubio);
        StarLord.anadirAtributo(sarcastico);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(StarLord);
        
        Personaje Groot=new Personaje("Groot");
        Groot.anadirAtributo(marvel);
        Groot.anadirAtributo(guardianesGalaxia);
        Groot.anadirAtributo(sinPelo);
        Groot.anadirAtributo(rapidezCurativa);
        Groot.anadirAtributo(fuerzaSobrehumana);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Groot);
        
        Personaje DoctorStrange=new Personaje("Doctor Strange");
        DoctorStrange.anadirAtributo(marvel);
        DoctorStrange.anadirAtributo(manipulacionTiempo);
        DoctorStrange.anadirAtributo(castaño);
        DoctorStrange.anadirAtributo(sarcastico);
        DoctorStrange.anadirAtributo(levitar);
        DoctorStrange.anadirAtributo(teletransportacion);
        DoctorStrange.anadirAtributo(artesMisticas);
        DoctorStrange.anadirAtributo(artesMarciales);
        DoctorStrange.anadirAtributo(inteligencia);
        DoctorStrange.anadirAtributo(rico);
        DoctorStrange.anadirAtributo(envejecimientoRetardado);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(DoctorStrange);
        
        Personaje Mistica=new Personaje("Mistica");
        Mistica.anadirAtributo(marvel);
        Mistica.anadirAtributo(sexoFemenino);
        Mistica.anadirAtributo(pelirrojo);
        Mistica.anadirAtributo(envejecimientoRetardado);
        Mistica.anadirAtributo(xmen);
        Mistica.anadirAtributo(rapidezCurativa);
        Mistica.anadirAtributo(humanoMutado);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Mistica);
        
        Personaje PanteraNegra=new Personaje("Pantera Negra / T'challa");
        PanteraNegra.anadirAtributo(marvel);
        PanteraNegra.anadirAtributo(moreno);
        PanteraNegra.anadirAtributo(agilidad);
        PanteraNegra.anadirAtributo(relacionadoAnimal);
        PanteraNegra.anadirAtributo(vengadores);
        PanteraNegra.anadirAtributo(artesMarciales);
        PanteraNegra.anadirAtributo(fuerzaSobrehumana);
        PanteraNegra.anadirAtributo(rapidezCurativa);
        PanteraNegra.anadirAtributo(velocidadSobrehumana);
        PanteraNegra.anadirAtributo(tecnologiaAvanzada);
        PanteraNegra.anadirAtributo(rico);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(PanteraNegra);
        
        Personaje Shuri=new Personaje("Shuri");
        Shuri.anadirAtributo(marvel);
        Shuri.anadirAtributo(tecnologiaAvanzada);
        Shuri.anadirAtributo(sexoFemenino);
        Shuri.anadirAtributo(moreno);
        Shuri.anadirAtributo(inteligencia);
        Shuri.anadirAtributo(artesMarciales);
        Shuri.anadirAtributo(rico);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Shuri);
        
        Personaje WonderWoman=new Personaje("Wonder Woman / Diana Prince");
        WonderWoman.anadirAtributo(dc);
        WonderWoman.anadirAtributo(moreno);
        WonderWoman.anadirAtributo(sexoFemenino);
        WonderWoman.anadirAtributo(fuerzaSobrehumana);
        WonderWoman.anadirAtributo(envejecimientoRetardado);
        WonderWoman.anadirAtributo(velocidadSobrehumana);
        WonderWoman.anadirAtributo(rapidezCurativa);
        WonderWoman.anadirAtributo(ligaJusticia);
        WonderWoman.anadirAtributo(volar);
        WonderWoman.anadirAtributo(artesMarciales);
        WonderWoman.anadirAtributo(inteligencia);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(WonderWoman);
        
        Personaje Batman=new Personaje("Batman/Bruce Wayne");
        Batman.anadirAtributo(dc);
        Batman.anadirAtributo(moreno);
        Batman.anadirAtributo(artesMarciales);
        Batman.anadirAtributo(ligaJusticia);
        Batman.anadirAtributo(rico);
        Batman.anadirAtributo(tecnologiaAvanzada);
        Batman.anadirAtributo(inteligencia);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Batman);
        
        Personaje Superman=new Personaje("Superman/Clark Kent");
        Superman.anadirAtributo(dc);
        Superman.anadirAtributo(moreno);
        Superman.anadirAtributo(ligaJusticia);
        Superman.anadirAtributo(volar);
        Superman.anadirAtributo(visionLaser);
        Superman.anadirAtributo(rapidezCurativa);
        Superman.anadirAtributo(levitar);
        Superman.anadirAtributo(velocidadSobrehumana);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Superman);

        Personaje Flash=new Personaje("Flash/Barry Allen");
        Flash.anadirAtributo(dc);
        Flash.anadirAtributo(castaño);
        Flash.anadirAtributo(rubio);
        Flash.anadirAtributo(velocidadSobrehumana);
        Flash.anadirAtributo(humanoMutado);
        Flash.anadirAtributo(rapidezCurativa);
        Flash.anadirAtributo(cientifico);
        Flash.anadirAtributo(manipulacionTiempo);
        Flash.anadirAtributo(inteligencia);
        Flash.anadirAtributo(tecnologiaAvanzada);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(Flash);
        
        Personaje GreenArrow=new Personaje("Green Arrow / Oliver Queen");
        GreenArrow.anadirAtributo(dc);
        GreenArrow.anadirAtributo(artesMarciales);
        GreenArrow.anadirAtributo(rubio);
        GreenArrow.anadirAtributo(rico);
        GreenArrow.anadirAtributo(tecnologiaAvanzada);
        GreenArrow.anadirAtributo(agilidad);
        ListaPersonajes.getListaPersonajes().anadirPersonaje(GreenArrow);
        
        
        ListaPreguntas.getListaPreguntas().realizarPreguntas();

    }

}
