package question5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class main {

    public static void  main(String[] args) throws Exception  , IOException{
        // TODO Auto-generated method stub
//        System.out.println("hi");
        
        FileInputStream fileiptstm = new FileInputStream("studentdata.txt");
        
        ObjectInputStream objiptstm = new  ObjectInputStream(fileiptstm);
        
        Object obj = objiptstm.readObject();
        
        @SuppressWarnings("unchecked")
        List<Student> students  = (List<Student>)obj;
        
        students.forEach(s ->{
            System.out.println(s);
        });
    }
}
