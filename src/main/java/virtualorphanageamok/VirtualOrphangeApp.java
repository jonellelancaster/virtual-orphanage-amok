package virtualorphanageamok;

import java.util.Scanner;

public class VirtualOrphangeApp {

	static VirtualBabyOrphanage lonelyHeartOrphange = new VirtualBabyOrphanage();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
lonelyHeartOrphange.addBaby(new HumanBaby("1","Sally","Big Heart and Kind Spirit"));
lonelyHeartOrphange.addBaby(new AlienBaby("2","Zarblurg", "Cyclops with a heart of pewter"));
lonelyHeartOrphange.addBaby(new RobotHumanBaby("3","R2B","Ready 2 be your child"));
lonelyHeartOrphange.addBaby(new RobotAlienBaby("4", "Nurfda","This one was a little off"));

System.out.println("Welcome to Lonely Hearts Orphanage. What is your name?");

String nameofVisitor = input.nextLine();

System.out.println("Hello " + nameofVisitor + "! What would you like to do?\n");

userMenu();


while(true) {
int menuChoice = input.nextInt();
	 switch (menuChoice) {
	 case 1: 
		System.out.println(lonelyHeartOrphange.getAllBabies());
		
		 userMenu();
		 break;
	 case 2:
		 
	 }
		 
		 
		 
		 
	
		 
	 
	
	
	 }
	
	
	}
	private static void userMenu() {
		System.out.println("Available options for all babies--------------------------------------------------------");
		System.out.println("Press 1: See a roster of our available babies and a short description about each one");
		System.out.println("Press 2: Adopt one of our babies.");
		System.out.println("Press 3: To leave a baby in our care.");
		System.out.println("Press 4: Play with all of the babies");
		System.out.println("Available options for our organic free range children.-------------------- -------------");
		System.out.println("Press 5: Feed the organic babies.");
		System.out.println("Press 6: Give the organic babies a drink.");
		System.out.println("Press 7: Put the organic babies down for a nap.");
		System.out.println("Available options for our robotic babies------------------------------------------------");
		System.out.println("Press 8: Provide oil maintence for our robotic babies.");
		System.out.println("Press 9: Charge our robotic babies");
		System.out.println("Available miscelanous options-----------------------------------------------------------");
		System.out.println("Press 10: Change human babies diapers");
		System.out.println("Press 11: Take all alien babies, both organic and robotic, for a walk");
		System.out.println("Press 12: Clean organic alien babies' cages");
		System.out.println("Press 13: This menu is too long and you just want to quit now.");
	}
	
	

}
