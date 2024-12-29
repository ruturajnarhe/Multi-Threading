package threadMethods;

public class InterruptedDemo extends Thread {
	
	public void run() {
		try {
			
			// interrupted method is used to check whether a thread is interrupted or not
			// interrupted() method clears the interrupted status from true to false if thread is interrupted
			System.out.println(Thread.interrupted()); // true -> false
			
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				
				Thread.sleep(2000);
				
				// interrupted() method will change the result when if called twice
				System.out.println(Thread.interrupted());
			}
		} catch (Exception e) {
			System.out.println("Interrupted Exception" + e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedDemo th = new InterruptedDemo();
		th.start();
		th.interrupt();
	}

}
