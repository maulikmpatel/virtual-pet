
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	VirtualPet virtualPet = new VirtualPet(60,50,40,30);
	
	@Test
	public void shouldReturnHunger(){
		int hunger = virtualPet.getHunger();
		Assert.assertEquals(60, hunger);
	}
	@Test
	public void shouldReturnThirst(){
		int thirst = virtualPet.getThirst();
		
		Assert.assertEquals(50, thirst);
	}
	@Test
	public void shouldReturnBoredom(){
		int boredom = virtualPet.getBoredom();
		Assert.assertEquals(40, boredom);
	}
	@Test
	public void shouldReturnEnergy(){
		int energy = virtualPet.getEnergy();
		Assert.assertEquals(30, energy);
	}
	
	@Test
	public void shouldAddFood(){
		int newHunger = virtualPet.feedPet();
		Assert.assertEquals(70,newHunger);
		
	}
	@Test
	public void shouldAddWater(){
		int newWater = virtualPet.waterPet();
		Assert.assertEquals(60,newWater);
		
	}
	@Test
	public void shouldLowerBoredom(){
		int playWithPet = virtualPet.playPet();
		Assert.assertEquals(50, playWithPet);
	
	}
	@Test
	public void shouldIncreaseEnergy(){
		int sleepingPet = virtualPet.petNapping();
		
	}
	
	
		
	}


