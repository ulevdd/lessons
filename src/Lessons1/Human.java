package Lessons1;


public class Human {

    String name;
    Car3 car;
    BancAcc bA;

    void info () {

        System.out.println("name: "+ name+ " | cvet car: "+ car.color + " | Balance: "+ bA.balance);


    }
}

class HumanTest {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.name= "dmitriy";
        h1.car = new Car3("Red", "V3");
        h1.bA= new BancAcc(1, 4.34);
        h1.info();

    }


}



class Car3 {
    String color;
    String engine;

    Car3  (String c, String e) {
        color=c;
        engine=e;
    }


}

class BancAcc {
    int id;
    double balance;

    BancAcc (int id2, double balance1){
        id=id2;
        balance=balance1;
    }


}