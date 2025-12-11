package HomeWork;

class SummaChisel {
    int a, b, c, d;
    int sCh;


    SummaChisel(int a1, int b1, int c1, int d1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        sCh = a + b+ c + d;

   }

    SummaChisel(int a2, int b2) {
        this(0, 0, a2, b2);
    }

    SummaChisel(int a3) {
        this(a3, 0, 0, 0);

    }
}
     class SummaTest {

         public static void main(String[] args) {

             SummaChisel sum = new SummaChisel(5,4);
             System.out.println(sum.sCh);
             SummaChisel sum1 = new SummaChisel(2,1,2,3);
             System.out.println(sum1.sCh);
             SummaChisel sum3 = new SummaChisel(5);
             System.out.println(sum3.sCh);

         }

     }


