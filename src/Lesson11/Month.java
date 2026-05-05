package Lesson11;

public class Month {

    static void mesyac (int i){
        switch (i){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Колиечство дней: 31");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Количество дней: 30");
            case 12:
                System.out.println("Количество дней: 1");
        }

    }

    public static void main(String[] args) {
        mesyac(1);
    }
}
