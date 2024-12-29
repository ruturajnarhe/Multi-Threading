package threadMethods;

public class IsInterruptedDemo extends Thread {
	
	public void run() {
		try {
			// isInterrupted() method is used to check whether a thread is interrupted or not
			// isInterrupted() method does not clear the interrupted status
			System.out.println(Thread.currentThread().isInterrupted());
			for(int i = 1; i<= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
				
				// isInterrupted() method will produce same result if called twice
				System.out.println(Thread.currentThread().isInterrupted());
			}
		} catch (Exception e) {
			System.out.println("Interrupted Exception " + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsInterruptedDemo th = new IsInterruptedDemo();
		th.start();
		th.interrupt();
	}

}
