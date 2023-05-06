package InheritanceExercise;

public class Demo {

	public static void main(String[] args) {
		
		Crocodile c = new Crocodile();
		System.out.println(c.showInfo());
		
		Crocodile c1 = new Crocodile(true, true, true);
		System.out.println(c1.showInfo());
	}

}
