import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<String>();

    public Student(String name, ArrayList<String> arr){
        super(name);

        passedCourses = arr;
    }



    @Override
    protected boolean addCourse(String course) {

     if(passedCourses.contains(course)){
         return false;
        } else{
         currentCourses.add(course);
         return true;
     }

    }

}
