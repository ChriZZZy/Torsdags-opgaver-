public class GasolineCar extends AFuelCar {

    private String fueltype = "gasoline";

    @Override
    public String getFuelType() {
        return fueltype = "gasoline";
    }

    public GasolineCar(int kmPrltr, String regnumber, String brand, String model, int doors) {
        super(kmPrltr, regnumber, brand, model, doors);
    }

    public int getRegistrationFee() {

        int kmPrLitre = getkmPrLitre();
        int fee = 0;

        if (kmPrLitre < 5) {
            fee = 10470;
        }
        if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            fee = 5500;
        }
        if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            fee = 2340;
        }
        if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            fee = 1050;
        }
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            fee = 330;
        }

        return fee;

    }


    public String toString() {
        return "Fueltype: " + fueltype + "," + " brand: " + brand + "," + " model: " + model + "," + " number of doors: " + numberOfDoors + "," + " registration number: " + registrationNumber + "\n";

    }
}
