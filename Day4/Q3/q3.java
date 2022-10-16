package Day4.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(5);
	list.add(2);
	list.add(8);
	list.add(6);
	list.add(9);
	list.add(12);
	
List<Integer>square=	 list.stream().map(s -> s*s).collect(Collectors.toList());
for (Integer i : list) {
System.out.println(i);	
}
for (Integer i : square) {
	System.out.println(i);
}
}
}
