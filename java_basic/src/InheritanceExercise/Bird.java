package InheritanceExercise;

public class Bird extends Animal {
	protected boolean animalsWithFeathers;
	protected boolean canFly;

	public Bird() {
		this.animalsWithFeathers = false;
		this.canFly = false;
	}

	public Bird(boolean animalsWithFeathers, boolean canFly) {
		this.animalsWithFeathers = animalsWithFeathers;
		this.canFly = canFly;
	}

	public Bird(boolean animalsWithFeathers, boolean canFly, double height, double weight, String animalType,
			String bloodType) {
		super(height, weight, animalType, bloodType);

		this.animalsWithFeathers = animalsWithFeathers;
		this.canFly = canFly;
	}

	public boolean isAnimalsWithFeathers() {
		return animalsWithFeathers;
	}

	public boolean isCanFly() {
		return canFly;
	}

	@Override
	public String toString() {
		return "Bird [isAnimalsWithFeathers()=" + isAnimalsWithFeathers() + ", isCanFly()=" + isCanFly() + "]";
	}

}
