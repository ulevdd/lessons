package Lesson15;

public class Test7 {

    static void vremya (){

                int chas=0;
        OUTER: while (chas<24){

                    int min=-1;
                    MIDLE: do {
                        min++;
                        int sek=0;
                        INNER: while (sek<60){
                            System.out.println(chas + ":" + min+ ":" +sek);
                            sek++;
                        }
                    }while (min<59);
                    chas++;
            }


        }

    public static void main(String[] args) {
        vremya();
    }
    }

