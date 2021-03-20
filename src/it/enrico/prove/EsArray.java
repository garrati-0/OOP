package it.enrico.prove;

import java.awt.Point;//classe java dove ci sono i punti

public class EsArray {
    public static void main(String[] args) {
        //dichiarazione vettori d' interi + inizializzazione
        int[] v = new int[16];//v è un vettore di 16 interi tutti già inizializzati a 0
        //dichiarazione vettori di punti
        Point[] v1 = new Point[4];

        //a questo punto v è un oggetto di tipo vettore quindi
        //se scrivo "v." ho accesso a tutti i metodi dei vettori
        System.out.println(v.length);//length è un attributo della classe vettori
        //questo stampa quanti oggetti può contenere un vettore

        //un' altro modo per inizializzare i vettori
        int[] v2 = {1, 2, 3, 4, 5, 6};//questo è un vettore di 6 elementi
        //i quali sono automaticamente inizializzati a 1,2,3,4,5,6
        //invece IMPORTANTE nel primo caso quindi v tutti gli elementi
        //del vettore vengo inizializzati a 0

        //in java i vettori oltre hai tipi primitivi possono
        //contenere anche oggetti
        String[] s = new String[6];
        s[0] = new String("ciao");
        //si può usare anche l' inizializzazione statica
        String[] s1 = {new String("ciao"), new String("it/enrico")};
        System.out.println(s1[0]+" "+s1[1]);

        for(int i=0;i<v.length;i++){
            v[i]=i;
            System.out.println(v[i]);
        }

        //esiste anche un altro tipo di ciclo
        for(int a:v2){
            System.out.println(a);
        }

    }
}
