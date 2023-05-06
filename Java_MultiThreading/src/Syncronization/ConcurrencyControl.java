package Syncronization;

public class ConcurrencyControl {
	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					ConcurrencyControl.counter++;
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					ConcurrencyControl.counter++;
				}
			}
		});

		thread1.start();
		thread2.start();
		
		Thread.sleep(1000);
		System.out.println(ConcurrencyControl.counter);
	}

}
