package virtualorphanageamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualHumanBabyTest {

	HumanBaby baby = new HumanBaby("1", "Jonelle", "Sweet");

	@Test
	public void shouldBeAbleToPlay() {
		baby.playWithBaby();
		assertEquals(60, baby.getPlayLevel());

	}

	@Test
	public void shouldBeAbleToFeed() {
		baby.feedBaby();
		assertEquals(60, baby.getHunger());
	}

	@Test
	public void shouldBeAbletoSleep() {
		baby.sleep();
		assertEquals(60, baby.getEnergy());

	}

	@Test
	public void shouldGetADrink() {
		baby.takeADrink();
		assertEquals(60, baby.getThirst());
	}
@Test
public void shouldChangeDiaper() {
	baby.changeDiaper();
	assertEquals(60, baby.getDiaperSoilLevel());

}
	
	

}
