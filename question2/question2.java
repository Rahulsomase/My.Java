package question2;

public class question2 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
  MyThread num = new MyThread();
  num.start();
  synchronized (num) {
    
      num.wait();
      System.out.println(num.n);
      }
    }
}
