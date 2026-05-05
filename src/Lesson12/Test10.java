package Lesson12;

public class Test10 {

    void maximum (int i1, int i2, int i3) {

        if (i1 > i2 && i1 > i3) {
            System.out.println("Max: " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Max: " + i2);
        } else {
            System.out.println("Max: " + i3);
        }

    }



    public static void main(String[] args) {

        Test10 t1 = new Test10();
        t1.maximum(10,7,9);

    }

}
