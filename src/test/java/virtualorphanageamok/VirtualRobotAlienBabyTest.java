package virtualorphanageamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualRobotAlienBabyTest {
	
	VirtualRobotBaby baby = new RobotAlienBaby("4","Blarka","Made in China"); 
	
	
	@Test
	public void shouldBeAbleToDoMaintence() {
		baby.provideMaintence();
		assertEquals(60, baby.getOilLevel());
		
		
		
	}
		@Test
		public void shouldBeAbleToPLay() {
			baby.playWithBaby();
			assertEquals(60, baby.getPlayLevel());
		}
		
		@Test
		public void shouldBeAbleToChargeBattery() {
		baby.chargeBattery();
		assertEquals(60, baby.getBatteryLevel());
		
		}
	@Test
	public void shouldBeAbleToBeWalked() {
		((RobotAlienBaby) baby).takeForWalk();
		assertEquals(60, ((RobotAlienBaby) baby).getNeedsWalkedLevel());
		
	}

}
