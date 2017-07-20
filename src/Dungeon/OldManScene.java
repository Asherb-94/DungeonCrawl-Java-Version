package Dungeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OldManScene {
	//TODO global hero object
		Hero hero;
		int monsterHit;
		int monsterStr;
		
		// start //
		public OldManScene(int monsterHit, int monsterStr) throws IOException{
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			this.monsterHit = monsterHit;
			this.monsterStr = monsterStr;
			
			System.out.println("You stumble upon a very old man sitting on a stool next to a wooden bridge.");
			System.out.println("Old Man: To cross my bridge you just answer my riddle correctly. Would you like to hear my riddle? (y or n)");
			String ans = input.readLine();
			if (ans.equals("n") || ans.equals("N")){
				System.out.println("Old Man: Well then... I guess we will have to fight.");
				System.out.println("The old man suddenly pulls out his wand!");
				Monster monster = new Monster("Old Man", monsterHit, monsterStr, 10);
				sortie sortie = new sortie(hero, monster);
			}
			else
			{
				System.out.println("Old Man: What belongs to you but others use it more than you do?");
				ans = input.readLine();
				if(ans.equalsIgnoreCase("name") || ans.equalsIgnoreCase("your name") || ans.contains("name")){
					System.out.println("Old Man: That is correct! You may pass.");
					System.out.println("You gain Intelligence");
					hero.setIntelligence(hero.getIntelligence()+1);
				}
				else{
					System.out.println("I'm sorry but that is not correct.");
					System.out.println("The old man suddenly pulls out his wand!");
					Monster monster = new Monster("Old Man", monsterHit, monsterStr, 10);
					monster.Summary();
					sortie sortie = new sortie(hero, monster);
				}
			}
				
			if(hero.getHitPoints() > 0)
				System.out.println("You safely cross the old wooden bridge.");
			
		}
		
		
		public static void main(String[] args) throws IOException{
			OldManScene sc = new OldManScene(5, 4);
		}
}
