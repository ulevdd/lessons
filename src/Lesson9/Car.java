package Lesson9;

public class Car {

    String color;
    String engine;
    static int count;


   public Car (String color, String engine){
        count++;
        this.color=color;
        this.engine=engine;
    }
    public void showColor (){

        System.out.println("Color: " + color);
    }

    public void changeColor (String color) {
        System.out.println(color);
    }

    public static void main(String[] args) {

        Car c = new Car("red", "v3");
        c.changeColor("black");
        System.out.println(c.color);

    }

}



