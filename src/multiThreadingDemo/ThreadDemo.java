package multiThreadingDemo;

// Extends the thread class
public class ThreadDemo extends Thread {
	
	// Override the run() method
	public void run() {
		// thread task
		System.out.println("Thread task");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of class
		ThreadDemo th = new ThreadDemo();
		
		// start the thread
		th.start();
		
		
//		th.start();
	}

}
