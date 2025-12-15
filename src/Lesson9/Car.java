package Lesson9;

public class Car {

    String color;
    String engine;
    static int count;


    Car (String color, String engine){

        count++;
        this.color= color;
        this.engine=engine;
    }

    public void showColor (){

        System.out.println("Цвет машины: " + color);
    }
    public  void  changeColor (String color1){
        System.out.println("Цвет измениелся: ");
        int price = 5000;
        color=color1;
        price+=1000;
    }
}
