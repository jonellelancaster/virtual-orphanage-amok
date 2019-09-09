package virtualorphanageamok;


public abstract class VirtualBabies {

	private String orphanID;
	private String orphanName;
	private String description;

	public VirtualBabies(String orphanID, String orphanName, String description) {
		super();
		this.orphanID=orphanID;
		this.orphanName=orphanName;
		this.description=description;
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
	return "Our current inventory of children: Orphan ID-  " + orphanID + ", Their name:" + orphanName + ", and a brief description-" + description + ".";
}

}

