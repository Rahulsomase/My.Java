package question2;

public class MyThread  extends Thread{
    int n =1;
    
    @Override
    public void run() {
        synchronized (this) {
            
            for (int i=1 ; i<=10 ; i++) {
                n *=1;
            }
            this.notify();
        }
    }

}
