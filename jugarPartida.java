package packAkinator;

public class JugarPartida {
	public JugarPartida() {
		
	}
	
	public void jugarPartida() {
		ListaPreguntas.getListaPreguntas().realizarPreguntas();
		
	}
	public static void main (String [ ] args) {
		

		 System.out.println("\r\n" + 
           		" ________ ________  ___  ___  __    ___  __    ___  ________   ________  _________  ________  ________     \r\n" + 
           		"|\\  _____\\\\   __  \\|\\  \\|\\  \\|\\  \\ |\\  \\|\\  \\ |\\  \\|\\   ___  \\|\\   __  \\|\\___   ___\\\\   __  \\|\\   __  \\    \r\n" + 
           		"\\ \\  \\__/\\ \\  \\|\\  \\ \\  \\ \\  \\/  /|\\ \\  \\/  /|\\ \\  \\ \\  \\\\ \\  \\ \\  \\|\\  \\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\   \r\n" + 
           		" \\ \\   __\\\\ \\   _  _\\ \\  \\ \\   ___  \\ \\   ___  \\ \\  \\ \\  \\\\ \\  \\ \\   __  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\   _  _\\  \r\n" + 
           		"  \\ \\  \\_| \\ \\  \\\\  \\\\ \\  \\ \\  \\\\ \\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\\\  \\| \r\n" + 
           		"   \\ \\__\\   \\ \\__\\\\ _\\\\ \\__\\ \\__\\\\ \\__\\ \\__\\\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\__\\ \\__\\   \\ \\__\\ \\ \\_______\\ \\__\\\\ _\\ \r\n" + 
           		"    \\|__|    \\|__|\\|__|\\|__|\\|__| \\|__|\\|__| \\|__|\\|__|\\|__| \\|__|\\|__|\\|__|    \\|__|  \\|_______|\\|__|\\|__|\r\n" + 
           		"                                                                                                           \r\n" + 
           		"                                                                                                           \r\n" + 
           		"                                                                                                           \r\n" + 
           		"");	
	       System.out.println ("Bienvenido a Frikkinator el juego que trata de adivinar en quien estas pensando. Antes de comenzar elige un personaje de la siguiente lista:");
	       System.out.println( );
	       System.out.println("HarryPotter: Harry Potter, Hermione Granger, Ron Weasley, Dumbledore, Hagrid, Neville Longbottom, Snape, Draco Malfoy, Myrtle la llorona, "
	       		+ "Minerva McGonagall,");
	       System.out.println("             Fred y George Weasley, Luna Lovegood, Ginny Weasley ");
	       System.out.println( );
	       System.out.println("Superheroes: Iron Man, Spiderman, Capitán América,Hulk, Lobezno, Thor, Viuda Negra, Star Lord, Grood ,Doctor Strange, Mística, Pantera Negra, ");
	       System.out.println("              Shuri, Wonder Woman, Batman, Superman, Flash, Green Arrow, La bruja escarlata, Daredevil");
	       System.out.println("              Charles Xavier, Deadpool, Magneto, Ojo de Halcon, Black Canary, Supergirl");
	       System.out.println( );
	        System.out.println("¿Te has decidido ya? Si es el caso, responde a las preguntas que irán apareciendo en pantalla con un si, un no o un no se.");
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
	        Pregunta pInteligencia=new Pregunta(inteligencia,"¿Tiene un intelecto elevado?");
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
	        
	        Atributo director=new Atributo("director");
	        Pregunta pdirector=new Pregunta(director,"¿Su oficio es ser director?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pdirector);
	        
	        Atributo barba=new Atributo("barba");
	        Pregunta pbarba=new Pregunta(barba,"¿Tiene barba?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pbarba);
	        
	        Atributo blanco=new Atributo("blanco");
	        Pregunta pblanco=new Pregunta(blanco,"¿Tiene el pelo canoso/blanco?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pblanco);
	        
	        Atributo guardabosques=new Atributo("guardabosques");
	        Pregunta pguardabosques=new Pregunta(guardabosques,"¿Trabaja como guardabosques?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pguardabosques);
	        
	        Atributo bondad=new Atributo("bondad");
	        Pregunta pbondad=new Pregunta(bondad,"¿Destaca el personaje por su bondad?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pbondad);
	        
	        Atributo hermanos=new Atributo("hermanos");
	        Pregunta phermanos=new Pregunta(hermanos,"¿Tiene hermanas/os?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(phermanos);
	        
	        Atributo miedoso=new Atributo("miedoso");
	        Pregunta pmiedoso=new Pregunta(miedoso,"¿Destaca por ser miedoso?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pmiedoso);
	        
	        Atributo herbología=new Atributo("herbología");
	        Pregunta pherbología=new Pregunta(herbología,"¿Le gustan las plantas o trabaja en algo relacionado con ellas?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pherbología);
	        
	        Atributo profesor=new Atributo("profesor");
	        Pregunta pprofesor=new Pregunta(profesor,"¿Es profesor/a?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pprofesor);
	        
	        Atributo voldemort=new Atributo("voldemort");
	        Pregunta pvoldemort=new Pregunta(voldemort,"¿Ha sido alguna vez aliado de voldemort?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pvoldemort);
	        
	        Atributo slytherin=new Atributo("slytherin");
	        Pregunta pslytherin=new Pregunta(slytherin,"¿Pertenece/perteneció a slytherin?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pslytherin);
	      
	        Atributo fantasma=new Atributo("fantasma");
	        Pregunta pfantasma=new Pregunta(fantasma,"¿Es un fantasma?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pfantasma);
	        
	        Atributo tristeza=new Atributo("tristeza");
	        Pregunta ptristeza=new Pregunta(tristeza,"¿Destaca por su tristeza?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(ptristeza);
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
	        Pregunta pSarcastico=new Pregunta(sarcastico,"¿Es habitual en el/ella ser sarcastico o gracioso?");
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
	        
	        Atributo excentrico=new Atributo("excentrico");
	        Pregunta pexcentrico=new Pregunta(excentrico,"¿Es un personaje que llama la atención por su excentricidad?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pexcentrico);
	        
		////////NUEVOS
		Atributo ciego=new Atributo("ciego");
	        Pregunta pCiego=new Pregunta(ciego,"¿Es ciego?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pCiego);
	        
	        
	        Atributo telepatia=new Atributo("telepatia");
	        Pregunta pTelepatia=new Pregunta(telepatia,"¿Puede usar telepatia?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pTelepatia);
	        
	        Atributo inmortal=new Atributo("inmortal");
	        Pregunta pInmortal=new Pregunta(inmortal,"¿Es inmortal?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pInmortal);
	        
	        Atributo magnetoKinesis=new Atributo("magnetoKinesis");
	        Pregunta pMagnetoKinesis=new Pregunta(magnetoKinesis,"¿Esta entre sus habilidades la magneto kinesis?");
	        ListaPreguntas.getListaPreguntas().anadirPregunta(pMagnetoKinesis);
	        
	        /*lista de atributos: mago, gryffindor, hogwarts, cicatriz, gafas, moreno, inteligencia, castaño, pelirrojo, miedoArañas, sexoFemenino, 
	         * marvel, dc, xmen, ligaJusticia, vengadores, rapidezCurativa, fuerzaSobrehumana, humanoMutado, rico, sarcastico, cientifico
	         * tecnologiaAvanzada, volar, velocidadSobrehumana, gigante, relacionadoAnimal, envejecimientoRetardado, artesMarciales,
	         * guardianesGalaxia, artesMisticas, levitar, teletransportacion, manipulacionTiempo, visionLaser, agilidad, rubio, sinPelo,
	        */
	        Personaje harryPotter=new Personaje("Harry Potter");
	        harryPotter.anadirAtributo(moreno);
	        harryPotter.anadirAtributo(gafas);
	        harryPotter.anadirAtributo(hogwarts);
	        harryPotter.anadirAtributo(gryffindor);
	        harryPotter.anadirAtributo(cicatriz);
	        harryPotter.anadirAtributo(mago);
	        harryPotter.anadirAtributo(rico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(harryPotter);
	        
	        Personaje hermioneGranger=new Personaje("Hermione Granger");
	        hermioneGranger.anadirAtributo(mago);
	        hermioneGranger.anadirAtributo(gryffindor);
	        hermioneGranger.anadirAtributo(hogwarts);
	        hermioneGranger.anadirAtributo(castaño);
	        hermioneGranger.anadirAtributo(inteligencia);
	        hermioneGranger.anadirAtributo(sexoFemenino);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(hermioneGranger);
	        
	        Personaje ronWeasley=new Personaje("Ron Weasley");
	        ronWeasley.anadirAtributo(mago);
	        ronWeasley.anadirAtributo(gryffindor);
	        ronWeasley.anadirAtributo(hogwarts);
	        ronWeasley.anadirAtributo(pelirrojo);
	        ronWeasley.anadirAtributo(miedoArañas);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(ronWeasley);
			
		 Personaje dumbledore=new Personaje("Dumbledore");
		 
	        dumbledore.anadirAtributo(mago);
	        dumbledore.anadirAtributo(hogwarts);
	        dumbledore.anadirAtributo(director);
	        dumbledore.anadirAtributo(blanco);
	        dumbledore.anadirAtributo(barba);
	        dumbledore.anadirAtributo(inteligencia);
	        dumbledore.anadirAtributo(gafas);
	        dumbledore.anadirAtributo(gryffindor);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(dumbledore);
	        
	        Personaje hagrid=new Personaje("Hagrid");
	        hagrid.anadirAtributo(gigante);
	        hagrid.anadirAtributo(guardabosques);
	        hagrid.anadirAtributo(moreno);
	        hagrid.anadirAtributo(barba);
	        hagrid.anadirAtributo(hogwarts);
	        hagrid.anadirAtributo(bondad);
	        hagrid.anadirAtributo(hermanos);
	        hagrid.anadirAtributo(gryffindor);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(hagrid);
	        
	        Personaje neville=new Personaje("Neville Longbottom");
	        neville.anadirAtributo(mago);
	        neville.anadirAtributo(moreno);
	        neville.anadirAtributo(gryffindor);
	        neville.anadirAtributo(hogwarts);
	        neville.anadirAtributo(miedoso);
	        neville.anadirAtributo(herbología);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(neville);
	        
	        Personaje snape=new Personaje("Snape");
	        snape.anadirAtributo(mago);
	        snape.anadirAtributo(profesor);
	        snape.anadirAtributo(moreno);
	        snape.anadirAtributo(voldemort);
	        snape.anadirAtributo(hogwarts);
	        snape.anadirAtributo(slytherin);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(snape);
	        
	        Personaje draco =new Personaje("Draco Malfoy");
	        draco.anadirAtributo(mago);
	        draco.anadirAtributo(rubio);
	        draco.anadirAtributo(voldemort);
	        draco.anadirAtributo(slytherin);
	        draco.anadirAtributo(hogwarts);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(draco);
	        
	        Personaje myrtle =new Personaje("Myrtle Warren");
	        myrtle.anadirAtributo(hogwarts);
	        myrtle.anadirAtributo(fantasma);
	        myrtle.anadirAtributo(tristeza);
	        myrtle.anadirAtributo(gafas);
	        myrtle.anadirAtributo(moreno);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(myrtle); 
	        
	        Personaje mcGonagall =new Personaje("Minerva McGonagall");
	        mcGonagall.anadirAtributo(profesor);
	        mcGonagall.anadirAtributo(blanco);
	        mcGonagall.anadirAtributo(gryffindor);
	        mcGonagall.anadirAtributo(hogwarts);
	        mcGonagall.anadirAtributo(sexoFemenino);
	        mcGonagall.anadirAtributo(inteligencia);
	        mcGonagall.anadirAtributo(mago);
	        mcGonagall.anadirAtributo(gafas);
	        mcGonagall.anadirAtributo(inteligencia);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(mcGonagall); 
	        
	        Personaje lunaLovegood =new Personaje("Luna Lovegood");
	        lunaLovegood.anadirAtributo(mago);
	        lunaLovegood.anadirAtributo(rubio);
	        lunaLovegood.anadirAtributo(hogwarts);
	        lunaLovegood.anadirAtributo(bondad);
	        lunaLovegood.anadirAtributo(excentrico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(lunaLovegood); 
	        
	        Personaje gemelosWeasley= new Personaje("Fred y George Weasley");
	        gemelosWeasley.anadirAtributo(hogwarts);
	        gemelosWeasley.anadirAtributo(hermanos);
	        gemelosWeasley.anadirAtributo(gryffindor);
	        gemelosWeasley.anadirAtributo(pelirrojo);
	        gemelosWeasley.anadirAtributo(mago);
	        gemelosWeasley.anadirAtributo(sarcastico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(gemelosWeasley); 
	        
	        Personaje ginnyWeasley= new Personaje("Ginny Weasley");
	        ginnyWeasley.anadirAtributo(hogwarts);
	        ginnyWeasley.anadirAtributo(hermanos);
	        ginnyWeasley.anadirAtributo(gryffindor);
	        ginnyWeasley.anadirAtributo(pelirrojo);
	        ginnyWeasley.anadirAtributo(mago);
	        ginnyWeasley.anadirAtributo(sexoFemenino);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(ginnyWeasley); 
	        
	        
	        Personaje ironMan=new Personaje("Iron Man / Tony Stark");
	        ironMan.anadirAtributo(marvel);
	        ironMan.anadirAtributo(castaño);
	        ironMan.anadirAtributo(rico);
	        ironMan.anadirAtributo(sarcastico);
	        ironMan.anadirAtributo(cientifico);
	        ironMan.anadirAtributo(inteligencia);
	        ironMan.anadirAtributo(volar);
	        ironMan.anadirAtributo(vengadores);
	        ironMan.anadirAtributo(tecnologiaAvanzada);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(ironMan);
	        
	        Personaje spiderman=new Personaje("Spiderman / Peter Parker");
	        spiderman.anadirAtributo(marvel);
	        spiderman.anadirAtributo(castaño);
	        spiderman.anadirAtributo(inteligencia);
	        spiderman.anadirAtributo(vengadores);
	        spiderman.anadirAtributo(cientifico);
	        spiderman.anadirAtributo(humanoMutado);
	        spiderman.anadirAtributo(fuerzaSobrehumana);
	        spiderman.anadirAtributo(velocidadSobrehumana);
	        spiderman.anadirAtributo(rapidezCurativa);
	        spiderman.anadirAtributo(relacionadoAnimal);
	        spiderman.anadirAtributo(agilidad);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(spiderman);
	        
	        Personaje capitanAmerica=new Personaje("Capitan America / Steve Rogers");
	        capitanAmerica.anadirAtributo(marvel);
	        capitanAmerica.anadirAtributo(inteligencia);
	        capitanAmerica.anadirAtributo(humanoMutado);
	        capitanAmerica.anadirAtributo(vengadores);
	        capitanAmerica.anadirAtributo(rubio);
	        capitanAmerica.anadirAtributo(velocidadSobrehumana);
	        capitanAmerica.anadirAtributo(rapidezCurativa);
	        capitanAmerica.anadirAtributo(fuerzaSobrehumana);
	        capitanAmerica.anadirAtributo(agilidad);
	        capitanAmerica.anadirAtributo(artesMarciales);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(capitanAmerica);
	        
	        Personaje hulk=new Personaje("Hulk / Bruce Banner");
	        hulk.anadirAtributo(marvel);
	        hulk.anadirAtributo(inteligencia);
	        hulk.anadirAtributo(humanoMutado);
	        hulk.anadirAtributo(vengadores);
	        hulk.anadirAtributo(moreno);
	        hulk.anadirAtributo(fuerzaSobrehumana);
	        hulk.anadirAtributo(rapidezCurativa);
	        hulk.anadirAtributo(velocidadSobrehumana);
	        hulk.anadirAtributo(gigante);
	        hulk.anadirAtributo(inteligencia);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(hulk);
	        
	        Personaje lobezno=new Personaje("Lobezno");
	        lobezno.anadirAtributo(marvel);
	        lobezno.anadirAtributo(moreno);
	        lobezno.anadirAtributo(fuerzaSobrehumana);
	        lobezno.anadirAtributo(humanoMutado);
	        lobezno.anadirAtributo(relacionadoAnimal);
	        lobezno.anadirAtributo(rapidezCurativa);
	        lobezno.anadirAtributo(xmen);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(lobezno);		
	        
	        Personaje thor=new Personaje("Thor");
	        thor.anadirAtributo(marvel);
	        thor.anadirAtributo(rubio);
	        thor.anadirAtributo(fuerzaSobrehumana);
	        thor.anadirAtributo(envejecimientoRetardado);
	        thor.anadirAtributo(vengadores);
	        thor.anadirAtributo(volar);
	        thor.anadirAtributo(rapidezCurativa);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(thor);
	        
	        Personaje viudaNegra=new Personaje("Viuda Negra / Natasha ");
	        viudaNegra.anadirAtributo(sexoFemenino);
	        viudaNegra.anadirAtributo(marvel);
	        viudaNegra.anadirAtributo(vengadores);
	        viudaNegra.anadirAtributo(pelirrojo);
	        viudaNegra.anadirAtributo(agilidad);
	        viudaNegra.anadirAtributo(artesMarciales);
	        viudaNegra.anadirAtributo(inteligencia);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(viudaNegra);
	       
	        Personaje starLord=new Personaje("Star Lord / Peter Quill");
	        starLord.anadirAtributo(marvel);
	        starLord.anadirAtributo(guardianesGalaxia);
	        starLord.anadirAtributo(rubio);
	        starLord.anadirAtributo(sarcastico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(starLord);
	        
	        Personaje groot=new Personaje("Groot");
	        groot.anadirAtributo(marvel);
	        groot.anadirAtributo(guardianesGalaxia);
	        groot.anadirAtributo(sinPelo);
	        groot.anadirAtributo(rapidezCurativa);
	        groot.anadirAtributo(fuerzaSobrehumana);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(groot);
	        
	        Personaje doctorStrange=new Personaje("Doctor Strange");
	        doctorStrange.anadirAtributo(marvel);
	        doctorStrange.anadirAtributo(manipulacionTiempo);
	        doctorStrange.anadirAtributo(castaño);
	        doctorStrange.anadirAtributo(sarcastico);
	        doctorStrange.anadirAtributo(levitar);
	        doctorStrange.anadirAtributo(teletransportacion);
	        doctorStrange.anadirAtributo(artesMisticas);
	        doctorStrange.anadirAtributo(artesMarciales);
	        doctorStrange.anadirAtributo(inteligencia);
	        doctorStrange.anadirAtributo(rico);
	        doctorStrange.anadirAtributo(envejecimientoRetardado);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(doctorStrange);
	        
	        Personaje mistica=new Personaje("Mistica");
	        mistica.anadirAtributo(marvel);
	        mistica.anadirAtributo(sexoFemenino);
	        mistica.anadirAtributo(pelirrojo);
	        mistica.anadirAtributo(envejecimientoRetardado);
	        mistica.anadirAtributo(xmen);
	        mistica.anadirAtributo(rapidezCurativa);
	        mistica.anadirAtributo(humanoMutado);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(mistica);
	        
	        Personaje panteraNegra=new Personaje("Pantera Negra / T'challa");
	        panteraNegra.anadirAtributo(marvel);
	        panteraNegra.anadirAtributo(moreno);
	        panteraNegra.anadirAtributo(agilidad);
	        panteraNegra.anadirAtributo(relacionadoAnimal);
	        panteraNegra.anadirAtributo(vengadores);
	        panteraNegra.anadirAtributo(artesMarciales);
	        panteraNegra.anadirAtributo(fuerzaSobrehumana);
	        panteraNegra.anadirAtributo(rapidezCurativa);
	        panteraNegra.anadirAtributo(velocidadSobrehumana);
	        panteraNegra.anadirAtributo(tecnologiaAvanzada);
	        panteraNegra.anadirAtributo(rico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(panteraNegra);
	        
	        Personaje shuri=new Personaje("Shuri");
	        shuri.anadirAtributo(marvel);
	        shuri.anadirAtributo(tecnologiaAvanzada);
	        shuri.anadirAtributo(sexoFemenino);
	        shuri.anadirAtributo(moreno);
	        shuri.anadirAtributo(inteligencia);
	        shuri.anadirAtributo(artesMarciales);
	        shuri.anadirAtributo(rico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(shuri);
	        
	        Personaje wonderWoman=new Personaje("Wonder Woman / Diana Prince");
	        wonderWoman.anadirAtributo(dc);
	        wonderWoman.anadirAtributo(moreno);
	        wonderWoman.anadirAtributo(sexoFemenino);
	        wonderWoman.anadirAtributo(fuerzaSobrehumana);
	        wonderWoman.anadirAtributo(envejecimientoRetardado);
	        wonderWoman.anadirAtributo(velocidadSobrehumana);
	        wonderWoman.anadirAtributo(rapidezCurativa);
	        wonderWoman.anadirAtributo(ligaJusticia);
	        wonderWoman.anadirAtributo(volar);
	        wonderWoman.anadirAtributo(artesMarciales);
	        wonderWoman.anadirAtributo(inteligencia);
		wonderWoman.anadirAtributo(inmortal);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(wonderWoman);
	        
	        Personaje batman=new Personaje("Batman/Bruce Wayne");
	        batman.anadirAtributo(dc);
	        batman.anadirAtributo(moreno);
	        batman.anadirAtributo(artesMarciales);
	        batman.anadirAtributo(ligaJusticia);
	        batman.anadirAtributo(rico);
	        batman.anadirAtributo(tecnologiaAvanzada);
	        batman.anadirAtributo(inteligencia);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(batman);
	        
	        Personaje superman=new Personaje("Superman/Clark Kent");
	        superman.anadirAtributo(dc);
	        superman.anadirAtributo(moreno);
	        superman.anadirAtributo(ligaJusticia);
	        superman.anadirAtributo(volar);
	        superman.anadirAtributo(visionLaser);
	        superman.anadirAtributo(rapidezCurativa);
	        superman.anadirAtributo(levitar);
	        superman.anadirAtributo(velocidadSobrehumana);
		superman.anadirAtributo(fuerzaSobrehumana);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(superman);

	        Personaje flash=new Personaje("Flash/Barry Allen");
	        flash.anadirAtributo(dc);
	        flash.anadirAtributo(castaño);
	        flash.anadirAtributo(rubio);
	        flash.anadirAtributo(velocidadSobrehumana);
	        flash.anadirAtributo(humanoMutado);
	        flash.anadirAtributo(rapidezCurativa);
	        flash.anadirAtributo(cientifico);
	        flash.anadirAtributo(manipulacionTiempo);
	        flash.anadirAtributo(inteligencia);
	        flash.anadirAtributo(tecnologiaAvanzada);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(flash);
	        
	        Personaje greenArrow=new Personaje("Green Arrow / Oliver Queen");
	        greenArrow.anadirAtributo(dc);
	        greenArrow.anadirAtributo(artesMarciales);
	        greenArrow.anadirAtributo(rubio);
	        greenArrow.anadirAtributo(rico);
	        greenArrow.anadirAtributo(tecnologiaAvanzada);
	        greenArrow.anadirAtributo(agilidad);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(greenArrow);
	        
		//////nuevos///////////////////////////////////////////////////////////////////////////
		Personaje brujaEscarlata=new Personaje("La bruja escarlata/Wanda");
	        brujaEscarlata.anadirAtributo(marvel);
	        brujaEscarlata.anadirAtributo(sexoFemenino);
	        brujaEscarlata.anadirAtributo(vengadores);
	        brujaEscarlata.anadirAtributo(humanoMutado);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(brujaEscarlata);
	        
	        Personaje daredevil=new Personaje("Daredevil/Matt Murdock");
	        daredevil.anadirAtributo(marvel);
	        daredevil.anadirAtributo(artesMarciales);
	        daredevil.anadirAtributo(ciego);
	        daredevil.anadirAtributo(inteligencia);
	        daredevil.anadirAtributo(agilidad);
	        daredevil.anadirAtributo(moreno);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(daredevil);
	        
	        Personaje charlesXavier=new Personaje("Charles Xavier / Profesor X");
	        charlesXavier.anadirAtributo(marvel);
	        charlesXavier.anadirAtributo(xmen);
	        charlesXavier.anadirAtributo(humanoMutado);
	        charlesXavier.anadirAtributo(telepatia);
	        charlesXavier.anadirAtributo(inteligencia);
	        charlesXavier.anadirAtributo(castaño);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(charlesXavier);
	        
	        Personaje deadpool=new Personaje("Deadpool");
	        deadpool.anadirAtributo(inmortal);
	        deadpool.anadirAtributo(marvel);
	        deadpool.anadirAtributo(artesMarciales);
	        deadpool.anadirAtributo(sinPelo);
	        deadpool.anadirAtributo(rapidezCurativa);
	        deadpool.anadirAtributo(fuerzaSobrehumana);
	        deadpool.anadirAtributo(sarcastico);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(deadpool);
	        
	        Personaje magneto=new Personaje("Magneto");
	        magneto.anadirAtributo(marvel);
	        magneto.anadirAtributo(magnetoKinesis);
	        magneto.anadirAtributo(inteligencia);
	        magneto.anadirAtributo(humanoMutado);
	        magneto.anadirAtributo(rubio);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(magneto);
	        
	        
	        Personaje ojoHalcon=new Personaje("Ojo de halcon");
	        ojoHalcon.anadirAtributo(marvel);
	        ojoHalcon.anadirAtributo(vengadores);
	        ojoHalcon.anadirAtributo(relacionadoAnimal);
	        ojoHalcon.anadirAtributo(artesMarciales);
	        ojoHalcon.anadirAtributo(rubio);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(ojoHalcon);
	        
	        Personaje blackCanary=new Personaje("Canario Negro");
	        blackCanary.anadirAtributo(dc);
	        blackCanary.anadirAtributo(sexoFemenino);
	        blackCanary.anadirAtributo(rubio);
	        blackCanary.anadirAtributo(artesMarciales);
	        blackCanary.anadirAtributo(humanoMutado);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(blackCanary);
	        
	        Personaje supergirl=new Personaje("Supergirl / Kara");
	        supergirl.anadirAtributo(dc);
	        supergirl.anadirAtributo(sexoFemenino);
	        supergirl.anadirAtributo(rubio);
	        supergirl.anadirAtributo(volar);
	        supergirl.anadirAtributo(velocidadSobrehumana);
	        supergirl.anadirAtributo(visionLaser);
	        supergirl.anadirAtributo(rapidezCurativa);
	        supergirl.anadirAtributo(levitar);
	        supergirl.anadirAtributo(envejecimientoRetardado);
	        supergirl.anadirAtributo(fuerzaSobrehumana);
	        ListaPersonajes.getListaPersonajes().anadirPersonaje(supergirl);
	        
	        JugarPartida partida=new JugarPartida();
	        partida.jugarPartida();

	}

}
