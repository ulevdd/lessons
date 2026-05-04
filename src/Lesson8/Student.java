package Lesson8;

public class Student {

    public String name;
    int course;
    static int count;
    int a;


    public Student (String name, int course){
        count++;
        this.name=name;
        this.course = course;
        System.out.println("Студент #" + count + " создан");
    }

    public Student () {

    }

    public  static  void showCount () {
        System.out.println(count);
    }

    public void showInfo (){
        System.out.println("Hello2");
    }

    void abc (){

        a++;


    }

}
class StudentTest {
    public static void main(String[] args) {


    }

}