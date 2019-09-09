package virtualorphanageamok;

public class VirtualRobotBaby extends VirtualBabyOrphanage  {

	private int oilLevel;
	private int playLevel;
	private int batteryLevel;
	

	public VirtualRobotBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.oilLevel=50;
		this.playLevel =50;
		this.batteryLevel=50;
		
	}

	public void provideMaintence() {
		this.oilLevel+=10;
		this.batteryLevel+=5;
		
	}

	public int getOilLevel() {
		return this.oilLevel;
	}

	public void playWithBaby() {
		this.playLevel +=10;
		this.batteryLevel-=5;
		this.oilLevel-=2;
		
		
	}

	public int getPlayLevel() {
		return this.playLevel;
	}

	public void chargeBattery() {
		this.batteryLevel += 10;
		
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
}