package threadMethods;

public class SleepDemo2 extends Thread {
	
	public void run() {
		for(int i = 1; i<= 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepDemo2 th = new SleepDemo2();
		
		th.start();
	}

}
