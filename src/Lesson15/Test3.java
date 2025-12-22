package Lesson15;

public class Test3 {



    static void del (){
       boolean b=true;
       int a=1;
           start: while (b){
                System.out.println(a);

                if (a%3==0 && a%7==0){
                    b=false;
                }
               a++;
            }


    }

}
class testTest {

    public static void main(String[] args) {
        Test3.del();
    }

}