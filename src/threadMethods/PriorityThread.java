package threadMethods;

public class PriorityThread extends Thread {
	
	public void run() {
		System.out.println("child thread");
		System.out.println("child thread priority : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread old priority : " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main thread new priority : " + Thread.currentThread().getPriority());
		
		PriorityThread th = new PriorityThread();
		th.start();
	}

}


// JVM provides the priorities to each thread & according to those priorities JVM allocates the processor
// Priorities are represented in the  form of integer value which ranges from 1-10
// Priorities are inherited from parent thread
// By default main thread priority is 5
// Priorities depends on the platform 
// Windows does not support priorities