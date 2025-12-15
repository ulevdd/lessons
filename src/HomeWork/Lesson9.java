package HomeWork;

public class Lesson9 {

    int a=1;
    static  int b=19;


   static void abc (final int a){
        System.out.println(a);
        System.out.println(b);

    }


    public static void main(String[] args) {

        Lesson9 l1 = new Lesson9();
        l1.abc(3);
        abc(10);
        //System.out.println(Lesson9.b=12);
    }

}
