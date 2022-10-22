package Q4;


/*
 * Q4/- What is a Race condition, How will you solve the Race condition,explain with an
Example.

Ans:-  
 Java is a multi-threaded programming language and there is a higher risk to occur race conditions. Because the
same resource may be accessed by multiple threads at the same time and may change the data.
A race-condition is a condition in which the critical section (a part of the program where shared memory is accessed)
is concurrently executed by two or more threads. It leads to incorrect behavior of a program.
In layman terms, a race condition can be defined as, a condition in which two or more threads compete together to
get certain shared resources.
For example, if thread A is reading data from the linked list and another thread B is trying to delete the same data.
This process leads to a race condition that may result in run time error To solve the data inconsistency problem in java synchronized keyword is used.
So the thread-safety is achieved and race condition is avoided by the help of synchronized keyword.

 * */

public class Main {
	public static void main(String[] args) throws InterruptedException{
		Common c=new Common();
		//sharing same Common object to two thread
		ThreadA t1=new ThreadA(c,"Ram");
		
		ThreadB t2=new ThreadB(c,"Shyam");
		t1.start();
		t1.join();
		t2.start();
	}
	}


