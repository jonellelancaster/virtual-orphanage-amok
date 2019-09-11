package virtualorphanageamok;

public abstract class VirtualRobotBaby extends VirtualBabies {

	private int oilLevel;
	private int playLevel;
	private int batteryLevel;

	public VirtualRobotBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.oilLevel = 50;
		this.playLevel = 50;
		this.batteryLevel = 50;

	

	}

	public int getOilLevel() {
		return this.oilLevel;
	}

	public void robotPlayWithBaby() {
		this.playLevel += 10;
		this.batteryLevel -= 5;
		this.oilLevel -= 2;

	}
	public void robotOilBaby() {
		this.playLevel-=5;
		this.batteryLevel-=5;
		this.oilLevel +=10;
	}
	

	public int getPlayLevel() {
		return this.playLevel;
	}

	public void robotChargeBattery() {
		this.batteryLevel += 10;
		this.playLevel-=5;
		this.oilLevel-=5;

	}

	public int getBatteryLevel() {
		return this.batteryLevel;

	}

	public void increaseBatteryLevel(int amountToIncrease) {
		this.batteryLevel += amountToIncrease;
	}

	public void increasePlayLevel(int amountToIncrease) {
		this.playLevel += amountToIncrease;
	}

	public abstract void determineOverAllHealth();

	public abstract void tick();

	public void robotTick() {
		this.oilLevel -= 5;
		this.playLevel -= 5;
		this.batteryLevel -= 5;
	}
}