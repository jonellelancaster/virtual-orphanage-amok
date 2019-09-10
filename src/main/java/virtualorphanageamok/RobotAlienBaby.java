package virtualorphanageamok;

public class RobotAlienBaby extends VirtualRobotBaby implements CanWalk {

	private int needsWalkedLevel;

	public RobotAlienBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.needsWalkedLevel = 50;
	}

	public void takeForWalk() {
		this.needsWalkedLevel += 10;
		increaseBatteryLevel(-5);
		increasePlayLevel(2);

	}

	public void robotProvideMaintence() {
		this.robotProvideMaintence();
		this.needsWalkedLevel -= 5;
	}

	public int getNeedsWalkedLevel() {
		return this.needsWalkedLevel;
	}

	public void tick() {
		this.needsWalkedLevel -= 5;
		this.robotTick();

	}

	@Override
	public void determineOverAllHealth() {
		System.out.println("Orphan's Name: " + getOrphanName() + "\nPlay Level: " + getPlayLevel() + "\nOil Level: "
				+ getOilLevel() + "\nBattery Level: " + getBatteryLevel() + "\nNeeds Walked Level: "
				+ getNeedsWalkedLevel() + "\n");

	}

	@Override
	public void playWithBaby() {
		this.robotPlayWithBaby();
		this.needsWalkedLevel-=5;
		
		
	}
}