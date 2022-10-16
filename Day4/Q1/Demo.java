package Day4.Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
public static void main(String[] args) {
	List<product> list =new ArrayList<>() ;
	list.add(new product(9,"mobile",20000,50));
	list.add(new product(4,"laptop",600000,15));
	list.add(new product(2,"furniture",12000,8));
	list.add(new product(6,"camera",50000,11));
	list.add(new product(2,"tc",13000,2));
	
	List<product>filteredlist= list
			                     .stream()
			                     .filter( i -> i.getQuantity()>10)
			                     .collect(Collectors.toList());
	
Collections.sort(filteredlist, (a,b)-> a.getPrice()>b.getPrice()? 1 :-1);
System.out.println(filteredlist);
	  
}

}
