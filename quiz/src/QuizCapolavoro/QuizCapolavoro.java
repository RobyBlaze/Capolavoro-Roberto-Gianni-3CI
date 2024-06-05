package QuizCapolavoro;

import java.util.Scanner;

import QuizCapolavoro.Difficoltà.Risposta;

public class QuizCapolavoro {

    public static void main(String[] args) {
        //dichiarazioni variabili che verano usate
        Scanner in = new Scanner(System.in);
        String continua;
        int pt = 0;
        int risposta = 0;
        int sceltadif = 0;
        int scelta = 0;
        int volte = 0;
        int contatore_rispcorretta = 0;
        int contatore_rispsbagliata = 0;
        int contatore = 0;

        // istruzioni del programma
        System.out.println("In questo programma ti vera' chiesto di scegliere tra diverse opzioni");
        System.out.println("per rispondre basta che scrivi il numero della risposta");
        System.out.println("sarai tu a scegliere quante volte rispondere");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n");

        //scelta di volte in cui rispondere
        System.out.println("scrivi quante volte vuoi giocare");
        volte = in.nextInt();
        System.out.println("\n");

        //ciclo del quiz
        for (int i = 0; i < volte; i++) {
            System.out.println("Scegli la difficolta");
            System.out.println("1. Facile");
            System.out.println("2. Medio ");
            System.out.println("3. Difficile");
            sceltadif = in.nextInt();
            System.out.println("---------------------------------------------------------------------");

            //selezione difficoltà
            switch (sceltadif) {
                case 1:
                    Difficoltà.facile(sceltadif);
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("1. Quale band ha scritto la canzone 'Master of Puppet'?");
                    System.out.println("2. Qunati sono i re di Roma?");
                    scelta = in.nextInt();
                    Risposta.rispostafacile(scelta, risposta, pt); //chiamata classe delle risposte facili
                    risposta = in.nextInt();
                    switch(scelta){
                        case 1: 
                            if(risposta==1){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                        
                        case 2: 
                            if(risposta==1){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                            
                            
                        break;
                    }
                    break;
                case 2:
                    Difficoltà.medio(sceltadif);
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("1. Qual e' la vera altezza di un velociraptor?");
                    System.out.println("2. In che anno e' stato depositato il brevetto del primo telefono?");
                    System.out.println("3. Da quanti libri e' composta la saga di Harry Potter?");
                    scelta = in.nextInt();
                    Risposta.rispostamedio(scelta, risposta, pt); //chiamata classe delle risposte medie
                    risposta = in.nextInt();
                    switch(scelta){
                        case 1: 
                            if(risposta==2){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                        
                        case 2: 
                            if(risposta==3){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                        case 3: 
                            if(risposta==3){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                    }
                    break;
                case 3:
                    Difficoltà.difficile(sceltadif);
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("1. Qual e' di questi giochi non ha vinto il GOTY (Game of The Year)? ");
                    System.out.println("2. In che anno e' stato inventato il primo gioco da tavolo?");
                    System.out.println("3. In quale di questi film non ha recitato Keanu Reeves?");
                    scelta = in.nextInt();
                    Risposta.rispostadifficile(scelta, risposta, pt); //chiamata classe delle risposte difficili
                    risposta = in.nextInt();
                    switch(scelta){
                        case 1: 
                            if(risposta==2){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                        
                        case 2: 
                            if(risposta==1){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                        
                        case 3: 
                            if(risposta==3){
                                System.out.println("la risposta e' corretta");
                                
                                pt++;
                                contatore_rispcorretta++;
                            }else{
                                System.out.println("la risposta e' sbalgiata");
                                
                                contatore_rispsbagliata++;
                            }
                        break;
                    }
                    break;
                    
                default:

            }
            contatore++;
            
        }
        
        System.out.println("hai risposto ha "+ contatore);
        System.out.println("hai risposto correttamente ha  "+ contatore_rispcorretta +" domande" );
        System.out.println("hai sbalgiato "+ contatore_rispsbagliata +" domande" );
        System.out.println("punteggio totale: "+pt);

    }

}
