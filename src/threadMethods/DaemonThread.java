package threadMethods;

public class DaemonThread extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we cannot create main thread as daemon thread
		System.out.println("main thread");
		
		DaemonThread th = new DaemonThread();
		
		// We have to create daemon thread before starting the thread, if we create daemon thread after starting it, it will throw run-time exception 
		th.setDaemon(true);
		th.start();
	}

}
