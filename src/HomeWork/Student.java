package HomeWork;

public class Student {

    int id;
    String name;
    String gorod;
    String department;

     Student (int id1, String name1, String gorod1, String department1){
        id=id1;
        name=name1;
        gorod=gorod1;
        department=department1;

         System.out.println("------");
         System.out.println("id: "+ id);
         System.out.println("Name: "+ name);
         System.out.println("Город: "+ gorod);
         System.out.println("Департамент: "+ department);
    }
    Student (int id2, String name2){
         this (id2,name2,"Не определено", "Не определено");
    }
    Student (){
         this (0,"Нет","Нет","Нет");
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Dmitriy", "Tambov", "IT");
        Student st2 = new Student(2,"Kolya");
        Student st3 = new Student();
    }

}
