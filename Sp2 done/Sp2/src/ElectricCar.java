public class ElectricCar extends ACar {
    private String fueltype = "diesel";
    private int getBatteryCapacityKWh;
    private int getMaxRangeKm;
    private int getWhPrKm;


    public ElectricCar(int capacitykwh, int maxkm, int whprkm, String regnumber, String brand, String model, int doors) {
        super(regnumber, brand, model, doors);

        getBatteryCapacityKWh = capacitykwh;
        getMaxRangeKm = maxkm;
        getWhPrKm = whprkm;
    }


    public int getBatteryCapacityKWh() {

      return getBatteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return 0;
    }

    public int getWhPrKm() {
        return 0;
    }

    public int getRegistrationFee() {

       double firstcalc = getWhPrKm / 91.25;
       int kmPrLitre = (int)(firstcalc/100);

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
       return  "Fueltype: " + fueltype+"," + " brand: " + brand+"," +  " model: " + model+"," + " number of doors: " + numberOfDoors+"," + " registration number: " + registrationNumber+"," +  " battery capacity:" + getBatteryCapacityKWh+"," + " Max km range: " + getMaxRangeKm+"," + " Watts pr.km: " + getWhPrKm + "\n";
    }
}
