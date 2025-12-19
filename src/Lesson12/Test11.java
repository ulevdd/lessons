package Lesson12;

public class Test11 {

    void abc (){

        String str;
        int a=10;
        if (a>=10){
            str="Privet";
        }
        if (a<10){
            str= "poka";
        }
        else {
            str=null;
        }

        System.out.println(str);
    }

    }
class Test11Test {

    public static void main(String[] args) {
      int a=10;
      int b=20;
      int max = (a>b) ? a:b;
        System.out.println(max);
    }
}

