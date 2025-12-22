package Lesson14;

public class Test3 {

    public static void main(String[] args) {
        FIRST: for (int i=1; i<30; i++ ){
            if (i%2==0){
                System.out.println("четное " +i);

            }
           continue FIRST;
        }
    }
}
