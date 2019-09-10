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

	public int getNeedsWalkedLevel() {
		return this.needsWalkedLevel;
	}

	public void overAllHealth() {
		getNeedsWalkedLevel();
	}

	public void tick() {
		this.needsWalkedLevel-=5;
	
}
}