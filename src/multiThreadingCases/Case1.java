package multiThreadingCases;

// Performing single task from single thread

class MyThread1 extends Thread {
	
	public void run() {
		System.out.println("task 1");
	}
}

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 th = new MyThread1();
		
		th.start();
	}

}
