package Overriding;
import java .util.Scanner;
import java.util.logging.SocketHandler;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();

        if(amount>1000){
            System.out.println("Welcome to Taj hotel");
        }else if(amount>200){
            System.out.println("Road side hotel");

        }else{
            System.out.println("Please enter valid number");
        }
    }


    class hotel{

    }
    class Tajhotel extends hotel{
        void Tajhotel(){
            System.out.println("Welcome to Taj hotel");
        }
    }
    class road_side_hotel extends hotel {
        void road_side_hotel() {
            System.out.println("Road side hotel");
        }
    }
}
