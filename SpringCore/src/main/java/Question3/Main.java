package Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext cnt = new ClassPathXmlApplicationContext("Beans.xml");
		
		Collage obj = (Collage) cnt.getBean("collage");
		
		obj.setStudent(1 , "Rahul " , 400 ).add(new Student(1 , "Rahul " , 400 ));
		
		
		System.out.println(obj.getStudent());
		
	}

}
