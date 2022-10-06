import java.util.ArrayList;

public class Student {

   private String name;

   private ArrayList<Course> courses = new ArrayList<Course>();

   public Student (String name){

      this.name = name;
}

  public void addCourse(Course course){

       courses.add(course);
  }
  public String toString(){
       return "Student:" + name + "is on the" + courses ;
  }
}
