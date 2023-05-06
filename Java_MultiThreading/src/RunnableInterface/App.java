package RunnableInterface;

import java.util.Random;

class MyCounter implements Runnable{
	private int threadNo;
	
	MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and the thread number is: " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) {
//		Thread t1 = new Thread(new MyCounter(1));
//		Thread t2 = new Thread(new MyCounter(2));
//		
//		t1.start();
//		t2.start();
//		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
			}
			
		}).start();

	}

}
