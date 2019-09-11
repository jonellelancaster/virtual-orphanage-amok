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
		for (VirtualBabies baby : babiesInShelter.values()) {
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
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof VirtualOrganicBaby) {
				VirtualOrganicBaby babyToFeed = (VirtualOrganicBaby) baby;
				babyToFeed.organicFeedBaby();
			}
		}
	}

	public void giveAllBabiesADrink() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof VirtualOrganicBaby) {
				VirtualOrganicBaby babyToDrink = (VirtualOrganicBaby) baby;
				babyToDrink.organicTakeADrink();
			}
		}
	}

	public void putAllBabiesToNap() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof VirtualOrganicBaby) {
				VirtualOrganicBaby babyToNap = (VirtualOrganicBaby) baby;
				babyToNap.organicSleep();

			}
		}
	}

	public void oilRobotBabies() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof VirtualRobotBaby) {
				VirtualRobotBaby oilBaby = (VirtualRobotBaby) baby;
				oilBaby.robotOilBaby();
			}
		}

	}

	public void chargeRobotBabies() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof VirtualRobotBaby) {
				VirtualRobotBaby chargeBabies = (VirtualRobotBaby) baby;
				chargeBabies.robotChargeBattery();
			}
		}
	}

	public void changeBabyDiapers() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof HumanBaby) {
				HumanBaby babyToChange = (HumanBaby) baby;
				babyToChange.changeDiaper();
			}
		}
	}

	public void takeBabiesWalking() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof CanWalk) {
				CanWalk babyToWalk = (CanWalk) baby;
				babyToWalk.takeForWalk();
			}
		}
	}

	public void cleanCages() {
		for (VirtualBabies baby : babiesInShelter.values()) {
			if (baby instanceof AlienBaby) {
				AlienBaby alienCageToClean = (AlienBaby) baby;
				alienCageToClean.cleanCage();
			}
		}
	}
}