import java.util.Random;
import java.util.Scanner;

public class Scene02 {
	// TODO
	Hero hero;
	
	public Scene02(int monsterHit, int monsterStr){
		System.out.println("\n\n\n\nYou go deeper into the mine.\n");
		System.out.println("You find a small chest.");
		System.out.println("On the chest is an inscription in a mystical language: ");
		System.out.println("If (rand%6 == 0), death = 1; ");
		System.out.println("\n\nDo you wish to open the box? (y or n)");
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		if (ans.equals("y") || ans.equals("Y")){
			Random random = new Random();
			int rand = random.nextInt();
			rand = rand%6;
			
			if (rand == 0){
				System.out.println("You open the box. A burst of poison gas hits you. You die.\n");
				hero.setHitPoints(0);
			}
			else if (rand == 1){
				System.out.println("You open the box and find it empty.");
				System.out.println("You hear a snicker in the distance.");
			}
			else if (rand == 2){
				System.out.println("You find a purple magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				ans = scanner.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("\nYour hit points are restored.");
					hero.hitPoints = hero.maxHitPoints;
				}
			}
			else if (rand == 3){
				System.out.println("You find a red magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				ans = scanner.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("\nYour strength is increased.\n\n");
					hero.maxStrength++;
				}
			}
			else if (rand == 4){
				System.out.println("You find a yucky green magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				ans = scanner.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("\nYou feel ill.\n\n");
					hero.maxStrength--;
				}
			}
			else {
				System.out.println("You find an orange magic potion.");
				System.out.println("Do you drink the potion? (y or n)");
				
				ans = scanner.nextLine();
				if (ans.equals("y") || ans.equals("Y")){
					System.out.println("\nNothing happens.\n\n");
				}
			}
		}
	}
}
