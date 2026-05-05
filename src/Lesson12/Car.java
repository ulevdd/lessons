package Lesson12;

public class Car
{
    int engine;
    int doorCount;

    Car (int engine, int doorCount){

        this.engine=engine;
        this.doorCount=doorCount;
    }

}


class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car(5, 4);
        Car car2 =new Car(4,5);

        if (car1.engine>car2.engine){
            if (car1.doorCount>car2.doorCount){
                System.out.println("Мотор и дверей у первой больше");
            }
           else {
                System.out.println("Мотор у первой больше а дверей меньше");
            }

        }
        else {
            System.out.println("Мотор у первой меньше");
        }


    }





}