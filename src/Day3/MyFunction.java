package Day3;
import day1.Student;
import java.util.function.Function;

public class MyFunction implements Function<Student , String> {

    public String apply(Student s) {
        
//        if(s.getMarks() > 500)
//            return "Pass";
//        else
//            return "Fail";
        
        return s.getMarks() >500 ? "pass" : "Fail";
        }
}
