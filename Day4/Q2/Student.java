package Day4.Q2;

import java.util.List;
import java.util.stream.Collector;

public class Student {
private int id;
private String name;
private int marks ;


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


public Student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getMarks() {
	return marks;
}


public void setMarks(int marks) {
	this.marks = marks;
}


public List<Student> collect(Collector<Object, ?, List<Object>> list) {
	// TODO Auto-generated method stub
	return null;
}


}
