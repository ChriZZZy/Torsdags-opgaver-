import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please type your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("please type your age");
        int age = scan.nextInt();
        System.out.println(age);
        int retirement = 67 - age;
        System.out.println("you will retire in " + retirement + " years");


    }
}
