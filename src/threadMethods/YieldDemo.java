package threadMethods;


public class YieldDemo extends Thread {
	
	public void run() {
//		Thread.yield();
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldDemo th = new YieldDemo();
		
		th.start();
		
//		Thread.yield();
		for(int i = 1; i <= 5; i++) {
			System.out.println("main thread " + i);
		}
	}

}
