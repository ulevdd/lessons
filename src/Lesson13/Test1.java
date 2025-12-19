package Lesson13;

import HomeWork.Students;

public class Test1 {

}


class Student {

    int grade;


    Student (int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {

        Student st1 = new Student(4);
      /*
        if (st1.grade==2){
            System.out.println("Студент двоечник");
        }
        else if (st1.grade==3){
            System.out.println("Студент троечник");
        }
        else if (st1.grade==4){
            System.out.printf("Хорошист");
        }
    }*/

        switch (st1.grade){
            case 2:
                System.out.printf("Студент двоечник");
                break;
            case 3:
                System.out.printf("Троечник");
            break;
            case 4:
                System.out.printf("Хорошист");
                break;
            case 5:
                System.out.printf("Отличник");
                break;
            default:
                System.out.printf("Other");
        }

    }


}