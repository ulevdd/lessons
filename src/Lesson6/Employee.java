package Lesson6;

public class Employee {


        Employee (int id1, String surname1, int age1, double salary1, String department1){
            id=id1;
            surname=surname1;
            age=age1;
            salary=salary1;
            department=department1;
    }
        Employee (String surname2, int age2){
        this (0,surname2,age2,0.0, null);
    }
        Employee (int id3, String surname3, int age3){
           this (id3,surname3, age3, 0.0, null);
        }

    //Переменные
    int id;
    String surname;
    int age;
    double salary;
    String department= "Не определено";

    }

    class EmployeeTest {
        public static void main(String[] args) {
            Employee emp = new Employee(1, "Ulyev", 25, 453.4, "IT");
            Employee emp2 = new Employee("Ivanov", 30);
            Employee emp3 = new Employee(3,"Petrov", 33);
            Employee emp4 = new Employee(5,"ivan", 55);
            System.out.println(emp4.department);

            System.out.println(emp2.department);
        }


    }