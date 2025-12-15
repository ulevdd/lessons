package Lesson7;

public class Employee {
    public double salary;

   public void dvoyZP (){

        System.out.println("Новая зп: "+ salary*2);
    }

    public Employee (double salary1) {
        salary = salary1;
    }

    public static void main(String[] args) {

       Employee emp = new Employee(44);
        System.out.println(emp.salary);
        emp.dvoyZP();
    }

}

class EmployeeTest{

    public static void main(String[] args) {

        Employee emp = new Employee(44);
        System.out.println(emp.salary);
        emp.dvoyZP();


}
    }
