package Lesson6;

public class Overload {

    void show(int a) {
        System.out.println("Data Type INT");
        System.out.println(a);
        System.out.println("-------------------");
    }
    void show (boolean b1){
        System.out.println("Data Type boolean");
        System.out.println(b1);
        System.out.println("-------------------");
    }
    void show (String s){
        System.out.println("Data Type String");
        System.out.println(s);
        System.out.println("-------------------");

    }

    void show (String s1, boolean b2){

        System.out.println(s1+ " " + b2);
        System.out.println("-------------------");

    }


}


class OverloadTest {

    public static void main(String[] args) {

        Overload mO = new Overload();

        mO.show(455);
        mO.show(true);
        mO.show("Hellow");
        mO.show("This", false);
    }

}