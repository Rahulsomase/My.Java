package Day_11;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbber");
        int num= sc.nextInt();
        Test test=new Test();
        System.out.println(test.display(num));
    }
}
interface Intr{

    String display(int p);

}
class Test implements Intr{

    @Override
    public String display(int p) {
        String bag="";
        for(int i=2;i<=p;i++){
            if(i%2==0){
                bag+=i+" ";
            }
        }
        return bag;
    }
}
