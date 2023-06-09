package Syncronization;

class Bracket {
	
	synchronized static public void generate(String threadCode) {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println("Generated by thread: " + threadCode);
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i ++) {
					Bracket.generate("Thread 1");
				}
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					Bracket.generate("Thread 2");				}
			}	
		}).start();
	}
}
