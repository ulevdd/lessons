package Lessons1;

public class Car {
    String color;
    String engine;

    Car (String cvet, String motor){
        color=cvet;
        engine=motor;

        System.out.println("Цвет машины: "+ color);
        System.out.println("Мотор машины: "+ engine);
        System.out.println("--------------------------------");


    }

}
class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Черный", "V6");
        Car car2 = new Car("Белый", "V8");

    }

}