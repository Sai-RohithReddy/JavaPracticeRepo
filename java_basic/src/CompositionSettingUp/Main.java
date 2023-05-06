package CompositionSettingUp;

public class Main {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		
		Processor processor = new Processor("Dell", "8500U", 8, 4, 4, "8MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB",
				new GraphicsCard("Nvidia", 1050, "4GB"), null, "backlit");
		
		System.out.println(l1);
		System.out.println(l1.getProcessor().getBrand());
		
		System.out.println();
		
		System.out.println(gamingLaptop);
		System.out.println(gamingLaptop.getProcessor().getBrand());
		
		System.out.println();
		
		System.out.println(gamingLaptop.getProcessor().getFrequency());
		gamingLaptop.gamingMode();
		System.out.println(gamingLaptop.getProcessor().getFrequency());

	}

}
