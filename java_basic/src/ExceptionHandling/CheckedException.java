package ExceptionHandling;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("program is started");
		
		/*
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		Thread.sleep(5000);
		
		System.out.println("Program is exited");

	}

}
