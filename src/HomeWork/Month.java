package HomeWork;

public class Month {


   static void MonthDay(int d) {

        switch (d) {

            case 1:
            case 5:
            case 3:
            case 7:
            case 8:
                System.out.println("Количество дней: 31");
                break;
            case 2:
                System.out.println("Количество дней: 28");
                break;

            case 4:
            case 6:
                System.out.println("Количество дней: 30");
                break;
            default:
                System.out.printf("Error");
        }
    }
}
    class MonthTest {

        public static void main(String[] args) {

            Month.MonthDay(2);
            Month.MonthDay(1);
            Month.MonthDay(6);

        }

    }



