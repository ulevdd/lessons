package Lesson14;

public class Test7 {


    static void time() {

        CHAS:
        for (int chas = 0; chas < 6; chas++) {
            MIN:
            for (int min = 0; min <60; min++) {
                if (chas > 1 && min % 10 == 0) {
                    break CHAS;
                }
                SEK:
                for (int sek = 0; sek < 60; sek++) {
                    System.out.println(chas + ":" + min + ":" + sek);
                    if ((sek * chas) > min) {
                        continue MIN;
                    }
                }
            }
        }

    }



    public static void main(String[] args) {

            time();


    }

}
