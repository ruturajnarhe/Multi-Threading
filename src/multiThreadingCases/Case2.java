package multiThreadingCases;

// Performing single task from multiple thread

class MyThread2 extends Thread {
	public void run() {
		System.out.println("task 1");
	}
}

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 th = new MyThread2();
		th.start();
		
		MyThread2 th2 = new MyThread2();
		th2.start();
		
		MyThread2 th3 = new MyThread2();
		th3.start();
	}

}
