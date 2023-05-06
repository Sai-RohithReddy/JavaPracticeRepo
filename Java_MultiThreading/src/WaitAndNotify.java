
public class WaitAndNotify {
	static public int balance = 0;
	
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance-9 <= 0) {
				try {
					System.out.println("Waiting for balance updation");
					wait(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance -= amount;
		System.out.println("Withdrawal successful and the current balance is: " + balance);
	}
	
	public void deposit(int amount) {
		System.out.println("We are depositing the amount");
		balance += amount;
		synchronized(this) {
			notify();
		}
	}
	
	public static void main(String[] args) {
		WaitAndNotify app = new WaitAndNotify();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(1000);
			}
			
		});
		t1.setName("Thread1");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
			}
		});
		t2.setName("Thread2");
		t2.start();
	}
}
