public abstract class ACar implements Car {


    protected String registrationNumber;
    protected String brand;
    protected String model;
    protected int numberOfDoors;
    protected int  registrationFee;

    public ACar(String regnumber, String brand, String model, int doors){
        registrationNumber = regnumber;
        this.brand = brand;
        this.model = model;
        numberOfDoors = doors;



    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public abstract int getRegistrationFee();


    public String toString() {
        return "brand: " + brand + " model: " + model + " number of doors: " + numberOfDoors + " registration number: " + registrationNumber + "\n";



    }
}
