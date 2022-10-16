package Day9;

public class que1 {
    public static void main(String[] args) {
        Bird b1=new Parrot();
        b1.fly();
        Parrot b=(Parrot)b1;
        b.sing();
    }

} class Bird{
    public void fly(){
        System.out. println("Bird is flying");
    }

}
class Parrot extends Bird{
    @Override
    public void fly(){
        System.out. println("I am Flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }
}



