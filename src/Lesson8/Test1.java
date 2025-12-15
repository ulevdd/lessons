package Lesson8;

public class Test1 {

    public final int a;

    Test1 (){
        a=10;
    }

    Test1 (boolean b){

        a=20;
    }

    public  void  abc (short s){
        byte b=10;
        System.out.println(s+ b);


    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.a);
        t1.abc((short) 5);

    }

}
