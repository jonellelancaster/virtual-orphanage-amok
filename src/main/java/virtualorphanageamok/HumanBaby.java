package virtualorphanageamok;

public class HumanBaby extends VirtualOrganicBaby {

	int diaperLevel;

	public HumanBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);

		this.diaperLevel = 50;
	}

	public void feedBaby() {
		this.diaperLevel -= 5;
	}

	public void sleep() {
		this.diaperLevel -= 20;
	}

	public void changeDiaper() {
		this.diaperLevel += 10;
		increaseEnergy(2);
		increasePlayLevel(2);
	}

	public int getDiaperSoilLevel() {
		return diaperLevel;
	}

	public void overAllHealth() {
		getDiaperSoilLevel();

	}

	public void tick() {
		this.diaperLevel -= 5;

	}

}
