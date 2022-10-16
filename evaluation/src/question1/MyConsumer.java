package question1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

    @Override
    public void accept(Student st) {
        // TODO Auto-generated method stub
        System.out.println("Roll No :" + st.getRoll());
        System.out.println("Name :" + st.getName());
        System.out.println("Marks:" + st.getMarks());
    }
    
    
    

}
