package HomeWork;

public class Lessons15 {

    static void time (){

            int chas=0;

        chas: while (chas <24 ){

                int min=-1;

                minuta: do {
                    min++;
                    int sec=0;
                    sek: while (sec<60){
                        System.out.println(chas+ ":"+ min+ ":" + sec);
                        sec++;
                    }

                }
                while (min<59);

                chas++;

                        }


    }

}
class timeTest {

    public static void main(String[] args) {

        Lessons15.time();

    }

}