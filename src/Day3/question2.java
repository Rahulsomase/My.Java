package Day3;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import day1.Student;


public class question2 {
    
    public static void main(String[] args) {
        
//  Predicate  
        Predicate<Integer> p1= new MyPredicate();
        System.out.println(p1.test(600));
        
        
        Predicate<Integer> p2 = (Integer i)->{
            return i >=0;
        };
        
//  Consumer
        
        Consumer<String> c1=new MyConsumer();
        c1.accept("Rahul");
        
        Consumer<String> c2 = s-> System.out.println("hii" + s);
    
//  Supplier
        Supplier<String> s2 = () -> "Message from LE" ;
    System.out.println(s2.get());
    
    
//  Function
    
    Function<Student , String> f1 = new MyFunction();
    
    String res = f1.apply(new Student(10 , "Shivani" , "Bihar" , 300));
    
    System.out.println(res);
    
    
    Function<Student , String> f2 =  s -> s.getMarks() >500 ? "pass" : "fail";
    
    
    
   
    }
}
