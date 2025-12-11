package HomeWork;

public class Student {

    int id;
    String name= "Нет данных";
    String gorod= "Нет данных";
    String department= "Нет данных";
    double oc1;
    double oc2;
    double srOc;

     Student (int id1, String name1, String gorod1, String department1, double ocM, double ocA){
        id=id1;
        name=name1;
        gorod=gorod1;
        department=department1;
        oc1=ocA;
        oc2=ocM;


    }
    Student (int id2, String name2){
         this (id2,name2, "Нет", "Нет", 0,0);

    }
        Student (){
    }

        void showInfo (Student st){

            System.out.println("------");
            System.out.println("id: "+ id);
            System.out.println("Name: "+ name);
            System.out.println("Город: "+ gorod);
            System.out.println("Департамент: "+ department);
            System.out.println("Математика: "+ oc1);
            System.out.println("Английский: "+ oc2);
            System.out.println("Ср. оценка: "+ (oc1+oc2)/2);


        }


}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Dmitriy", "Tambov", "IT",3.4,5.0);
        Student st2 = new Student();
        Student st3 = new Student(3, "Kilya");
        Student st4 = new Student();
        st4.name="Loky";
        st4.oc1=4;
        st4.oc2=5;
        st2.id=2;
        st2.name="Igor";
        st2.oc1=12;
        st2.oc2=3;
        st1.showInfo(st1);
        st2.showInfo(st2);
        st3.showInfo(st3);
        st4.showInfo(st4);

    }

}
