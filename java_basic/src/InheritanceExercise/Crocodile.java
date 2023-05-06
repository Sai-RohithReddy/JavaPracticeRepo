package InheritanceExercise;

public class Crocodile extends Reptile {
	
	protected String egg;
	
	public Crocodile() {
		this.egg = null;
	}

	public Crocodile(boolean drySkin, boolean egg, boolean backbone, double height, double weight, String animalType,
			String bloodType) {
		super(drySkin, egg, backbone, height, weight, animalType, bloodType);
		// TODO Auto-generated constructor stub
	}

	public Crocodile(boolean drySkin, boolean backbone, boolean egg) {
		super(drySkin, backbone, egg);
		// TODO Auto-generated constructor stub
	}
	
	

}
