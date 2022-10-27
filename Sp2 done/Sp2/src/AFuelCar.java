public abstract class AFuelCar extends ACar {


    public AFuelCar(int kmPrltr, String regnumber, String brand, String model, int doors) {
        super(regnumber, brand, model, doors);
    }

    public int kmPrltr;

    public int getkmPrLitre() {
        return kmPrltr;
    }

    abstract String getFuelType();


}
