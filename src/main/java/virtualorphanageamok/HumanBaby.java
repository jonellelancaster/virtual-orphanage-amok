package virtualorphanageamok;

public class HumanBaby extends VirtualOrganicBaby {

	int diaperLevel;

	public HumanBaby(String orphanID, String orphanName, String description) {
		super(orphanID, orphanName, description);

		this.diaperLevel = 50;
	}
	

	public void feedBaby() {
		this.diaperLevel -= 5;
		this.organicFeedBaby();
	}

	public void sleep() {
		this.diaperLevel -= 20;
		this.organicSleep();
	}

	public void changeDiaper() {
		this.diaperLevel += 10;
		increaseEnergy(2);
		increasePlayLevel(2);
	}
	public void takeADrink() {
		this.organicTakeADrink();
		this.diaperLevel -=10;
	}
	public int getDiaperLevel() {
		return diaperLevel;

	}

	public void tick() {
		this.diaperLevel -= 5;
		this.organicTick();
	}

	@Override
	public void determineOverAllHealth() {
		System.out.println( "Orphan's Name: " + getOrphanName() +"\nPlay Level: " + getPlayLevel() + "\nThirst Level: " + getThirstLevel() + "\nHunger Level: "
				+ getHunger() + "\nEnergy Level: " + getEnergy() + "\nDiaper Level: " + getDiaperLevel() + "\n ");

	}


	@Override
	public void playWithBaby() {
	this.organicPlayWithBaby();
	this.diaperLevel-=5;
	}


		
		
	}


