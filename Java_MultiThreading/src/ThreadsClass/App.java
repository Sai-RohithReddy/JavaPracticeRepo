package ThreadsClass;

class MyCounter extends Thread{
	private int threadNo;
	
	MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for (int i = 1; i <= 10; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and the thread number is: " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
//		long startTime1 = System.currentTimeMillis();
//		counter1.countMe();
//		System.out.println("*********************");
//		counter2.countMe();
//		long endTime1 = System.currentTimeMillis();
//		System.out.println("Total time required to process is: " + (endTime1 - startTime1));
//		
//		System.out.println("*********************");
		
		long startTime2 = System.currentTimeMillis();
		counter1.start();
		System.out.println("*********************");
		counter2.start();
		try {
			Thread.sleep(5505);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Total time required to process is: " + (endTime2 - startTime2));

	}

}
