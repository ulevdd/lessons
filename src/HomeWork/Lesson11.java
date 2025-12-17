package HomeWork;



class Car {

    public String color;
    public String engine;
    public int dor;


    Car(String color, String engine, int dor) {
        this.color = color;
        this.engine = engine;
        this.dor = dor;
    }
}
    class CarTest1 {

        static void changeDor(Car dor1, int d) {
            dor1.dor=d;
        }

        static void chageColor(Car c1, Car c2) {
            String c3;
            c3 = c1.color;
            c1.color = c2.color;
            c2.color = c3;

        }


        public static void main(String[] args) {
            Car car1 = new Car("Red", "v3", 2);
            Car car2 = new Car("White", "v6", 4);
            System.out.println("Искомое: " +car1.color + " " + car1.dor);
            System.out.println("Искомое: " + car2.color + " " + car2.dor);
            chageColor(car1,car2);
            changeDor(car1, 5);
            changeDor(car2, 7);
            System.out.println(" ");
            System.out.println("New цвет №1: " + car1.color + " " + car1.dor);
            System.out.println("New цвет №2: " + car2.color + " " +  car2.dor);

        }
        }


