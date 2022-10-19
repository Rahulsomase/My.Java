package question4;

public class Dhoni extends Thread {

    
    int num = 0;
    @Override
    public void run() {
        synchronized (this) {
            for(int i=0 ; i<=20 ; i++) {
                num +=i;
            }
            System.out.println("Dhoni" +" "+ num);
            this.notify();
        }
    }
}