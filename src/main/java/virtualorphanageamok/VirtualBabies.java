package virtualorphanageamok;

public abstract class VirtualBabies {

	private String orphanID;
	private String orphanName;
	private String description;
	

	public VirtualBabies(String orphanID, String orphanName, String description) {
		this.orphanID = orphanID;
		this.orphanName = orphanName;
		this.description = description;

	}

	public String getOrphanID() {
		return orphanID;

	}

	public String getOrphanName() {
		return orphanName;

	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Orphan ID:  " + orphanID + "\n Babies Name:" + orphanName + "\n Description:" + description + ".\n  ";
	}

	public abstract void determineOverAllHealth();

public abstract void playWithBaby();

	
	public abstract void tick();
//	public abstract String determineOverallHealth();

}
