package Lesson8;

public class Car {

    String color= "blue";
    String engine ="V6";



}


class Human {

    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c= new Car();
        h1.c.color="red";
        h1.name = "dmitriy";
        System.out.println(h1.c.color);
    }

}