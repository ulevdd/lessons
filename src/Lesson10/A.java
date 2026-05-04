package Lesson10;
import Lesson8.*;

public class A {

    public static void main(String[] args) {
        Student st1 =new Student();
        st1.name= "Vanya";


    }

}

class B {

    public static void main(String[] args) {
        Student st2 = new Student("Hello", 4);
        System.out.println(st2.name);
        st2.showInfo();
    }



}