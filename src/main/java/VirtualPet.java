import org.junit.Assert;
import org.junit.Test;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int boredom;
	private int energy;
	private int amount = 10;
	
	public VirtualPet(int hunger,int thirst,int boredom,int energy){
	this.hunger = hunger;
	this.thirst = thirst;
	this.boredom = boredom;
	this.energy = energy;
	
	
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
		
	}

	public int getBoredom() {
		// TODO Auto-generated method stub
		return boredom;
	}

	public int getEnergy() {
		// TODO Auto-generated method stub
		return energy;
	}

	public int feedPet() {
		hunger += amount;
		thirst -= amount/2;
		energy += amount/2;
		return hunger;
		
	}
	
	public String toString() {
		return ("hunger " + this.getHunger()+"\nthirst "+ this.getThirst()+"\nboredom "+this.getBoredom()+"\nenergy "+this.getEnergy());
	}

	public int waterPet() {
		thirst += amount;
		boredom += amount;
		energy  += amount/2;
		
		return thirst;
	}

	public int playPet() {
		boredom += amount;
		energy -= amount/2;
		hunger -= amount/3;
		thirst -= amount/3;
		
		return boredom;
	}

	public int petNapping() {
		energy += amount*2;
		boredom -=amount;
		hunger -=amount/2;
		thirst -=amount/2;
				
		
		return energy;
	}
	
	public void tick(){
		hunger -=2;
		thirst -=2;
		boredom -= 2;
		energy -= 2;
		
	}
	
	
	
}	
		
	
	


