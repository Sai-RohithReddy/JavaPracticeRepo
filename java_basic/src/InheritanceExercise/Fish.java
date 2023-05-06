package InheritanceExercise;

public class Fish extends Animal {
	protected boolean liveInWater;
	protected boolean hasGills;

	public Fish() {
		this.liveInWater = false;
		this.hasGills = false;
	}

	public Fish(boolean liveInWater, boolean hasGills) {
		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}

	public Fish(boolean liveInWater, boolean hasGills, double height, double weight, String animalType,
			String bloodType) {
		super(height, weight, animalType, bloodType);

		this.liveInWater = liveInWater;
		this.hasGills = hasGills;
	}

	public boolean isLiveInWater() {
		return liveInWater;
	}

	public boolean isHasGills() {
		return hasGills;
	}

	@Override
	public String toString() {
		return "Fish [isLiveInWater()=" + isLiveInWater() + ", isHasGills()=" + isHasGills() + "]";
	}

}
