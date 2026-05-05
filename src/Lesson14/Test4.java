package Lesson14;

public class Test4 {

        public static void chasy () {

          OUTER:  for (int chas = 0; chas<=23; chas++){
               INER: for (int min=0; min<=59; min++){
                    System.out.println(chas+":"+min);

                }
                System.out.println("-----------");

                    if (chas==23){
                        continue OUTER;
                    }

            }

        }

    public static void main(String[] args) {
            chasy();
    }
}
