package question5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        List<Student> students = new ArrayList<>();
        
        students.add(new Student(10 , "rahul" , 300 , "Rahul@3" , "ras" ,"abd" ));
        students.add(new Student(12 , "rahul2" , 400 , "Rahul@3" , "ras" ,"abd" ));
        students.add(new Student(14 , "rahul3" , 500 , "Rahul@3" , "ras" ,"abd" ));
        students.add(new Student(17 , "rahul4" , 600 , "Rahul@3" , "ras" ,"abd" ));
        students.add(new Student(20 , "rahul5" , 700 , "Rahul@3" , "ras" ,"abd" ));
        
        try (ObjectOutputStream oos = new   ObjectOutputStream (new FileOutputStream("studentdata.txt"))) {
            oos.writeObject(students);
      }
        
     System.out.println("Added..");
    }

}
