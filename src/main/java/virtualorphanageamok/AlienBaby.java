package virtualorphanageamok;

public class AlienBaby extends VirtualOrganicBaby {

	private int cageFilthLevel;

	public AlienBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.cageFilthLevel = 100;

	}

	public void feedBaby() {
		cageFilthLevel -= 5;

	}

	public void sleep() {
		cageFilthLevel -= 20;

	}

	public void cleanCage() {
		cageFilthLevel += 20;
		increaseEnergy(5);
		increasePlayLevel(5);
	}

	public int getCageFilthLevel() {
		return cageFilthLevel;
	}
}
