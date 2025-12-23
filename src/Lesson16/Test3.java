package Lesson16;

public class Test3 {
    public static void main(String[] args) {

        String s1= "Hello World!";
        String s2 = "Good";
        String s3 = s1.concat(s2).trim().replace("Good", "Хорошо").substring(6,12);
        System.out.println(s1.substring(s1.indexOf('W')));
        System.out.println("");
        System.out.println(s3);
        System.out.println("");

        System.out.println(s1);
        System.out.println(s2);


    }

}
