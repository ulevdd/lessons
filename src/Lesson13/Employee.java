package Lesson13;

public class Employee {

    public static void main(String[] args) {

        switch ("voskr"){

            case "ponedelnik":
            case "vtornik":
            case "sreda":
                        System.out.printf("rabota do 18:00");
                        break;

             case "subbota":
                 case "voskr":
                        System.out.printf("vikhodnoy");
                break;

                default:
                System.out.printf("Error");
        }



        }


    }

