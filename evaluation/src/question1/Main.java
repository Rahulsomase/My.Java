package question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
 
    public static void main(String[] args) {
        
//    Predicate
       
        Predicate<Student> s2 = s-> s.getMarks() > 500;
        System.out.println(s2.test(new Student(12,"Rahul" , 600)));
     
//   Consumer
        

        
        Consumer<Student> c2 = st-> {
            System.out.println("Roll No :" + st.getRoll());
            System.out.println("Name :" + st.getName());
            System.out.println("Marks:" + st.getMarks());
        };
      c2.accept(new Student(10 , "rake" , 600));
      
//   Supplier  
      Supplier<Student> s1 = () -> new Student(11 , "pooja" , 200);
      System.out.println(s1.get());
      
//   function
      
      Function<String, Integer> f1 = t-> Integer.parseInt(t);
      
      Integer i = f1.apply("200");
      System.out.println(i);
      System.out.println();
      
       
    }
}
