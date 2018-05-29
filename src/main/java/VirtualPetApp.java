import java.util.Scanner;

public class VirtualPetApp {

	
	
	public static void main(String[] args) {
		VirtualPet virtualPet = new VirtualPet(60,50,40,30);
		Scanner input = new Scanner(System.in);
		boolean gameOn = true;
	
		System.out.println("Welcome to your new virtual pet.");
		System.out.println("Please name your new pet.");		
		
		String petName = input.nextLine();
		System.out.println("Hello, my name is "+ petName + ", the Top Dawg");
		System.out.println("Currently I am at \n"+ virtualPet);
		while(gameOn == true){
		System.out.println("What would you like to do?");
		System.out.println("press 1 to feed "+petName+". \npress 2 to water "+petName+". \npress 3 to play fetch with "+petName+". \npress 4 to put "+petName+" to bed.");
		String userAction = input.nextLine();
		if (userAction.equals("1")){
			virtualPet.feedPet();
			
		}if (userAction.equals("2")){
			virtualPet.waterPet();
			
		}if (userAction.equals("3")){
			virtualPet.playPet();
			
		}if (userAction.equals("4")){
			virtualPet.petNapping();
			
		}
			virtualPet.tick();
		System.out.println(petName + " is now at\n"+ virtualPet);
		System.out.println("what would you like to do next?");
	
	}
	}
}
