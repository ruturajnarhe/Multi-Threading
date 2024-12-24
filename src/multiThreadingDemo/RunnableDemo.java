package multiThreadingDemo;

// implements the Runnable interface
public class RunnableDemo implements Runnable {
	
	// Override the run() method
	public void run() {
		System.out.println("Thread task 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object of class
		RunnableDemo rd = new RunnableDemo();
		
		// create an object of thread class & pass the parameter in constructor
		Thread th = new Thread(rd);
		
		// start the thread
		th.start();
	}

}
