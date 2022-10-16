package Day4.Q4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import Day4.Q2.Student;

public class Q4 {
/**
 * @param args
 */
public static void main(String[] args) {
	Set<Student> set = new HashSet<>();
	set.add(new Student(10, "N1",500));
	set.add(new Student(12, "N2",400));
	set.add(new Student(13, "N3",420));
	set.add(new Student(14, "N4",440));
	set.add(new Student(15, "N5",600));
	set.add(new Student(16, "N6",380));
	

	Set<Student> filteredList= set
				.stream()
				.filter(s -> s.getMarks() < 500).collect(Collectors.toSet());
	
	for (Student i : filteredList) {
		System.out.println(i);
	}
}
}
