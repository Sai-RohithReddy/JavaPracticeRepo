package InheritanceExercise;

public class Reptile extends Animal {
	protected boolean drySkin , egg;
	protected boolean backbone;

	public Reptile() {
		this.drySkin = false;
		this.backbone = false;
		this.egg = false;
	}

	public Reptile(boolean drySkin, boolean backbone, boolean egg) {
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.egg = egg;
	}

	public Reptile(boolean drySkin, boolean egg, boolean backbone, double height, double weight, String animalType,
			String bloodType) {
		super(height, weight, animalType, bloodType);
		this.drySkin = drySkin;
		this.backbone = backbone;
		this.egg = egg;
	}

	public String showInfo() {
		return "Reptile [drySkin=" + drySkin + ", egg=" + egg + ", backbone=" + backbone + ", height=" + height
				+ ", weight=" + weight + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	

}
