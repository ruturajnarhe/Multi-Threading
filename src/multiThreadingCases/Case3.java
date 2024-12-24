package multiThreadingCases;

// Performing multiple task from multiple thread

class MyThread3 extends Thread {
	public void run() {
		System.out.println("Playing vidio");
	}
}

class MyThread4 extends Thread {
	public void run() {
		System.out.println("Playing music");
	}
}

class MyThread5 extends Thread {
	public void run() {
		System.out.println("Prograss bar is executing");
	}
}

public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 th = new MyThread3();
		th.start();
		
		MyThread4 th1 = new MyThread4();
		th1.start();
		
		MyThread5 th2 = new MyThread5();
		th2.start();
	}

}
