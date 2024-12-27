package threadMethods;

public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Ruturaj");
		System.out.println(Thread.currentThread().getName());
		
		
//		System.out.println(10/0);
	}

}
