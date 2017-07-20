package Dungeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Scene04 {
	//TODO global hero object
	//Hero hero = new Hero("hero", 5, 5, 0);
	Hero hero;
	int monsterHit;
	int monsterStr;
	
	// start //
	public Scene04(int monsterHit, int monsterStr) throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("You continue deeper into the mine.");
		System.out.println("The tunnel splits into two passages. Which one do you take? Left or Right? (L or R)");
		//System.out.println();
		
		this.monsterHit = monsterHit;
		this.monsterStr = monsterStr;
		
		//String ans = scan.nextLine();
		String ans = input.readLine();
		if (ans.equals("L") || ans.equals("l"))
			leftChoice();
		
		else
			rightChoice();
	}
	
	private void leftChoice() throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("You see a sign in front of an orange bag: ");
		System.out.println("     Trick or Treat!!!\n\n");
		System.out.println("Do you put a piece of gold in the bag? (y or n)");
		
		//TODO add conditional for if you don't have any gold
		
		//String ans = scan.nextLine();
		String ans = input.readLine();
		if (ans.equals("Y") || ans.equals("y")){
			hero.setGold(hero.getGold()+1);
			System.out.println("Wise choice. You continue down the tunnel.");
		}
		else {
			System.out.println("\nOh no! You have angered the Great Pumpkin!!\n");
			Monster monster = new Monster("Great Pumpkin", monsterHit, monsterStr, 0);
			sortie sortie = new sortie(hero, monster);
		}
	}
	
	private void rightChoice(){
		System.out.println("You find 10 gold pieces.");
		hero.setGold(hero.getGold()+10);
		hero.Summary();
	}
	
	public static void main(String[] args) throws IOException{
		Scene04 sc = new Scene04(5, 4);
	}
}
