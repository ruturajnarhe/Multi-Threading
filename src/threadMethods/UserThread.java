package threadMethods;

public class UserThread extends Thread {
	
	public void run() {
		
		System.out.println("thread task : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello : " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
		UserThread th = new UserThread();
		th.setName("Ruturaj");
		th.start();
		System.out.println(th.isAlive());
	}

}
