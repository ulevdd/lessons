package HomeWork;

public class Students {

   public String name;
    public String gorod;
    public int course;

    Students(String name, String gorod, int course) {
        this.name = name;
        this.gorod = gorod;
        this.course = course;
    }

    static void srav1(Students st1, Students st2) {

        if (st1.name.equals(st2.name) && st1.gorod.equals(st2.gorod) && st1.course == st2.course) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты разные");
        }

    }

    static  void srav2 (Students st1, Students st2){

            if (st1.name.equals(st2.name)){
                if (st1.gorod.equals(st2.gorod)){
                    if (st1.course==st2.course){
                        System.out.println("Полностью равны");
                    }
                    else {
                        System.out.println("Имя и город равны но курс разный");
                    }
                }
                else {
                    System.out.println("Имена одинаковы но город разные");
                }
            }

            else {
                System.out.println("Имена разные");
            }





    }
}
class StudentsTest {
    public static void main(String[] args) {
        Students s1 = new Students("Ivan", "Tambov", 4);
        Students s2 = new Students("Ivan", "Tambov", 4);
        Students s3 = new Students("Petr", "Tambov", 5);
        Students s4 = new Students("Ivan", "Tambov", 5);
        Students.srav1(s1, s2);
        Students.srav1(s1, s3);
        System.out.println("");
        Students.srav2(s1, s2);
        Students.srav2(s1, s3);
        Students.srav2(s1, s4);


    }
}

