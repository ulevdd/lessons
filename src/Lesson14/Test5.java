package Lesson14;

public class Test5 {


    static void time () {


        chas: for (int i=0; i<24; i++ ){
            if (i==6){
                break chas;
            }
            min: for (int j=0; j<60; j++){
                if (j==25){
                 continue chas;
                }
                System.out.println(i + ":" +j);
            }

        }
    }

}
class timeTest {
    public static void main(String[] args) {

        Test5.time();

    }


}

