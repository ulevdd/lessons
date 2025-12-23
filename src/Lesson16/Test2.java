package Lesson16;

public class Test2 {

}
class Employee {

    String name;
    double salary;
    boolean isManager;


    Employee(String name, double salary, boolean isManager){

        this.name=name;
        this.salary=salary;
        this.isManager=isManager;
    }

   public static void showInfo (Employee n){

        String b="Менеджер";
        String c="non";
        if (n.isManager==true){
            System.out.println("Имя: "+ n.name);
            System.out.println("Зарплата: "+ n.salary);
            System.out.println(b);
            System.out.println("");
        }
            else {
            System.out.println("Имя: "+ n.name);
            System.out.println("Зарплата: "+ n.salary);
            System.out.println(c);
            System.out.println("");
        }
    }

    static void main() {
        Employee m1 = new Employee("Dmitriy", 445.4, true);
        showInfo(m1);
        Employee m2 = new Employee("Ivan", 412, false);
        showInfo(m2);
        Employee m3 = new Employee("Leha", 42, true);
        showInfo(m3);
    }
}
