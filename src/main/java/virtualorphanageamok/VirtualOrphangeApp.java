package virtualorphanageamok;

import java.util.Scanner;

public class VirtualOrphangeApp {

	static VirtualBabyOrphanage lonelyHeartOrphange = new VirtualBabyOrphanage();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
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
				userMenu();
				break;
			case 2:
				lonelyHeartOrphange.overAllHealthForAllBabies();
				break;

			case 3:// adopt
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
				break;
			case 4:// leave
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
				break;
			case 5:// play with a baby
				System.out.println("Which baby would you like to play with? Please enter orphan ID");
				System.out.println(lonelyHeartOrphange.getAllBabies());
				String babyIDToBePlayedWith = input.nextLine();
				if (lonelyHeartOrphange.canPLayWithBaby(babyIDToBePlayedWith)) {
					VirtualBabies babyToBePlayedWith = lonelyHeartOrphange.findbaby(babyIDToBePlayedWith);
					babyToBePlayedWith.playWithBaby();

				} else {
					System.out.println("Please choose a baby within our care.");

				}
				break;
			case 6:
				lonelyHeartOrphange.feedAllBabies();
				System.out.println("Organic babies love to eat");
				break;
			case 7: // give organic babies a drink
			case 8:// put organic babies to nap
			case 9:// provide maintenance
			case 10:// charge robots
			case 11:// change diapers
			case 12: // alien walk
			case 13: // clean cages
			case 14:// quit

			}
			lonelyHeartOrphange.tickAllBabies();
			userMenu();
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
