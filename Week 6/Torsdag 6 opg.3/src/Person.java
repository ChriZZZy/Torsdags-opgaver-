public class Person {

    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){

        this.name = name;

    }


    protected boolean addCourse(String course){

        return true;
    }
}
