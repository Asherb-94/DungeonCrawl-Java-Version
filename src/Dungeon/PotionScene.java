package Dungeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class PotionScene {
	//TODO need external hero
      static Hero hero;
	
	// The following types of potions correspond to each //
	static int[] potions = {0, 1, 2, 3};
	static int potionInit = 0;
	
	public static void potionScene() throws IOException{
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
		

		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String ans = input.readLine();
		
		if (ans.equals("y") || ans.equals("Y")){
			if (toss == potions[0])
			{
				System.out.println("This tastes great!\nYour max hitpoints increase!\n");
				hero.setMaxHitPoints(hero.getMaxHitPoints()+3);// Strength: x/x+1
				hero.setHitPoints(hero.getMaxHitPoints());//  Strength: x+1/x

			}
			
			else if (toss == potions[1])
			{
				System.out.println("It tastes like maple syrup.\nYou feel warm all over.\nYour hitpoints are restored!");
				hero.setHitPoints(hero.getMaxHitPoints());
			}
			
			else if (toss == potions[2])
			{
				System.out.println("It tastes like warm apple juice.\nNothing happens.");
			}
			else 
			{
				System.out.println("It tastes like yellow snow. \nThis is not good.");
				hero.setHitPoints(hero.getHitPoints()-1);
			}
		
		}
	}
	
	public static void main(String[] args) throws IOException{
		potionScene();
	}
}
