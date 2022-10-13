package Task2;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {

        Room r1 = new Room(3, 2, 4);
        Room r2 = new Room(1,2,2);
        Room r3 = new Room(5,7,8);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building hotel = new Building(rooms, 3, 5, false);


        System.out.println( countLampsInBuilding(hotel));

    }

     public static int countLampsInBuilding(Building hotel){
         int lampsinroom = 0;

         for (Room r: hotel.getRooms() ) {
             System.out.println(r.getNumberOfLamps());
             lampsinroom += r.getNumberOfLamps();
         }

         return lampsinroom ;


     }

}
