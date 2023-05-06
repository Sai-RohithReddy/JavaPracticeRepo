
public class InterruptDemo {
	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("Waiting for valance updaion");
					wait();
				} catch (InterruptedException e) {
					System.out.println("Thread got interrupted");
					return;
				}
			}
			balance -= amount;
			System.out.println("Withdrawal successful and the current balance is: " + balance);
		}
	}
	public static void main(String[] args) {
		InterruptDemo a = new InterruptDemo();
		Thread t1 = new Thread (new Runnable() {

			@Override
			public void run() {
				a.withdraw(1000);
			}
			
		});
		t1.start();
		if (balance <= 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t1.interrupt();
		}		
	}
}
