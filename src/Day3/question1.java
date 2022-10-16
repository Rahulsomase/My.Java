package Day3;


//Example-1
public interface question1 {

    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable extends question1{  
    void say(String msg);   // abstract method  
}  
 class FunctionalInterfaceExample3 implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}

 
//Example-2
 
 interface Square { 
     int calculate(int x); 
 } 
   
 class Test { 
     public static void main(String args[]) 
     { 
         int a = 5; 
   
         // lambda expression to define the calculate method 
         Square s = (int x) -> x * x; 
   
         // parameter passed and return type must be 
         // same as defined in the prototype 
         int ans = s.calculate(a); 
         System.out.println(ans); 
     } 
 }
 
//Example-3
 @FunctionalInterface
 interface Sample{
     // abstract method
     int calculate(int val);
 }
 // public class
class question{
     public static void main(String[] args){
         
         // implementing the abstract method of the interface
         Sample solution = (int val) -> val+51;
         
         // calling the method
         System.out.println("Ans = "+ solution.calculate(51));
     }
 }