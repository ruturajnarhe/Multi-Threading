package threadMethods;

public class InterruptDemo extends Thread {
	
	public void run() {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Interrupted exception " + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptDemo th = new InterruptDemo();
		th.start();
		th.interrupt();
	}

}
