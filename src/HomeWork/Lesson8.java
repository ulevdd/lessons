package HomeWork;

public class Lesson8 {

    final static double pi=3.14;
   static double radius;

    //Первое задание
    static int umnojenit(int a, int b, int c) {

        int umn = a * b * c;
        System.out.println("Множитель трех: " +umn);
        return umn;

    }

    static void delit(int a, int b) {

        int c = a / b;
        System.out.println("Диление чисел: "+a + " и "+ b + " = " +c + "," + " Остаток: " + a % b);
    }

    //Второе задание

      Lesson8 (double r){
        radius=r;
      }

    //Площадь круга
    double ploshad (){
        double pl= pi*(radius*radius);
      /*  System.out.println("Радиус круга: "+ r);
        System.out.println("Площадь круга: "+ pl);*/
        return pl;
    }
    //длина
    static  void  dlina (){
        double dl= 2*pi* radius;
        System.out.println("Длина: " + dl);

               }

    public void showInfo() {


        System.out.println("Радиус: "+ radius);
        System.out.println("Площадь: "+ ploshad());
        dlina();
    }
}


class Lesson8Test {

    public static void main(String[] args) {

        Lesson8 p1 = new Lesson8(7);
        p1.showInfo();

        System.out.println("--------------------------------");

        Lesson8.umnojenit(5,3,5);
        Lesson8.delit(19,4);



    }



}