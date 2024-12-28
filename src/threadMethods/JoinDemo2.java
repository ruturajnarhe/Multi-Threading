package threadMethods;

public class JoinDemo2 extends Thread{ 
	
	static Thread mainthread;
	public void run() {
		try {
			mainthread.join();
			for(int i = 0; i <= 5; i++) {
				System.out.println("child thread - " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainthread = Thread.currentThread();
		
		JoinDemo2 th = new JoinDemo2();
		th.start();
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println("main thread - " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
