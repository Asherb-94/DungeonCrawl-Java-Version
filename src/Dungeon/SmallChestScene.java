package Dungeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;


public class SmallChestScene {//Non fighting Scene 

	Hero hero;
	
	public SmallChestScene(int monsterHit, int monsterStr) throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("\n\n\n\nYou go deeper into the mine.\n");
		System.out.println("You find a small chest.");
		System.out.println("On the chest is an inscription in a mystical language ");
		System.out.println("\nDo you wish to open the box? (y or n)");
		
		String ans = input.readLine();
		if (ans.equals("y") || ans.equals("Y"))
		{


			 Random randSub = new Random();
			 int  rand = randSub.nextInt(6);//change to 6 and +0
			
			
			if (rand == 0)
			{
				System.out.println("You open the box. A burst of poison gas hits you.\n");
				hero.setHitPoints(hero.getHitPoints()-2);
			}
		    if (rand == 1)
			{
				System.out.println("You open the box and find it empty.");
				System.out.println("You hear a snicker in the distance.");
			}
			 if (rand == 2)
			{
				
				System.out.println("You find a purple magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				
				//String ansSubOne = scanner.next();
				String ansSubOne = input.readLine();
				if (ansSubOne.equals("y") || ansSubOne.equals("Y"))
				{
					System.out.println("\nYour hit points are restored.");
					hero.setHitPoints(hero.getMaxHitPoints());
				}
			}
		    if (rand == 3)
			{
				System.out.println("You find a red magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				
				//String ansSubTwo = scanner.next();
				String ansSubTwo = input.readLine();
				
				if (ansSubTwo.equals("y") || ansSubTwo.equals("Y"))
				{
					System.out.println("\nYour strength is increased.\n\n");
					hero.setMaxStrength(hero.getMaxStrength()+1);// Strength: x/x+1
					hero.setStrength(hero.getMaxStrength());//  Strength: x+1/x
					
				}
			}
		    if (rand == 4)
			{
				System.out.println("You find a yucky green magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				
				String ansSubThree = input.readLine();
				if (ansSubThree.equals("y") || ansSubThree.equals("Y"))
				{
					System.out.println("\nYou feel ill.(-1 total strength)\n\n");
					hero.setMaxStrength(hero.getMaxStrength()-1);
					hero.setStrength(hero.getMaxStrength());
				}
			}
		    if ( rand == 5 || rand == 6) 
			{
				System.out.println("You find an orange magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				

				String ansSubFour = input.readLine();
				if (ansSubFour.equals("y") || ansSubFour.equals("Y"))
				{
					System.out.println("\nNothing happens.\n\n");
				}

				
			}

		}
	}
	
	public static void main(String args[]) throws IOException{
		SmallChestScene sc = new SmallChestScene(5, 5);
	}
}
