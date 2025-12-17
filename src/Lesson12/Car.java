package Lesson12;

public class Car {

    int engine;
    int dorCount;

    Car (int engine, int dorCount){
        this.engine=engine;
        this.dorCount=dorCount;
    }

}

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car(10, 3);
        Car car2 = new Car(6, 5);

        if (car1.engine > car2.engine) {
            if (car1.dorCount > car2.dorCount) {
                System.out.println("Мощность мотора у 1 меньше но дверей больше");
            } else {
                System.out.println("мотор больше но  дверей меньше");
            }
        }
            else{
                System.out.println("Мотор меньше");
            }


        }
    }



