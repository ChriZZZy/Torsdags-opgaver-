package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static Customer c1 = new Customer("Egon", "Olsen", "Eolsen1337");
    public static Customer c2 = new Customer("Kjeld","Jensen", "Kjesen");
    public static Customer c3 = new Customer("Benny", "Hansen", "Låsesmeden");
    public static Customer c4 = new Customer("Yvonne","Jensen", "Yvonne");
    public static Customer c5 = new Customer("Anders", "Samuelsen", "Samuelsen er sej");
    public static Customer c6 = new Customer("Søren", "Pape", "Søren4tw");
    public static ArrayList<Customer>customers;


    public static void main(String[] args) {

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        printCustomers(customers);

    }

    public static void printCustomers(Customer customers){

        for (Customer c: customers) {

            System.out.println(c);

        }

    }
}
