package Lesson15;

public class Test7 {

    static void kasino (){

        int money=100;
        int a=10;
        System.out.println("Start: " + money + "$");
        System.out.println(" ");
        do {
            System.out.println("stavka " +a + "$");
            money=money-a;
            System.out.println("Lose");
            System.out.println(money+ "$");
            System.out.println("-----------------");
        }
        while (money>0);

    }
}
class tTest {

    public static void main(String[] args) {
        Test7.kasino();
    }


}