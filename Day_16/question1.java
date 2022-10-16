package Day_16;
import java.util.Scanner;

public class question1 {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India"))
            throw new InvalidCountryException();
        else
            System.out.println("User registration done successfully");


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        question1 registration = new question1();

        try {
            registration.registerUser("Mickey", "US");
            //registration.registerUser("Rahul", "India");
        } catch (InvalidCountryException e) {
            //System.out.println(e.getMessage());
        }
    }

}