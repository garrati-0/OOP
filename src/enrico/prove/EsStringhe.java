package enrico.prove;

public class EsStringhe {
    public static void main(String[] args) {

        String s1 = "ciao";
        String s2 = "ciao";
        String s5= "enrico";

        String s3 = new String("enrico");
        String s4 = new String("enrico");

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
        System.out.println(s1+" "+s5);//stampa s1"ciao" + " " + s5"enrico" -> "ciao enrico"

        s1.length(); //mi dice quanto è grande la stringa
    }
}
