package synchronization;

class BookTheaterSeat2 {
	
	static int totalSeats = 20;
	
	static synchronized void bookSeat(int seats) {
		if(totalSeats >= seats) {
			System.out.println(seats + " Seats booked successfully");
			totalSeats = totalSeats - seats;
			System.out.println("Seats left " + totalSeats);
		} else {
			System.out.println("Seats cannot be booked");
			System.out.println("Seats left " + totalSeats);
		}
	}
}

class MyThread1 extends Thread {
	BookTheaterSeat2 b;
	int seats;
	MyThread1(BookTheaterSeat2 b1, int seats) {
		this.b = b1;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}

class MyThread2 extends Thread {
	BookTheaterSeat2 b;
	int seats;
	MyThread2(BookTheaterSeat2 b1, int seats) {
		this.b = b1;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}

public class StaticSyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTheaterSeat2 b1 = new BookTheaterSeat2();
		
		MyThread1 t1 = new MyThread1(b1, 7);
		t1.start();
		
		MyThread2 t2 = new MyThread2(b1, 6);
		t2.start();
		
		BookTheaterSeat2 b2 = new BookTheaterSeat2();
		
		MyThread1 t3 = new MyThread1(b2, 9);
		t3.start();
		
		MyThread2 t4 = new MyThread2(b2, 5);
		t4.start();
	}

}
