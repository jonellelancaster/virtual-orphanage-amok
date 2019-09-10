package virtualorphanageamok;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

public class VirtualBabyOrphanageTest {

	VirtualBabyOrphanage orphanage = new VirtualBabyOrphanage();

	@Test
	public void shouldBeAbleToAddBaby() {
	HumanBaby baby=new HumanBaby("12","","");
	orphanage.addBaby(baby);
	Collection<VirtualBabies> check =orphanage.getAllBabies();
	assertThat(check, contains(baby));
	}
	@Test
	public void shouldBeAbleToAddTwoDifferentKindsOfBabies() {
		HumanBaby human =new HumanBaby("1", "","");
		RobotHumanBaby robot =new RobotHumanBaby ("2","","");
		orphanage.addBaby(human);
		orphanage.addBaby(robot);
		Collection<VirtualBabies> check =orphanage.getAllBabies();
		assertThat(check, containsInAnyOrder(human,robot));
	}
	@Test
	public void shouldRemoveBaby() {
		HumanBaby human =new HumanBaby("1", "","");
		RobotHumanBaby robot =new RobotHumanBaby ("2","","");
		orphanage.addBaby(human);
		orphanage.addBaby(robot);
		orphanage.removeBaby(human);
		Collection<VirtualBabies> check =orphanage.getAllBabies();
		assertThat(check, contains(robot));
	}
	
	
	
}
