package Day3;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {
    
public boolean test(Integer i) {
    return i>=0;
}
}
