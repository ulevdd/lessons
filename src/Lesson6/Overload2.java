package Lesson6;

public class Overload2 {


    int summ (int i1, int i2){
        return i1 + i2;
    }

    String summ (String s1, String s2){
        return s1+s2;
    }

}


class Overload2Test {
    public static void main(String[] args) {

        Overload2 oV2 = new Overload2();
        int a= oV2.summ(5,6);
        String s = oV2.summ("Hi ", "Huy ");
        System.out.println(s+ a);


    }

}