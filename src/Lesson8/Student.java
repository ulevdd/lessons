package Lesson8;

public class Student {


    String name;
    int course;
    static int count;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Студент № " + count + " Создан");
    }

    public static void main(String[] args) {
        Student st1= new Student("Ivan", 2);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Alena", 2);
        System.out.println(st1.count);

    }

}
    class StudentTest {

    }


