package Lesson15;

public class Test8 {

    public static void main(String[] args) {
        int ch=0;
        int min= 0;
        while (ch<24){
            while (min<60){
                System.out.println(ch+ ":" + min);
                min++;
            }
            min=0;
            ch++;
        }

    }

}
