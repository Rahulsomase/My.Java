package Map;
import java.util.HashMap;
import java.util.Map;

public class question1 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, String> stateMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        stateMapping.put("Maharastra", "Mumbai");
        stateMapping.put("Karnatka", "Banglore");
        stateMapping.put("Kerala", "Chennai");
        stateMapping.put("Punjab", "Amritsar");
        stateMapping.put("Himachal Pradesh", "Shimla");


        System.out.println(stateMapping);
    }
}
