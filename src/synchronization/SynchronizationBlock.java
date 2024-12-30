package synchronization;

class BookTheaterSeat1 {
	
	int totalSeats = 10;
	
	void bookSeat(int seats) {
		
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		
		synchronized(this) {
			if(totalSeats >= seats) {
				System.out.println(seats + " Seats book successfully");
				totalSeats = totalSeats - seats;
				System.out.println("Seats left " + totalSeats);
			} else {
				System.out.println("Sorry seats cannot be booked...!!");
				System.out.println("Seats left " + totalSeats);
			}
		}
		
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
		System.out.println("Hii" + Thread.currentThread().getName());
	}
}

public class SynchronizationBlock extends Thread {
	
	static BookTheaterSeat1 b;
	int seats;
	
	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b = new BookTheaterSeat1();
		
		SynchronizationBlock ruturaj = new SynchronizationBlock();
		ruturaj.seats = 7;
		ruturaj.start();
		
		SynchronizationBlock ravindra = new SynchronizationBlock();
		ravindra.seats = 6;
		ravindra.start();
	}

}
