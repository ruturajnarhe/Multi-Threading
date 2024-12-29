package synchronization;

class BookTheaterSeat {
	
	int totalSeats = 10;
	
	synchronized void bookSeat(int seats) {
		
		if(totalSeats >= seats) {
			System.out.println(seats + " Seats book successfully");
			totalSeats = totalSeats - seats;
			System.out.println("Seats left " + totalSeats);
		} else {
			System.out.println("Sorry seats cannot be booked...!!");
			System.out.println("Seats left " + totalSeats);
		}
	}
}

public class MovieBookApp extends Thread {
	
	static BookTheaterSeat b;
	int seats;
	
	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b = new BookTheaterSeat();
		
		MovieBookApp ruturaj = new MovieBookApp();
		ruturaj.seats = 7;
		ruturaj.start();
		
		MovieBookApp ravindra = new MovieBookApp();
		ravindra.seats = 6;
		ravindra.start();
	}

}
