package it.enrico.prove;

public class EsStringhe {
    public static void main(String[] args) {

        String s1 = "ciao";
        String s2 = "ciao";
        String s5= "it/enrico";

        String s3 = new String("it/enrico");
        String s4 = new String("it/enrico");

        /*
        qui stamperà uguali perch java per risparmiare spazio non ha ha allocato due volte
        la memoria per s1 e s2 siccome sono uguali
         */
        if (s1 == s2) {
            System.out.println("uguali");
        }

        /*
        qui non stamperà infatti s3 e s4 sono oggetti diversi
        inversi vengono allocati dinamicante
         */
        if (s3 == s4) {
            System.out.println("uguali");
        }

        /*
        concatenazione di stringhw
         */
        System.out.println(s1+" "+s5);//stampa s1"ciao" + " " + s5"it.enrico" -> "ciao it.enrico"

        s1.length(); //mi dice quanto è grande la stringa


        //in questo caso stamperà uguali poichè sto usando un metoo della classe strighe
        //che ci dice se due strighe hanno lo stesso contenuto
        if(s3.equals(s4)){
            System.out.println("uguali s3 s4");


            //concatenazione
            String a="";
            StringBuffer ab=new StringBuffer();
            long start,end;  //variabili per misurare il tempo

            start = System.nanoTime();
            for(int i=0;i<100000;i++){  //in questo caso ci metterà più tempo infatti non modifica la strigha già esistente ma ne crea di nuove
                a=a + "a";
            }
            end = System.nanoTime();
            System.out.println((end-start)/1000000);

            start = System.nanoTime();
            for(int i=0;i<100000;i++){  //invece in questo caso modifica la stringa
                ab.append("a");
            }
            end = System.nanoTime();
            System.out.println((end-start)/1000000);


        }
    }
}
