package virtualorphanageamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualRobotHumanBabyTest {

	
	RobotHumanBaby baby = new RobotHumanBaby("3","Mr.Roboto","A Screw Loose"); 
		
		
	@Test
	public void shouldBeAbleToDoMaintence() {
		baby.provideMaintence();
		assertEquals(60, baby.getOilLevel());
		
		
		
	}
		
		
		
	
	
	}
