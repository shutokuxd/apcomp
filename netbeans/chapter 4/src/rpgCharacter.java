import java.util.Scanner;


public class rpgCharacter {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String characterName = "Roland";
		String pause = "";
		int strength=0;
		int agility = 0;
		int magic=0;
		int menuChoice =-1; //sentinel
		System.out.println("Welcome to RPG Character Generator!");
		while(menuChoice!=0)
		{
			System.out.println();
			System.out.println("1 - Roll random character");
			System.out.println("2 - Show character stats");
			System.out.println("3 - Name your character");
			System.out.println("0 - Quit Program");
			menuChoice = s.nextInt();
			if (menuChoice==1)
			{
				strength = (int)(Math.random()*16)+ 3;
				agility = (int)(Math.random()*16)+ 3;
				magic = (int)(Math.random()*16)+ 3;
				System.out.println("Character name:  " + characterName);
				System.out.println("Strength:\t" + strength);
				System.out.println("Agility:\t" + agility);
				System.out.println("Magic:\t\t" + magic);
				pause = s.nextLine();
			}
			if (menuChoice==2)
			{
				System.out.println("Character name:  " + characterName);
				System.out.println("Strength:\t" + strength);
				System.out.println("Agility:\t" + agility);
				System.out.println("Magic:\t\t" + magic);
			}
			if (menuChoice==3)
			{
				System.out.println("Enter new character name");
				characterName = s.next();
			}
			if (menuChoice==0)
			{
				System.out.println("Goodbye " + characterName + "!");
				System.exit(0);
			}
		}
	}
}