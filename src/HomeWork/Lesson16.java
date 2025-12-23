package HomeWork;


public class Lesson16 {

     static void email (String text) {
         char t;
          int start=0;
          int end=0;
          int sr=0;
         poisk:
       /*  for (int i = 0; i < text.length(); i++) {
             t=text.charAt(i);
             if (t=='@'){
               start  =i+1; //
             }
             if (t=='.') {
                 end = i; //
                 System.out.println(text.substring(start, end));
             }
             }*/


            while (sr< text.length()) {
                start= text.indexOf('@', sr); //2
                if (start == -1) break ;
                    end = text.indexOf('.', start); //6
                    if (end == -1) break ;
                    System.out.println(text.substring((2+1),6));

                    sr = text.indexOf(';', sr); //9
                    if (sr==-1) break ;
                    sr++;
            }


         }
    public static void main(String[] args) {

        Lesson16.email("ya@spd.ru;");//10
    }
         }









