package virtualorphanageamok;

public class RobotHumanBaby extends VirtualRobotBaby {


	
	
	public RobotHumanBaby(String orphanID, String orphanName, String description) {
	super(orphanID, orphanName, description);
	}

	@Override
	public void tick() {
		this.robotTick();
	}
	public void chargeBattery() {
		this.robotChargeBattery();
	
	}
	public void oilBaby() {
		this.robotOilBaby();
	}
	@Override
	public void determineOverAllHealth() {
		System.out.println("Orphan's Name: " + getOrphanName() +"\nPlay Level: " + getPlayLevel() + "\nOil Level: " + getOilLevel() + "\nBattery Level: "
				+ getBatteryLevel()+ "\n");
	
	
	}

	@Override
	public void playWithBaby() {
		this.robotPlayWithBaby();
		
	}
	
	
}
