package Lesson13;

public class Student {

    int grade;
    Student (int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {

        Student s1 = new Student(2);

        switch (s1.grade){
            case 2:
                System.out.println("Dvoechnik"); break;
            case 3:
                System.out.println("Troechnik"); break;
            case 4:
                System.out.println("Horoshitst"); break;
            case 5:
                System.out.println("Otlichnik");break;
            default:
                System.out.println("Error");
        }
    }
}
