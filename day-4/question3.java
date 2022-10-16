
import java.util.Scanner;

public class question3 {
    public static void main(String[] args){
        Course Mycourses = new Course();
        Mycourses.couseFee = 1000;
        Mycourses.courseId = 19;
        Mycourses.couseName = "Masai";

        Mycourses.displayCourseDet(Mycourses);
    }
}

class Course{
    int courseId;
    String couseName;
    int couseFee;

    void displayCourseDet(Course course){
        System.out.println("Course Name:"+course.couseName);
        System.out.println("Course ID:"+course.courseId);
        System.out.println("Course Fee:"+course.couseFee);
    }
}
