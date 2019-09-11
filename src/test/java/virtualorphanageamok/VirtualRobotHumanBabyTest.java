package virtualorphanageamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualRobotHumanBabyTest {

	
	RobotHumanBaby baby = new RobotHumanBaby("3","Mr.Roboto","A Screw Loose"); 
		
		
	@Test
	public void shouldBeAbleToDoMaintence() {
		baby.oilBaby();
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
	
	
	}
