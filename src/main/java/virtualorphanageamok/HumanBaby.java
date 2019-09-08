package virtualorphanageamok;

public class HumanBaby extends VirtualOrganicBaby {

	int diaperLevel;


	public HumanBaby(String orphanID, String orphanName, String description) {
	super(orphanID, orphanName, description);
		
		this.diaperLevel=50;
	}	
		public void feedBaby() {
			diaperLevel -= 5;
	}
		public void sleep() {
			diaperLevel -= 20;
	}
	public void changeDiaper() {
		diaperLevel+=10;
		increaseEnergy(2);
		increasePlayLevel(2);
	}
	public int getDiaperSoilLevel() {
		return diaperLevel;
	}


}
