package Dungeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Scene07 {
	//TODO global hero object
		Hero hero;
		
		// start //
		public Scene07() throws IOException{
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("You continue deeper into the mine.");
			System.out.println("You come up to a very large boulder.");
			System.out.println("It looks like you can try to scale the side of the boulder.");
			System.out.println("Would you like to try to climb the boulder (1) or try to go around the boulder (2)?");
			System.out.println();
			
			String ans = input.readLine();
			if (ans.equals("1"))
				climb();
			
			else
				goAround();
		}
		
		private void climb() throws IOException{
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			if(hero.getStrength() > 6){
				System.out.println("You climb to the top of the boulder and spot a golden chest. Would you like to open the chest? (y or n)");
				String ans = input.readLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("You open the chest and a skeleton hand reaches for you!");
					Monster monster = new Monster("Skeleton Hand", 1, 1, 0);
					sortie sortie = new sortie(hero, monster);
					if(hero.getHitPoints()> 0){
						System.out.println("You find 5 gold coins in the chest.");
						hero.setGold(hero.getGold()+5);
						System.out.println("You climb down the boulder and continue on.");
					}
					
				}
				else
					System.out.println("You climb down the boulder and continue on.");
			}
			else{
				System.out.println("You try to climb the boulder, but fail.");
				System.out.println("You realize you are not strong enough and decide to go around the boulder.");
				goAround();
			}
		}
		
		private void goAround(){
			System.out.println("You try to squeeze through a small gap inbetween the boulder and the cave wall.");
			Random random = new Random();
		    int toss = random.nextInt(2);
			if(hero.getStrength()+toss > 8){
				System.out.println("You successfully get past the boulder.");
			}
			else{
				System.out.println("You make it past the boulder, but hurt yourself.");
				hero.setHitPoints(hero.getHitPoints()-1);
			}
		}
		
		public static void main(String[] args) throws IOException{
			Scene07 sc = new Scene07();
		}
	
}
