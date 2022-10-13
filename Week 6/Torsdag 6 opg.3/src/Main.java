import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


     Student s1 = new Student("chris",new ArrayList<>(Arrays.asList("java01")));
     Student s2 = new Student("osman",new ArrayList<>(Arrays.asList("Funny")));
     Student s3 = new Student("jeppe",new ArrayList<>(Arrays.asList("Math")));

     Teacher t1 = new Teacher("martin", new ArrayList<>(Arrays.asList("java01")));
     Teacher t2 = new Teacher("morten",new ArrayList<>(Arrays.asList("Funny")));
     Teacher t3 = new Teacher("jesper",new ArrayList<>(Arrays.asList("Math")));

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);


        for (int i = 0; i < persons.size(); i++){
            boolean p = persons.get(i).addCourse("java01");
           if(!p){

               if(persons.get(i) instanceof Student) {
                   System.out.println(persons.get(i).getName() + " " + " har allrede bestået dette kursus");
               }else{
                       System.out.println(persons.get(i).getName() + " " + " kan ikke undervise i dette fag");
                   }
               }
           }
        }
    }



