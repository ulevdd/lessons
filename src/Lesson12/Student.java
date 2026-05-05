package Lesson12;

public class Student {

  public   String name;
    public int course;
    public double grade;

  public   Student (String name, int course, double grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }

    static void sravnenuSt (Student s1, Student s2){

                if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade){
                    System.out.println("Студенты равны");
                }
            else {
                    System.out.println("Студенты разные");
                }
    }

     static void sraV (Student s1, Student s2){

                if (s1.name.equals(s2.name)) {
                    if (s1.course == s2.course) {
                        if (s1.grade == s2.grade) {
                            System.out.println("Студенты полностью равны");
                        } else {
                            System.out.println("Имя и курс ранвы, грейд разные");
                        }
                    } else {
                        System.out.println("Имя равны, курсы разные");
                    }
                }
                    else {
                        System.out.println("Имена разные");
                    }
    }

}


class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student("Egor", 4,3);
        Student st2 = new Student("Egor", 4,3);
        Student.sravnenuSt(st1,st2);

        Student.sraV(st1,st2);

    }

}