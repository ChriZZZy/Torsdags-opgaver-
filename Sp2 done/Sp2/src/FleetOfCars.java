import java.util.ArrayList;

public class FleetOfCars {

    public ArrayList<Car> diffcars = new ArrayList<>();

    void addCar(Car car) {

        diffcars.add(car);
    }

    public void printArray() {
        for (Car c :
                diffcars) {
            System.out.println(c);
        }
    }

    @Override
    public String toString() {
        String output = "";

        for (Car c : diffcars) {

            output += c.toString();
        }
        return output;
    }

    int getTotalRegistrationFeeForFleet() {
        int fee = 0;
        for (Car c : diffcars) {

            fee += c.getRegistrationFee();
        }

        return fee;

    }
}
