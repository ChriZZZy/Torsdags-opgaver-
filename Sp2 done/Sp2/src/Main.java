public class Main {

    public static void main(String[] args) {

    FleetOfCars fleet = new FleetOfCars();


    fleet.addCar(new DieselCar(20, "Ac43595", "Audi", "1", 4, true));
    fleet.addCar(new GasolineCar(4, "gf655832", "Ferarri", "2", 2));
    fleet.addCar(new ElectricCar( 82,470 ,162, "mb15393","tesla","3",4));

    fleet.printArray();


        System.out.println("the total registration fee for all the cars is " + fleet.getTotalRegistrationFeeForFleet() + " kr");


    }
}