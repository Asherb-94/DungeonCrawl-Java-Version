package Dungeon;


import java.io.IOException;

public class GoldElfScene {
		Hero hero;
		int monsterHit;
		int monsterStr;
		DungeonCrawl objDungeon = new DungeonCrawl();
	
		public GoldElfScene(int monsterHit, int monsterStr) throws IOException, InterruptedException{
			System.out.println("You walk into what looks like an empty dungeon. "
					+ "\nThere is a chest in the far corner of the room."
					+ "\nYou suddenly feel like something is watching you and become very tense."
					+ "\nYou walk slowly towards the chest, knowing something must be here."
					+ "\nSuddenly the chest explodes open and liquid gold starts flowing out of the chest."
					+ "\nThe liquid gold slowly forms into a solid gold human holding a golden sword. He lunges at you!");
			
			Monster monster = new Monster("Golden Human-Like Thing", monsterHit, monsterStr, 0);
			System.out.println();
			objDungeon.heroSummary();
			monster.Summary();
			sortie sortie = new sortie(hero, monster);
			
			if(hero.getHitPoints() > 0 && monster.getHitPoints() < 1){
				System.out.println("The golden human falls to the floor and turns into a golden puddle.");
				System.out.println("You look into the golden chest and take the 100 gold pieces sitting on the bottom.");
				hero.setGold(hero.getGold()+100);
				System.out.println("As you turn to leave the dungeon you see the golden puddle bubbling and rising out of the ground."
						+ "As you watch, horrified, it turns into a golden elf which quickly shoots an arrow at you.\n");
				if(hero.getMaxStrength() > 8)
				{
					System.out.println("\n\nYou are quick enough to dodge the attack!\n");
				}
				else
				{
					System.out.println("\n\nYou are not quick enough to dodge the attack!\t (-1 hit point)");
					hero.setHitPoints(hero.getHitPoints()-1);//x-1/x
				}
				
				Monster monster2 = new Monster("Golden Elf", monsterHit+4, monsterStr-2, 0);
				objDungeon.heroSummary();
				monster2.Summary();
				sortie sortie2 = new sortie(hero, monster2);
				
				if(hero.getHitPoints() > 0 && monster.getHitPoints() < 1){
					System.out.println("The golden elf falls to the floor and turns into a large golden key.");
					//TODO: Add golden key to hero backpack
				}
			}
		

		}
}
