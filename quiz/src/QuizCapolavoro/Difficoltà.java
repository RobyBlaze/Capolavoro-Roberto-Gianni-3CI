package QuizCapolavoro;

import java.util.Scanner;

public class Difficoltà {

    Scanner scritta = new Scanner(System.in);

    static void facile(int sceltadif) {

        System.out.println("scegli il tema della domanda");
        System.out.println("1. Musica");
        System.out.println("2. Generale");
    }

    static void medio(int sceltadif) {

        System.out.println("scegli il tema della domanda");
        System.out.println("1. Dinosauri");
        System.out.println("2. Generale");
        System.out.println("3. Libri");
    }

    static void difficile(int sceltadif) {

        System.out.println("scegli il tema della domanda");
        System.out.println("1. Videogiochi");
        System.out.println("2. Generale");
        System.out.println("3. Cinema");
    }

    public class Risposta {

        static int rispostafacile(int scelta, int risposta, int pt) {
            switch (scelta) {
                case 1:
                    System.out.println("Risposte catgeoria: Musica");
                    System.out.println("1. Metallica");
                    System.out.println("2. Queen");
                    System.out.println("3. AC/DC");

                    if (risposta == 1) {
                        pt++;
                    }
                    break;
                case 2:
                    System.out.println("Risposte catgeoria: Generale");
                    System.out.println("1. 7");
                    System.out.println("2. 3");
                    System.out.println("3. 10");
                    
                    if (risposta == 1) {
                        pt++;
                    }

                    break;
                default:
            }
            return pt;
        }

        static int rispostamedio(int scelta, int risposta, int pt) {
            switch (scelta) {
                case 1:
                    System.out.println("Risposte catgeoria: Dinosauri");
                    System.out.println("1. 1,5m");
                    System.out.println("2. 0,5m");
                    System.out.println("3. 2m");

                    break;
                case 2:
                    System.out.println("Risposte catgeoria: Generale");
                    System.out.println("1. 1988");
                    System.out.println("2. 1940");
                    System.out.println("3. 1871");

                    break;
                case 3:
                    System.out.println("Risposste categoria: Libri");
                    System.out.println("1. 8");
                    System.out.println("2. 14");
                    System.out.println("3. 7");

                    break;
                default:

            }
            return pt;
        }

        static int rispostadifficile(int scelta, int risposta, int pt) {
            switch (scelta) {
                case 1:
                    System.out.println("Risposte categoria: Videogiochi");
                    System.out.println("1. Uncharted 2 Il Covo dei Ladri");
                    System.out.println("2. Red Dead Redemtion II");
                    System.out.println("3. The Legend of Zelda Breath of the Wild");

                    break;
                case 2:
                    System.out.println("Risposte categoria: Generale");
                    System.out.println("1. 3500 a.C.");
                    System.out.println("2. 600 a.C.");
                    System.out.println("3. 1700 d.C.");

                    break;
                case 3:
                    System.out.println("Risposte categoria: Cinema");
                    System.out.println("1. Matrix");
                    System.out.println("2. Attacco al potere");
                    System.out.println("3. SpongeBob - Amici in Fuga");

                    break;
                default:
            }
            return pt;
        }

    }

}
