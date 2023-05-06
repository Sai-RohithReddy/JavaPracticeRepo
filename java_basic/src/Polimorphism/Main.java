package Polimorphism;

public class Main {

	public static void main(String[] args) {
		
		Phone nokia = new Main().phone(1);
		System.out.println(nokia.getModel());
		nokia.features();
		
		Phone samsung = new Main().phone(2);
		System.out.println(samsung.getModel());
		samsung.features();

	}
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Phone("3310");
		case 2: return new Phone ("Note 5");
		}
		return null;
	}
}
