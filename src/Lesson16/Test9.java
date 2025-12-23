package Lesson16;

public class Test9 {

    /*"Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала:" +
                "Ты лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало";*/

    static void changeT (String text){

        String t2=text.toUpperCase();
        char a;
        char b;

           search: for (int i=0; i<text.length(); i++){
                a=text.charAt(i);
                b=t2.charAt(i);

                if (a!= ',' && a!=' ' && a!= ':' && a!= '.' && a==b ){

                    System.out.println("");
                    System.out.print(a);
                    continue search;
                }
               System.out.print(a);
            }

    }

    public static void main(String[] args) {
        changeT("Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала:" +
                "Ты лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало");
        System.out.println(" ");
    }
}


