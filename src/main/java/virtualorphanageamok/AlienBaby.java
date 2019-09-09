package virtualorphanageamok;

public class AlienBaby extends VirtualOrganicBaby implements CanWalk {

	private int cageFilthLevel;
	private int needsWalkedLevel;

	public AlienBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);
		this.cageFilthLevel = 50;
		this.needsWalkedLevel = 50;

	}
	public void playWithBaby() {
		this.needsWalkedLevel+=5;
		this.cageFilthLevel +=2;
	}

	public void feedBaby() {
		this.cageFilthLevel -= 5;
		this.needsWalkedLevel -= 5;
	}

	public void sleep() {
		this.cageFilthLevel -= 10;
		this.needsWalkedLevel -= 5;
	}

	public void cleanCage() {
		this.cageFilthLevel += 10;
		increaseEnergy(5);
		increasePlayLevel(5);
	}

	public int getCageFilthLevel() {
		return cageFilthLevel;
	}

	@Override
	public void takeForWalk() {
		this.needsWalkedLevel += 10;
		this.cageFilthLevel += 2;
		increaseEnergy(-5);
		increasePlayLevel(2);

	}

	@Override
	public int getNeedsWalkedLevel() {
		return this.needsWalkedLevel;
	}
}
