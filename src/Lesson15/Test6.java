package Lesson15;

public class Test6 {
    public static void main(String[] args) {

        int chas=0;


        do {

            int min = 0;
            while (min <= 59) {
                System.out.println(chas + ":" + min);
                min++;
            }
            chas++;
        }
        while (chas<24);

        }




}
