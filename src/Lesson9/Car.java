package Lesson9;

public class Car {

    String color;
    String engine;
    static int count;
    static int pricce;

    Car (String color, String engine){

        count++;
        this.color= color;
        this.engine=engine;
    }

    public void showColor (){

        System.out.println("Цвет машины: " + color);
        System.out.println("Машина №: " + count);
    }
    public  void  changeColor (String color1){

        pricce = 5000;
        System.out.println("Цена до: "+ pricce);
        color=color1;
        System.out.println("Цвет измениелся: "+ color);
        pricce+=10000;
        System.out.println("Цена после: "+ pricce);
    }

    static void main() {
        Car c1 = new Car("Yellow", "v6");
        System.out.println(c1.color);
        System.out.println("");
        c1.changeColor("Red");
        c1.changeColor("blue");
        c1.showColor();
        Car c2 = new Car("asd", "dasd");
        c2.showColor();
        c2.changeColor("Red");
        c2.showColor();

    }
}
