package question4;

public class Kohli extends Thread {

  
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Kohli");
            for(int i=0 ; i<=10 ; i++) {
                System.out.println(i + " ");
            }
            this.notify();
        }
    }
}
