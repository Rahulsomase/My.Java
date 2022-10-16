package Day8;
import java.io.*;

public class que5 {
    String name;
    int roll;
    String adds;
   int marks;
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    void input() throws IOException {
        System.out.print("Enter Student Name: ");
        name = br.readLine();
        System.out.print("Enter Roll Number: ");
        roll = Integer.parseInt(br.readLine());
        System.out.print("Enter Address: ");
        adds = br.readLine();
        System.out.print("Enter Marks: ");
        marks = Integer.parseInt(br.readLine());
    }
}
class Main extends que5 {
    void display() {
        System.out.print("\n**** Student Details ****\n" );
        System.out.print("\nStudent Name: " + name);
        System.out.print("\nRoll Number: " + roll);
        System.out.print("\nAddress: " + adds);
        System.out.print("\nMarks: " + marks);
    }
    public static void main(String args[]) throws IOException {
        Main c = new Main();
        c.input();
        c.display();
    }
}