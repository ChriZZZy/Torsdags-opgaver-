package Task2;

import java.util.ArrayList;

public class Building {

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    private final ArrayList<Room> rooms;

    private int numberOfBathrooms;

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isOfficebuilding() {
        return isOfficebuilding;
    }

    public void setOfficebuilding(boolean officebuilding) {
        isOfficebuilding = officebuilding;
    }

    private int numberOfFloors;
    private boolean isOfficebuilding;


    public Building (ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficebuilding){

        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;


    }


}
