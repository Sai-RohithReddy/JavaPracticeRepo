
public class JoinDemo {
	public int counter = 0;
	public static void main(String[] args) {
		JoinDemo app = new JoinDemo();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
			}
			
		});
		
		t1.start();
		t2.start();
		System.out.println("The value of counter: " + app.counter);
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The value of counter: " + app.counter);
	}
}
