package InheritanceExercise;

public class Eel extends Fish {
	protected boolean relesesElectricCharge;

	public Eel() {
		this.relesesElectricCharge = false;
	}

	public Eel(boolean relesesElectricCharge) {
		this.relesesElectricCharge = relesesElectricCharge;
	}

	public Eel(boolean relesesElectricCharge, boolean liveInWater, boolean hasGills, double height, double weight,
			String animalType, String bloodType) {
		super(liveInWater, hasGills, height, weight, animalType, bloodType);
		this.relesesElectricCharge = relesesElectricCharge;
	}

	public Eel(boolean relesesElectricCharge, boolean liveInWater, boolean hasGills) {
		super(liveInWater, hasGills);
		this.relesesElectricCharge = relesesElectricCharge;
	}

	public String showInfo() {
		return "Eel [relesesElectricCharge=" + relesesElectricCharge + ", liveInWater=" + liveInWater + ", hasGills="
				+ hasGills + ", height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}

}
