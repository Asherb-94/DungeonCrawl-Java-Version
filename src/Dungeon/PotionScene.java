package Dungeon;
import java.util.Random;
import java.util.Scanner;

public class PotionScene {
	//TODO need external hero
	static Hero hero = new Hero("Lydia", 5, 5, 0);
	
	// The following types of potions correspond to each //
	static int[] potions = {0, 1, 2, 3};
	static int potionInit = 0;
	
	public static void potionScene(){
		int toss;
		int tossA;
		int tossB;
		int temp;
		int j;
		
		Random random = new Random();
		
		if (potionInit == 0){
			potionInit = 1;
			
			for (j=0; j < 3; j++){
				tossA = random.nextInt(3);
				tossB = random.nextInt(3);
				
				temp = potions[tossA];
				potions[tossA] = potions[tossB];
				potions[tossB] = temp;
			}
		}
		
		toss = random.nextInt(3);
		System.out.println("You find a ");
		String color = "";
		if (toss == 0)
			color = "puce ";
		
		else if (toss == 1)
			color = "green ";
		
		else if (toss == 2)
			color = "red ";
		
		else if (toss == 3)
			color = "yellow ";
		
		System.out.print(color + "potion. Do you wish to drink it? (y/n)");
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		if (ans.equals("y") || ans.equals("Y")){
			if (toss == potions[0]){
				System.out.println("This tastes great!\nYour max hitpoints increase!\n");
				hero.setMaxHitPoints(random.nextInt(3));
			}
			
			else if (toss == potions[1]){
				System.out.println("It tastes like maple syrup.\nYou feel warm all over.\nYour hitpoints are restored!");
				hero.setHitPoints(hero.getMaxHitPoints());
			}
			
			else if (toss == potions[2]){
				System.out.println("It tastes like warm apple juice.\nNothing happens.");
			}
			else {
				System.out.println("It tastes like yellow snow. \nThis is not good.");
				hero.setHitPoints(hero.getHitPoints()-1);
			}
		hero.setMaxHitPoints(hero.getMaxHitPoints()-1);
		scanner.close();
		}
	}
	
	public static void main(String[] args){
		potionScene();
	}
}
