package PracticePackage;

public class practice {
	int a = 10;
	int b = 20;

	public void callbyReference(practice x) {
		x.a = 100;
		x.b = 50;
	}
	
	public static void main(String[] args) {
		
		practice p = new practice();
		System.out.println("before "+p.a+" "+p.b);
		p.callbyReference(p);
		System.out.println("after "+p.a+" "+p.b);
		
	}

}
 