package Task1;

public class Driver {

    private String Name;
    private int Age;



    public Driver (String Name, int Age){

        this.Name = Name;
        this.Age = Age;
    }


    @Override
    public String toString() {return "is driven by " + Name;}

}
