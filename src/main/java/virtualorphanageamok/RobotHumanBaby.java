package virtualorphanageamok;

public class RobotHumanBaby {

	private int oilLevel;
	
	
	
	
	
	
	
	
	public RobotHumanBaby(String string, String string2, String string3) {
		this.oilLevel=50;
	}

	public void provideMaintence() {
		oilLevel+=10;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	
	
	
}
