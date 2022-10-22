package Q3;
/*Q3/- Create two threads, one thread to display all even numbers between 1 & 20, another to
display odd numbers
between 1 & 20.
Note: Display all even numbers followed by odd numbers from the main method.
Hint: use join

 * */

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		A a= new A();
		Thread a1= new Thread(a);
		a1.start();
		a1.join();
		
		B b= new B();
		Thread b1= new Thread(b);
		b1.start();
	}
}
