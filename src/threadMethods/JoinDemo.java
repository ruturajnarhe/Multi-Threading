package threadMethods;

public class JoinDemo extends Thread{
	
	public void run() {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println("child thread - " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JoinDemo th = new JoinDemo();
		th.start();
		th.join();
		
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println("main thread - " + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
