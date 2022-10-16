package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<>();
        
        list.add(new Product(1 ,"pen" , 15 , 1));
        list.add(new Product(2 ,"pencil" , 10 , 2));
        list.add(new Product(1 ,"Rubber" , 5 , 3));
        list.add(new Product(1 ,"Sharpner" , 8 , 4));
        list.add(new Product(1 ,"Scale" , 20 , 5));
        list.add(new Product(1 ,"Compass" , 50 , 6));
        
        Collections.sort(list , (p1 , p2)-> p1.getPrice() > p2.getPrice() ? -1 : 1);
        
        list.forEach(System.out :: println);
    }

}
