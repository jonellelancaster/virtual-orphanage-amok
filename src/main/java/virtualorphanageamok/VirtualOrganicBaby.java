package virtualorphanageamok;

public class VirtualOrganicBaby {

	private int playLevel;
	private String orphanID;
	private String orphanName;
	private String description;
	private int hungerLevel;
	private int energyLevel;
	private int thirstLevel;

	public VirtualOrganicBaby(String orphanID, String orphanName, String description) {
		this.playLevel = 50;
		this.orphanID = orphanID;
		this.orphanName = orphanName;
		this.description = description;
		this.hungerLevel = 50;
		this.energyLevel = 50;
		this.thirstLevel = 50;
	}

	public void playWithBaby() {
		playLevel += 10;
		energyLevel -= 5;
		hungerLevel -= 5;
	}

	public int getPlayLevel() {
		return this.playLevel;

	}

	public void feedBaby() {
		hungerLevel += 10;
		energyLevel -= 1;
		thirstLevel -= 2;
		playLevel -= 1;
	}

	public int getHunger() {

		return hungerLevel;
	}

	public void sleep() {
		energyLevel += 10;
		hungerLevel -= 5;
		thirstLevel += 2;
		playLevel -= 2;

	}

	public int getEnergy() {
		return energyLevel;
	}

	public void takeADrink() {
		thirstLevel += 10;
		energyLevel -= 2;
		hungerLevel -= 1;
	}

	public int getThirst() {
		return thirstLevel;
	}

	public void increaseEnergy(int amountToIncrease) {
		this.energyLevel += amountToIncrease;
	}

	public void increasePlayLevel(int amountToIncrease) {
		this.playLevel += amountToIncrease;
	}
}