import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
	private String name;
	
	SomeThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("String thread: " + name);
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended: " + name);
	}
}
public class ThreadPools {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		SomeThread t1 = new SomeThread("Thread 1");
		SomeThread t2 = new SomeThread("Thread 2");
		SomeThread t3= new SomeThread("Thread 3");
		SomeThread t4 = new SomeThread("Thread 4");
		SomeThread t5 = new SomeThread("Thread 5");
		SomeThread t6 = new SomeThread("Thread 6");
		SomeThread t7 = new SomeThread("Thread 7");
		SomeThread t8 = new SomeThread("Thread 8");
		SomeThread t9 = new SomeThread("Thread 9");
		SomeThread t10 = new SomeThread("Thread 10");
		
		executorService.execute(t1);
		executorService.execute(t2);
		executorService.execute(t3);
		executorService.execute(t4);
		executorService.execute(t5);
		executorService.execute(t6);
		executorService.execute(t7);
		executorService.execute(t8);
		executorService.execute(t9);
		executorService.execute(t10);
		
		executorService.shutdown();
	}
}
