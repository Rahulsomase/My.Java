package question1;

public class deadlockExample {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		 
		ThreadDemo1  T1 = new ThreadDemo1();
		ThreadDemo2  T2 = new ThreadDemo2();
		
		T1.run();
		T2.run();
		
	}
	public static class ThreadDemo1  extends deadlockExample {
		public void run() {
			synchronized (Lock1) {
				System.out.println("having Lock1");
				
				try { Thread.sleep(5);}
				catch (InterruptedException e) {}
				System.out.println("Lock2 waiting");
				
				synchronized (Lock2) {
					System.out.println(" having Lock1 and Lock2");
				
			}
		}
	  }
	}
		public static class ThreadDemo2  extends deadlockExample {
			public void run() {
				synchronized (Lock2) {
					System.out.println("having Lock2");
					
					try { Thread.sleep(5);}
					catch (InterruptedException e) {}
					System.out.println("Lock1 waiting");
					
					synchronized (Lock1) {
						System.out.println(" having Lock1 and Lock2");
					
				}
			  }
           }
		}
	}
	
