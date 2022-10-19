package question4;

public class Rohit extends Thread {

    int num = 1;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Rohit");
            for(int i=1 ; i<=10 ; i++) {
                num *=i;
            }
            System.out.println(num);
            this.notify();
        }
    }
}
