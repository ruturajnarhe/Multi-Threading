package threadMethods;

// Join method real time example

class Medical extends Thread {
	public void run() {
		try {
			System.out.println("Medical start");
			Thread.sleep(3000);
			System.out.println("Medical complited");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread {
	public void run() {
		try {
			System.out.println("Test drive starts");
			Thread.sleep(5000);
			System.out.println("Test drive completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer takes the file");
			Thread.sleep(3000);
			System.out.println("Officer works completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenceDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Medical medical = new Medical();
		medical.start();
		medical.join();
		
		TestDrive td = new TestDrive();
		td.start();
		td.join();
		
		OfficerSign os = new OfficerSign();
		os.start();
	}

}
