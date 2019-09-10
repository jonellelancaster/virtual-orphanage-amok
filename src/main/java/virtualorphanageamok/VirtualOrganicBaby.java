package virtualorphanageamok;

public abstract class VirtualOrganicBaby extends VirtualBabies {

	private int playLevel;
	private int hungerLevel;
	private int energyLevel;
	private int thirstLevel;

	public VirtualOrganicBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.playLevel = 50;
		this.energyLevel = 50;
		this.thirstLevel = 50;
		this.hungerLevel = 50;

	
}
	public void organicPlayWithBaby() {
		this.playLevel += 10;
		this.energyLevel -= 5;
		this.hungerLevel -= 5;
		this.thirstLevel-=5;

	}

	public int getThirstLevel() {
		return this.thirstLevel;
	}

	public int getPlayLevel() {
		return this.playLevel;

	}

	public void organicFeedBaby() {
		this.hungerLevel += 10;
		this.energyLevel -= 1;
		this.thirstLevel -= 2;
		this.playLevel -= 1;
	}

	public int getHunger() {

		return hungerLevel;
	}

	public void organicSleep() {
		this.energyLevel += 10;
		this.hungerLevel -= 5;
		this.thirstLevel += 2;
		this.playLevel -= 2;

	}

	public int getEnergy() {
		return energyLevel;
	}

	public void organicTakeADrink() {
		this.thirstLevel += 10;
		this.energyLevel -= 2;
		this.hungerLevel -= 1;
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

	public abstract void determineOverAllHealth();

	public abstract void tick();

	public void organicTick() {
		this.thirstLevel -= 5;
		this.hungerLevel -= 5;
		this.playLevel -= 5;
		this.energyLevel -= 5;
	}
}