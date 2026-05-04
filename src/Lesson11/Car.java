package Lesson11;

public class Car {




    String color;
    String engine;
    int door;

    Car (String color, String engine, int door){
        this.color=color;
        this.engine=engine;
        this.door= door;
    }
}
class CarTest {
    static void changeDoor (Car c1, int d1){

        System.out.println("Было дверей: " + c1.door);
        c1.door=d1;
        System.out.println("Стало: " + c1.door);
    }

    static void swapColor (Car c1, Car c2){
        String c3 = c1.color;
        c1.color=c2.color;
        c2.color=c3;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "V3",3);
        Car c2 = new Car("White", "V2", 5);
        changeDoor(c1,7);
        swapColor(c1,c2);
        System.out.println("");
        System.out.println(c1.color);
        System.out.println(c2.color);



    }

}