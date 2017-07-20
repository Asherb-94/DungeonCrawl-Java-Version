package Dungeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scene09 {//Revenge
	Hero hero;
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	DungeonCrawl objDungeon = new DungeonCrawl();
	
	private void fight() throws IOException{
		Monster wizBro = new Monster("Old Wizard", 7, 6, 0);
		wizBro.Summary();
		sortie srt = new sortie(hero, wizBro);
		System.out.println("You stand over the old wizard's body. He looks peaceful next to his brother.");
		System.out.println("Do you bury them? (y or n)");
		
    	String ans = input.readLine();    	
    	if (ans.equals("y") || ans.equals("Y")){
    		System.out.println("Your max HP increases and you restore your HP.");
    		hero.setMaxHitPoints(hero.getMaxHitPoints()+1);
    		hero.setHitPoints(hero.getMaxHitPoints());
    	}
	}
	
	public Scene09() throws IOException{
		System.out.println("You enter a room that is pitch black except for pure white sunlight coming from a hole in the ceiling.");
		System.out.println("As your eyes adjust to the light, you realize that the light is illuminating a coffin.\n");
		System.out.println("And a man kneeling beside it. You cannot see his face.");
		System.out.println("\nYou begin to walk toward it and your footsteps echo off the cavernous walls. The man turns.");
		System.out.println("He looks familiar... \nAlmost like... \n\nTHE WIZARD!");
		System.out.println("\n\t'YOU!!!!! YOU KILLED MY BROTHER!'");
		System.out.println("\nHe casts a forceful spell that pushes you back against a wall.");
		System.out.println("\n\t'Answer me this, scum. Why did you murder him?'\n");
		
		System.out.println("(a) He attacked me first! I was just defending myself!");
		System.out.println("(b) It seemed like he wanted me to fight him, like it was a test. He kept talking about how wise I am...");
		System.out.println("(c) The bastard had it coming. And I'll send you to hell with him!");
		

    	String ans = input.readLine();
    	
    	if (ans.equals("a") || ans.equals("A")){
    		System.out.println("\t'You may not have struck the first blow, but you struck the last.");
    		System.out.println("\tIn return, I demand all of your gold. Obey or face my wrath.'");
    		System.out.println("\n(a) Give up gold\n(b) Fight");
    		ans = input.readLine();       	
        	if (ans.equals("a") || ans.equals("A")){
        		hero.setGold(0);
        		System.out.println("\t'You're lucky I don't make you suffer a worse fate than my brother.");
        		System.out.println("\tCarry on, but watch your back.'");
        	}
        	else {
        		fight();
        	}    		
    	}// end option A if
    	
    	else if (ans.equals("b") || ans.equals("B")){
    		System.out.println("\t'Yes... my brother knew he could not live forever. He needed a protege.");
    		System.out.println("\tHe wanted to train you to be a great wizard too. He did not realize how strong you really are.");
    		System.out.println("\tDrink this potion, it'll give you more strength.'");
    		hero.setMaxStrength(hero.getMaxStrength()+1);
    		hero.setStrength(hero.getMaxStrength());    		
    	}
    	
    	else {
    		System.out.println("\t'Prepare to die, foolish cow.'");
    		fight();
    	}
		
    	objDungeon.heroSummary();;
		
	} // end main scene

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scene09 rev = new Scene09();
	}

}
