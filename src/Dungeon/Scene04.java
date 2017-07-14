package Dungeon;
import java.util.Scanner;

public class Scene04 {
	Hero hero;
	// TODO
	int monsterHit;
	int monsterStr;
	
	Scanner scanner = new Scanner(System.in);
	
	// start //
	private void scene04(int monsterHit, int monsterStr){
		System.out.println("You continue deeper into the mine.");
		System.out.println("The tunnel splits into two passages. Which one do you take? Left or Right? (L or R)");
		
		String ans = scanner.nextLine();
		if (ans.equals("L") || ans.equals("l"))
			leftChoice();
		
		else
			rightChoice();
	}
	
	private void leftChoice(){
		System.out.println("You see a sign in front of an orange bag: ");
		System.out.println("     Trick or Treat!!!\n\n");
		System.out.println("Do you put a piece of gold in the bag? (y or n)");
		
		String ans = scanner.nextLine();
		if (ans.equals("Y") || ans.equals("y")){
			hero.setGold(hero.getGold()+1);
			System.out.println("Wise choice. You continue down the tunnel.");
		}
		else {
			System.out.println("\nOh no! You have angered the Great Pumpkin!!\n");
			Monster monster = new Monster("Great Pumpkin", monsterHit, monsterStr, 0);
			//TODO sortie
		}
	}
	
	private void rightChoice(){
		System.out.println("You find 10 gold pieces.");
		hero.setGold(hero.getGold()+10);
	}
}
