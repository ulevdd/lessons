package Lessons1;

public class BancAccount {

    int id;
   String name;
    double balance;

    void plus(double plusB) {
        balance += plusB;
        System.out.println("New zp: " + balance);
    }


    void minusB(double minusB) {
        balance -= minusB;
        System.out.println("Minus ZP: " + balance);

    }
}
    class account {
        String name;
        double bal;
    void account (String name, double balance) {
        this.name = name;
        bal = balance;
        System.out.println("Имя: " + name + " " + balance);
    }

    }

    class bank {

        double bank (BancAccount bA) {
            double summa = bA.balance*2;
            System.out.println(summa);
            return summa;


        }

    }


class BancAccountTest {
    public static void main(String[] args) {

        BancAccount MyAccount = new BancAccount();
        BancAccount YourAccount = new BancAccount();
        BancAccount HisAccount = new BancAccount();



        MyAccount.id=1;
        MyAccount.name="Dmitriy";
        MyAccount.balance=50;
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balance);
        MyAccount.plus(45.3);
        MyAccount.minusB(45.3);
        bank sum = new bank();
        sum.bank(MyAccount);



        System.out.println(" ");

        YourAccount.id=2;
        YourAccount.name="Vasya";
        YourAccount.balance=1000;
        System.out.println(YourAccount.name);
        System.out.println(YourAccount.balance);
        YourAccount.plus(45);
        YourAccount.minusB(50);
    }


}