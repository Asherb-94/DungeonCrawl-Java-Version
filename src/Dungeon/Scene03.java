package Dungeon;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//
public class Scene03 {
	//TODO global hero object
	static Hero hero;

	public Scene03(int monsterHit, int monsterStr) throws IOException{
		System.out.println("\n\n\n\nYou continue deeper into the mine.");
		System.out.println("What is THAT??\n.\n.\n.\n.\n");
		System.out.println("A mouse!");
		
		Monster monster = new Monster("Mouse", monsterHit, monsterStr, 0);
		monster.Summary();
		
		sortie sortie = new sortie(hero, monster);
		
		if (hero.getHitPoints() > 0 && monster.getHitPoints() <= 0){
			scene03part2();
		}
	}
	
	private static void scene03part2(){
		System.out.println("The dead mouse lies at your feet.");
		System.out.println("You feel like kicking it into the darkness.");
		System.out.println("Do you kick the dead mouse? (y or n)");
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		
		if (ans.equals("y") || ans.equals("Y")){
			Random random = new Random();
			int toss = random.nextInt(13);
			
			if (toss < 3){
				System.out.println("Your actions show disrespect for the fallen.");
				System.out.println("You lose a hit point.");
				hero.setHitPoints(hero.getHitPoints()-1);
			}
			else if (toss <= 10){
				System.out.println("The mouse vanishes into the darkness.");
			}
			else {
				System.out.println("The corpse bursts open, spilling " + toss + " gold coins!");
				System.out.println("You pocket the gold and move on.");
				hero.setGold(hero.getGold()+toss);
			}
		}
		scanner.close();
	}
	
	public static void main(String args[]){
		//Scene03 sc = new Scene03(5, 5);
		scene03part2();
	}
}
