package virtualorphanageamok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualAlienBabyTest {

	AlienBaby baby = new AlienBaby("2", "VerDerk", "Evil");
	
	@Test
	public void shouldBeAbleToPlay() {
		baby.playWithBaby();
		assertEquals(120, baby.getPlayLevel());

	}

	@Test
	public void shouldBeAbleToFeed() {
		baby.feedBaby();
		assertEquals(120, baby.getHunger());
	}

	@Test
	public void shouldBeAbletoSleep() {
		baby.sleep();
		assertEquals(120, baby.getEnergy());

	}

	@Test
	public void shouldGetADrink() {
		baby.takeADrink();
		assertEquals(120, baby.getThirst());
	}
@Test
public void shouldCleanCage() {
	baby.cleanCage();
	assertEquals(120, baby.getCageFilthLevel());

}
	
	
	
	
	
}
