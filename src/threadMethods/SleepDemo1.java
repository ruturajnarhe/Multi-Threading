package threadMethods;

public class SleepDemo1 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
	}

}
