package InheritanceExercise;

public class Animal {
	protected double height;
	protected double weight;
	protected String animalType;
	protected String bloodType;

	public Animal() {
		this.height = 0.0;
		this.weight = 0.0;
		this.animalType = null;
		this.bloodType = null;
	}

	public Animal(double height, double weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
