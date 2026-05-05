package Lesson13;

public class Employee {

        String emp;
        Employee (String emp){
            this.emp=emp;

        }


   static void week (Employee emp1){
        switch (emp1.emp) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Работа до 18:00");
                break;
            case "Суббота":
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Error");

        }


    }


    public static void main(String[] args) {


        Employee emp1 = new Employee("Понедельник");
        week(emp1);
        Employee emp2 = new Employee("Воскресенье");
        week(emp2);



    /*    switch ("Суббота") {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Работа до 18:00");

            case "Суббота":
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Error");

        }*/

    }

}
