package virtualorphanageamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualBabyOrphanage {

	Map<String, VirtualBabies> babiesInShelter = new HashMap<>();

	public void addBaby(VirtualBabies baby) {
		babiesInShelter.put(baby.getOrphanID(), baby);
	
	}

	public Collection<VirtualBabies> getAllBabies() {
		return babiesInShelter.values();

	}

	public void adoptBaby(VirtualBabies baby) {
		babiesInShelter.remove(baby.getOrphanID(), baby);

	}

	public void overAllHealthForAllBabies() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			baby.determineOverAllHealth();

		}
	}
	public void tickAllBabies() {
		for(VirtualBabies baby: babiesInShelter.values()) {
			baby.tick();
		}
	}

	public boolean isBabyAdoptable(String orphanName) {
		return babiesInShelter.containsKey(orphanName);
	}

	public VirtualBabies findbaby(String orphanName) {
		return babiesInShelter.get(orphanName);
	}

	public boolean canPLayWithBaby(String orphanID) {
		return babiesInShelter.containsKey(orphanID);
	}
	public void feedAllBabies() {
		for(VirtualBabies baby: babiesInShelter.values()) {
			if(baby instanceof VirtualOrganicBaby) {
				VirtualOrganicBaby babyToFeed = (VirtualOrganicBaby) baby;
				babyToFeed.organicFeedBaby();
		}
	}
	}
}