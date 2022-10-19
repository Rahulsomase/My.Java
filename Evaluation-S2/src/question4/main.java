package question4;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Dhoni dhoni = new Dhoni();
        Kohli kohli = new Kohli();
        Rohit rohit = new Rohit();
        
        dhoni.setPriority(10);
        dhoni.start();
        kohli.start();
        
        
        synchronized (kohli) {
            
            kohli.wait();
        }
        System.out.println("");
        rohit.start();
        
    }
}
