package question5;

import java.io.File;
import java.io.IOException;

public class demo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        File f = new File("studentdata.txt");
     
        
     try {
         f.createNewFile();
         
     }catch(IOException e) {
         e.printStackTrace();
     }
     System.out.println(f.exists());
    }

}
