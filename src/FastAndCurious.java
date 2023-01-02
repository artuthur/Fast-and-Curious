import extensions.CSVFile;
import extensions.File;

class FastAndCurious extends Program {
    
    //variables constantes
    final String DW_NAME= "Deuvinne Johnson";
    final int temps_pause = 1000;
    String pseudo;
    String rep;
    int score = 0;
    int emplacement=1;
    String[][] tab=new String [1][3];

    //algorithme principal
    void algorithm(){
        CSVFile sauv = loadCSV("sauvegarde"); 
        //On verifie si la sauvegarde comporte déjà un pseudo, si non on commence une nouvelle partie avec un nouveau pseudo.
        if(equals(getCell(sauv,0,1),"null")){
            clearScreen();
            print("Votre pseudo : ");
            pseudo = readString();
            //vérification saisie utilisateur.
            while(equals(pseudo,"")){
                println("Entrez un pseudo valide.");
                print("Votre pseudo : ");
                pseudo=readString();
            }
            tab[0][1] = pseudo;

            introduction(); 
            clearScreen();

            affichage_circuit();
            printQuestion();
            clearScreen();
            
            affichage_circuit2();
            printQuestion2();
            clearScreen();

            affichage_circuit3();
            printQuestion3();
            clearScreen();

            affichage_circuit4();
            printQuestion4(); 
            clearScreen();

            affichage_circuit5();
            printQuestion5();
            clearScreen();

            affichage_circuit6();
            printQuestion6();
            clearScreen();

            affichage_circuit7();
            printQuestion7();
            clearScreen();

            affichage_circuit8();
            printQuestion8();
            clearScreen();

            affichage_circuit9();
            printQuestion9();
            clearScreen();

            affichage_circuit10();
            printQuestion10();

            clearScreen();
            printscorefin();
        
        //si la sauvegarde contient déjà un pseudo alors on demande si l'utilisateur veut charger cette sauvegarde ou si il désire la supprimer
        }else{
            clearScreen();
            println("Une sauvegarde a été trouvé : ");
            println("1.Charger la sauvegarde.     2.Supprimer la sauvegarde.");
            print("Votre choix (1 ou 2) : ");
            String choix=readString();
            //vérification saisie utilisateur.
            while(!equals(substring(choix,0,1),"1") && !equals(substring(choix,0,1),"2")){
                println("Veuillez choisir un nombre entre 1 et 2.");
                print("Votre choix : ");
                choix=readString();
            }
            //Le choix n°1 c'est-à-dire charger la sauvegarde donc on récupère les informations de la sauvegarde tel que l'emplacement,le score et le pseudo.
            if(equals(substring(choix,0,1),"1")){
                pseudo = getCell(sauv,0,1);
                score = stringToInt(getCell(sauv,0,0));
                emplacement = stringToInt(getCell(sauv,0,2));
                //La partie sera alors chargé en fonction du n° d'emplacement pour éviter toutes incohérences. 
                if(emplacement==1){
                    clearScreen();
                    affichage_circuit();
                    printQuestion();
                    clearScreen();
                    
                    affichage_circuit2();
                    printQuestion2();
                    clearScreen();

                    affichage_circuit3();
                    printQuestion3();
                    clearScreen();

                    affichage_circuit4();
                    printQuestion4(); 
                    clearScreen();

                    affichage_circuit5();
                    printQuestion5();
                    clearScreen();

                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==2){
                    clearScreen();
                    affichage_circuit2();
                    printQuestion2();
                    clearScreen();

                    affichage_circuit3();
                    printQuestion3();
                    clearScreen();

                    affichage_circuit4();
                    printQuestion4(); 
                    clearScreen();

                    affichage_circuit5();
                    printQuestion5();
                    clearScreen();

                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==3){
                    clearScreen();
                    affichage_circuit3();
                    printQuestion3();
                    clearScreen();

                    affichage_circuit4();
                    printQuestion4(); 
                    clearScreen();

                    affichage_circuit5();
                    printQuestion5();
                    clearScreen();

                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==4){
                    clearScreen();
                    affichage_circuit4();
                    printQuestion4(); 
                    clearScreen();

                    affichage_circuit5();
                    printQuestion5();
                    clearScreen();

                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==5){
                    clearScreen();
                    affichage_circuit5();
                    printQuestion5();
                    clearScreen();

                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==6){
                    clearScreen();
                    affichage_circuit6();
                    printQuestion6();
                    clearScreen();

                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==7){
                    clearScreen();
                    affichage_circuit7();
                    printQuestion7();
                    clearScreen();

                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==8){
                    clearScreen();
                    affichage_circuit8();
                    printQuestion8();
                    clearScreen();

                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==9){
                    clearScreen();
                    affichage_circuit9();
                    printQuestion9();
                    clearScreen();

                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }else if(emplacement==10){
                    clearScreen();
                    affichage_circuit10();
                    printQuestion10();

                    clearScreen();
                    printscorefin();
                }
            }
            //Le choix n°2 qui consiste à supprimer la sauvegarde. Dans ce cas là nous allons juste supprimer les informations de la sauvegarder en les substituant par null.
            //puis ensuite on démarre une nouvelle partie.
            if(equals(substring(choix,0,1),"2")){
                for(int i=0;i<length(tab);i++){
                    tab[0][i]=null;
                }
                saveCSV(tab,"sauvegarde");
                clearScreen();
                print("Votre pseudo : ");
                pseudo = readString();
                //vérification saisie utilisateur.
                while(equals(pseudo,"")){
                    println("Entrez un pseudo valide.");
                    print("Votre pseudo : ");
                    pseudo=readString();
                }
                tab[0][1] = pseudo;

                introduction(); 
                clearScreen();

                affichage_circuit();
                printQuestion();
                clearScreen();
                
                affichage_circuit2();
                printQuestion2();
                clearScreen();

                affichage_circuit3();
                printQuestion3();
                clearScreen();

                affichage_circuit4();
                printQuestion4(); 
                clearScreen();

                affichage_circuit5();
                printQuestion5();
                clearScreen();

                affichage_circuit6();
                printQuestion6();
                clearScreen();

                affichage_circuit7();
                printQuestion7();
                clearScreen();

                affichage_circuit8();
                printQuestion8();
                clearScreen();

                affichage_circuit9();
                printQuestion9();
                clearScreen();

                affichage_circuit10();
                printQuestion10();

                clearScreen();
                printscorefin();

            }
            //////
            // A Ecrire :
            //  Test(s)
        }
    }

    // Dwayne (narrateur) parle
    void deuvinneParle(String phrase){
        println(DW_NAME + " : " + phrase);
        delay(temps_pause);
    }

    // Introduction
    void introduction(){
        clearScreen();
        affichage_intro();
        readString();
        deuvinneParle("Bienvenue " + pseudo + " prêt à prendre le volant ?");
        deuvinneParle("Avant tout, prends le temps de lire les règles et les conditions d'utilisation du jeu (READ_ME.md) c'est SUPER important !!");
        deuvinneParle("Aller vas lire, je t'attends...");
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        println("Appuier sur entrée pour commencer la partie !");
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        readString();
    }


    // Affichage de ""l'ascii art"" Fast&Curious à partir du fichier texte_intro.txt
    void affichage_intro(){
        File texte_intro = newFile("texte_intro.txt");
	    while(ready(texte_intro)){
	        println(readLine(texte_intro));
	    }
    }

    // Affichage du circuit initial
    void affichage_circuit(){
        File texte_circuit = newFile("texte_circuit_initial.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°2
    void affichage_circuit2(){
        File texte_circuit = newFile("texte_circuit_initial2.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°3
    void affichage_circuit3(){
        File texte_circuit = newFile("texte_circuit_initial3.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°4
    void affichage_circuit4(){
        File texte_circuit = newFile("texte_circuit_initial4.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°5
    void affichage_circuit5(){
        File texte_circuit = newFile("texte_circuit_initial5.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°6
    void affichage_circuit6(){
        File texte_circuit = newFile("texte_circuit_initial6.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°7
    void affichage_circuit7(){
        File texte_circuit = newFile("texte_circuit_initial7.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°8
    void affichage_circuit8(){
        File texte_circuit = newFile("texte_circuit_initial8.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°9
    void affichage_circuit9(){
        File texte_circuit = newFile("texte_circuit_initial9.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Affichage du circuit ainsi que la voiture à l'emplacement n°10
    void affichage_circuit10(){
        File texte_circuit = newFile("texte_circuit_initial10.txt");
	    while(ready(texte_circuit)){
	        println(readLine(texte_circuit));
	    }
    }

    // Tire une question aléatoire et affiche cette question.
    void printQuestion(){
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 0, 0));
        print("Votre réponse : ");
        rep = readString();
        //vérification saisie utilisateur.
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
        }else{
            if(equals(rep, getCell(questions, 0, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }
    
    void printQuestion2(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 1, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 1, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion3(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 2, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 2, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion4(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 3, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 3, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion5(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 4, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 4, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion6(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 5, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 5, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion7(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 6, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 6, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion8(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 7, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 7, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion9(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 8, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 8, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    void printQuestion10(){
        emplacement++;
        CSVFile questions = loadCSV("CSV_Question.csv");
        println(getCell(questions, 9, 0));
        print("Votre réponse : ");
        rep = readString();
        while(equals(rep,"")){
            println("Entrez une réponse valide.");
            print("Votre réponse : ");
            rep=readString();
        }
        if(save(tab,rep)){
            return;
        }else{
            if(equals(rep, getCell(questions, 9, 1))){
                deuvinneParle("Bien joué !");
                delay(temps_pause);
                score = score+1;
            }else{
                deuvinneParle("Mauvaise réponse...");
                delay(temps_pause);
            }
        }
    }

    //Affiche le score du joueur à la fin de la partie.
    void printscorefin(){
        deuvinneParle("Ton score est de :" + score + "/10");
        if(score<5){
            deuvinneParle("ça n'a pas été suffisant, tu peux mieux faire !!");
        } else if(score==5){
            deuvinneParle("Vous êtes arrivés égalité ! Cependant je suis sur que tu peux mieux faire !!");
        } else if(score>5){
            deuvinneParle("Félicitations tu y es finalement arrivé ! Tu es un champion.");
        }
    }

    //Fonction qui permet de passer un integer en string
    String toString(int a){
        String res = ""+a;
        return res;
    }

    //Fonction qui permet à l'utilisateur lorsque celui-ci entre le caractère 'Q' de soit sauvegarder (via la fichier csv nommé sauvegarde) soit de continuer à jouer.
    boolean save(String[][] tab,String rep){
        boolean res = false;
        if(equals(rep,"Q")){
            clearScreen();
            deuvinneParle("Tu veux sauvegarder ?");
            println("1. Oui, je sauvegarde.              2.Non.");
            print("Votre choix (1 ou 2) : ");
            String choix = readString();
            while(!equals(substring(choix,0,1),"1") && !equals(substring(choix,0,1),"2")){
                println("Veuillez choisir un nombre entre 1 et 2.");
                print("Votre choix : ");
                choix=readString();
            }
            if(equals(substring(choix,0,1),"1")){
                tab[0][0]=toString(score);
                tab[0][2]=toString(emplacement);
                saveCSV(tab, "sauvegarde");
                res = true;
            }if(equals(substring(choix,0,1),"2")){
                clearScreen();
                if(emplacement==1){
                    affichage_circuit();
                    printQuestion();
                }else if(emplacement==2){
                    affichage_circuit2();
                    printQuestion2();
                }else if(emplacement==3){
                    affichage_circuit3();
                    printQuestion3();
                }else if(emplacement==4){
                    affichage_circuit4();
                    printQuestion4();
                }else if(emplacement==5){
                    affichage_circuit5();
                    printQuestion5();
                }else if(emplacement==6){
                    affichage_circuit6();
                    printQuestion6();
                }else if(emplacement==7){
                    affichage_circuit7();
                    printQuestion7();
                }else if(emplacement==8){
                    affichage_circuit8();
                    printQuestion8();
                }else if(emplacement==9){
                    affichage_circuit9();
                    printQuestion9();
                }else if(emplacement==10){
                    affichage_circuit10();
                    printQuestion10();
                }
            }
        }
        return res;
    }

    void testToString(){
        assertEquals("18",toString(18));
        assertEquals("0",toString(0));
        assertNotEquals("",toString());
        assertNotEquals("d",toString('d'));
    }

    void testStringToInt(){
        assertEquals(1598,stringToInt("1598"));
        assertEquals(25,stringToInt("25"));
        assertEquals(0,stringToInt("0"));
        assertEquals(-62,stringToInt("-62"));
    }
}