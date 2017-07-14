import java.util.Random;
import java.util.Scanner;

public class Scene03 {
	Actor hero;
	Actor monster;
	public void scene03(){
		System.out.println("\n\n\n\nYou continue deeper into the mine.");
		System.out.println("What is THAT??\n.\n.\n.\n.\n");
		System.out.println("A mouse!");
		
		monster.name = "Mouse";
		//TODO make monsterHit and monsterStr variables
		//monster.hitPoints = monsterHit;
		//monster.strength = monsterStr;
		monster.potions = 0;
		
		//TODO monsterSummary();
		//TODO sortie();
		
		if (hero.hitPoints > 0 && monster.hitPoints <= 0){
			scene03part2();
		}
	}
	
	private void scene03part2(){
		System.out.println("The dead mouse lies at your feet.");
		System.out.println("You feel like kicking it into the darkness.");
		System.out.println("Do you kick the dead mouse? (y or n)");
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		if (ans.equals("y") || ans.equals("Y")){
			Random random = new Random();
			int toss = random.nextInt(12);
			
			if (toss < 3){
				System.out.println("Your actions show disrespect for the fallen.");
				System.out.println("You lose a hit point.");
				hero.hitPoints--;
			}
			else if (toss <= 10){
				System.out.println("The mouse vanishes into the darkness.");
			}
			else {
				System.out.println("The corpse bursts open, spilling " + toss + " gold coins!");
				System.out.println("You pocket the gold and move on.");
				hero.gold += toss;
			}
		}
	}
	
	
}
