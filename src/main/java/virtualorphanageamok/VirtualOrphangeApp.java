package virtualorphanageamok;

import java.util.Scanner;

public class VirtualOrphangeApp {

	static VirtualBabyOrphanage lonelyHeartOrphange = new VirtualBabyOrphanage();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		lonelyHeartOrphange.addBaby(new HumanBaby("1", "Sally", "Human Baby"));
		lonelyHeartOrphange.addBaby(new AlienBaby("2", "Zarblurg", "Alien Baby"));
		lonelyHeartOrphange.addBaby(new RobotHumanBaby("3", "R2B", "Robot Human Baby"));
		lonelyHeartOrphange.addBaby(new RobotAlienBaby("4", "Nurfda", "Robot Alien Baby"));

		System.out.println("Welcome to Lonely Hearts Orphanage. What is your name?");

		String nameofVisitor = input.nextLine();

		System.out.println("Hello " + nameofVisitor + "! What would you like to do?\n");

		userMenu();

		while (true) {
			int menuChoice = input.nextInt();
			input.nextLine();
			switch (menuChoice) {
			case 1:
				System.out.println(lonelyHeartOrphange.getAllBabies());
				break;
			case 2:
				lonelyHeartOrphange.overAllHealthForAllBabies();
				break;
			case 3:
				adoptBaby();
				break;
			case 4:
				leaveBaby();
				break;
			case 5:
				play();
				break;
			case 6:
				lonelyHeartOrphange.feedAllBabies();
				System.out.println("Organic babies love to eat.");
				break;
			case 7:
				lonelyHeartOrphange.giveAllBabiesADrink();
				System.out.println("Organic babies love to drink.");
				break;
			case 8:
				lonelyHeartOrphange.putAllBabiesToNap();
				System.out.println("Organic babies are sleeping.");
				break;
			case 9:
				lonelyHeartOrphange.oilRobotBabies();
				System.out.println("Robots love oil to prevent rust.");
				break;
			case 10:
				lonelyHeartOrphange.chargeRobotBabies();
				System.out.println("Batteries are a robot equivalent to food!");
				break;
			case 11:
				lonelyHeartOrphange.changeBabyDiapers();
				System.out.println("Diapers are no longer crappy!");
				break;
			case 12:
				lonelyHeartOrphange.takeBabiesWalking();
				System.out.println("Aliens are born walking.");
				break;
			case 13:
				lonelyHeartOrphange.cleanCages();
				System.out.println("Alien cages are now less Alien-y.");
				break;
			case 14:
				System.out.println("We get it....it was a very long menu!");
				System.exit(0);
				break;// quit

			}
			lonelyHeartOrphange.tickAllBabies();
			userMenu();
		}

	}

	private static void play() {
		System.out.println("Which baby would you like to play with? Please enter orphan ID");
		System.out.println(lonelyHeartOrphange.getAllBabies());
		String babyIDToBePlayedWith = input.nextLine();
		if (lonelyHeartOrphange.canPLayWithBaby(babyIDToBePlayedWith)) {
			VirtualBabies babyToBePlayedWith = lonelyHeartOrphange.findbaby(babyIDToBePlayedWith);
			babyToBePlayedWith.playWithBaby();

		} else {
			System.out.println("Please choose a baby within our care.");

		}

	}

	private static void leaveBaby() {
		System.out.println("What is the name of the baby?");
		String newOrphanName = input.nextLine();
		System.out.println(
				"Please provide description of the child(HumanBaby, RobotHumanBaby, AlienBaby, RobotAlienBaby)");
		String newOrphanDescription = input.nextLine();
		System.out.println("What is the Ophan's ID number");
		String newOrphanID = input.nextLine();
		if (newOrphanDescription.contentEquals("HumanBaby")) {
			lonelyHeartOrphange.addBaby(new HumanBaby(newOrphanID, newOrphanName, newOrphanDescription));
		} else if (newOrphanDescription.contentEquals("RobotHumanBaby")) {
			lonelyHeartOrphange.addBaby(new RobotHumanBaby(newOrphanID, newOrphanName, newOrphanDescription));
		} else if (newOrphanDescription.contentEquals("RobotAlienBaby")) {
			lonelyHeartOrphange.addBaby(new RobotAlienBaby(newOrphanID, newOrphanName, newOrphanDescription));
		} else if (newOrphanDescription.contentEquals("AlienBaby")) {
			lonelyHeartOrphange.addBaby(new AlienBaby(newOrphanID, newOrphanName, newOrphanDescription));
		} else {
			System.out.println("Please give a valid description");

		}

	}

	private static void adoptBaby() {
		System.out.println("Which baby would you like to take home? Please enter the Orphan ID");

		String babyNameToBeAdopted = input.nextLine();

		if (lonelyHeartOrphange.isBabyAdoptable(babyNameToBeAdopted)) {
			VirtualBabies orphanIDToBeAdopted = lonelyHeartOrphange.findbaby(babyNameToBeAdopted);
			lonelyHeartOrphange.adoptBaby(orphanIDToBeAdopted);
			System.out.println("Thank you for your purchase of " + orphanIDToBeAdopted.getOrphanName());

		} else {
			System.out.println("Please choose a baby within our care.");
			System.out.println(lonelyHeartOrphange.getAllBabies());

		}

	}

	private static void userMenu() {
		System.out.println("Available options for all babies--------------------------------------------------------");
		System.out.println("Press 1: See a roster of our available babies and a short description about each one");
		System.out.println("Press 2: Get a list of babies and their Overall Health Status");
		System.out.println("Press 3: Adopt one of our babies.");
		System.out.println("Press 4: To leave a baby in our care.");
		System.out.println("Press 5: Play with a baby of your choice");
		System.out.println("Available options for our organic free range children.-------------------- -------------");
		System.out.println("Press 6: Feed the organic babies.");
		System.out.println("Press 7: Give the organic babies a drink.");
		System.out.println("Press 8: Put the organic babies down for a nap.");
		System.out.println("Available options for our robotic babies------------------------------------------------");
		System.out.println("Press 9: Provide oil maintenance for our robotic babies.");
		System.out.println("Press 10: Charge our robotic babies");
		System.out.println("Available miscelanous options-----------------------------------------------------------");
		System.out.println("Press 11: Change human babies diapers");
		System.out.println("Press 12: Take all alien babies, both organic and robotic, for a walk");
		System.out.println("Press 13: Clean organic alien babies' cages");
		System.out.println("Press 14: This menu is too long and you just want to quit now.");
	}

}
