public class DieselCar extends AFuelCar {

    private String fueltype = "diesel";
    private boolean hasParticleFilter;

    @Override
    public String getFuelType() {
        return fueltype = "diesel";
    }

    public DieselCar(int kmPrltr, String regnumber, String brand, String model, int doors, boolean hasParticleFilter) {
        super(kmPrltr, regnumber, brand, model, doors);
        this.hasParticleFilter = hasParticleFilter;
    }

    Boolean hasParticleFilter() {

        return hasParticleFilter;
    }

    public int getRegistrationFee() {

        int kmPrLitre = getkmPrLitre();
        int fee = 0;

        if (kmPrLitre < 5) {
            fee = 10470 + 15260;
        }
        if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            fee = 5500 + 2770;
        }
        if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            fee = 2340 + 1850;
        }
        if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            fee = 1050 + 1390;
        }
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            fee = 330 + 130;
        }
        if (hasParticleFilter == false) {
            fee = kmPrLitre + 1000;
        }

        return fee;

    }

    @Override
    public String toString() {
        return "Fueltype: " + fueltype + "," + " brand: " + brand + "," + " model: " + model + "," + " number of doors: " + numberOfDoors + "," + " registration number: " + registrationNumber + "\n";


    }
}