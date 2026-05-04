package Lesson8.Home1;

public class Test1 {

    static final double pI=3.14;

    //////////////////////////////////////////////////////////////////////////1 задание
    public static int umnojenie (int a, int b, int c){
        int d= a*b*c;
        System.out.println(d);
        return d;
    }
    public static void delenie (int a, int b){
        int d;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        d=a/b;
        System.out.println("d: "+d);
        System.out.println("Ostatok: " + a%b);
    }
    //////////////////////////////////////////////////////////////////////////////1 задание

    public void ploshadKruga (int r){
        double ploshad = pI*r*r;
        System.out.println("Ploshad kruga: " + ploshad);

    }

    public static void dlina (int r) {
        double dlinaKruga = 2*pI*r;
        System.out.println("dlina kruga: " + dlinaKruga);
    }

    public void showInfo (int r){
        System.out.println("Radius: " + r);
        ploshadKruga(r);
        dlina(r);
    }


}

class Test1Test {

    public static void main(String[] args) {

        System.out.println("----1 Задание---- ");
        Test1.umnojenie(3,4,2);
        System.out.println("");
        Test1.delenie(15,12);
        System.out.println("");

        System.out.println("----2 Задание-----");
        Test1.dlina(5);
        Test1 pl = new Test1();
        pl.ploshadKruga(3);
        System.out.println("");
        pl.showInfo(7);



    }


}