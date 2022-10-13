package Task1;

public class Main {

    public static void main(String[] args) {
        Driver d1 = new Driver("Chris",22);

        Car c1 = new Car("Ferrari","Enzo", 22, "Sport");

        c1.setDriver(d1);

        System.out.println(c1.toString());
        System.out.println(d1.toString());




    }

}
