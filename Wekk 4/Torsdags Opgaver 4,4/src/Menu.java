import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> options = new ArrayList<>();


    public Menu (ArrayList<String> actions){
      options = actions;
    }

    public String showMenu(){
        System.out.println("Type a number to choose an option");
        for (int i = 0; i > options.size();i++){
            System.out.println(options.get(i));
        }
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;
    }
}
