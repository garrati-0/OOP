package it.enrico.prove;

public class EsempiJava {
    public static void main(String[] args) {
        /*
        questo
        è un commento
        multi linea
         */

        // questo un commento singola linea

        int i = 10;

        //esempio if
        if (i > 8) {
            System.out.println("if funziona");
        }

        //esempio for
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        //esiste final per le costanti
        final double PI = 3.1415;
        //se scrivessi ora PI=16 mi darebbe errore
    }
}
