package Dungeon;
import java.util.Random;
import java.util.Scanner;

public class Scene02 {
	//TODO global Hero object
	Hero hero;
	
	public Scene02(int monsterHit, int monsterStr){
		System.out.println("\n\n\n\nYou go deeper into the mine.\n");
		System.out.println("You find a small chest.");
		System.out.println("On the chest is an inscription in a mystical language ");
		System.out.println("\nDo you wish to open the box? (y or n)");
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		if (ans.equals("y") || ans.equals("Y"))
		{
			Random random = new Random();
			int rand = random.nextInt()%6;//not %6 there before TEST
			rand = rand%6;
			
			if (rand == 0)
			{
				System.out.println("You open the box. A burst of poison gas hits you. You die.\n");
				hero.setHitPoints(0);
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
				
				
				String ansSubOne = scanner.next();
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
				
				
				String ansSubTwo = scanner.next();
				if (ansSubTwo.equals("y") || ansSubTwo.equals("Y"))
				{
					System.out.println("\nYour strength is increased.\n\n");
					hero.setMaxStrength(hero.getMaxStrength()+1);
				}
			}
		    if (rand == 4)
			{
				System.out.println("You find a yucky green magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				String ansSubThree = scanner.nextLine();
				if (ansSubThree.equals("y") || ansSubThree.equals("Y"))
				{
					System.out.println("\nYou feel ill.\n\n");
					hero.setMaxStrength(hero.getMaxStrength()-1);
				}
			}
		    if ( rand == 5 || rand == 6) 
			{
				System.out.println("You find an orange magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				String ansSubFour = scanner.nextLine();
				if (ansSubFour.equals("y") || ansSubFour.equals("Y"))
				{
					System.out.println("\nNothing happens.\n\n");
				}
			}
		scanner.close();
		}
	}
	
	public static void main(String args[]){
		Scene02 sc = new Scene02(5, 5);
	}
}
