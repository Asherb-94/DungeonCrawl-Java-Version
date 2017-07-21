package Dungeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Moria {
	Hero hero;
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	Random random = new Random();
	DungeonCrawl objDungeon = new DungeonCrawl();
	
	private void orc() throws IOException{
		System.out.println("You head back the way you came. Strangely, you don't remember walking so long to get back...");
		System.out.println("\nYou round a corner to find an orc with a huge, spiked club in hand. He runs toward you.");
		
		Monster orc = new Monster("orc", 3, 3, 3);
		
		int strength = hero.getStrength();	// will be used to determine if they won the fight
		
		sortie srtie = new sortie(hero, orc);
		
		//TODO fix sortie method
		// if the hero won the fight (they gain strength if they do)
		if (hero.getStrength() > strength){
    		System.out.println("You rifle through the orc's belongings.");
    		int toss = random.nextInt(2);
    		
    		if (toss == 0){
    			System.out.println("Hmm, just some old bones.");
    		}
    		
    		else {
    			System.out.println("Ooh, some gold!");
    			hero.setGold(hero.getGold() + hero.getHitPoints());
    		}        		
		}	
	} // end orc
	
	private void balrogSortie() throws IOException{
    	Monster balrog = new Monster("balrog", 15, 10, 0);
    	objDungeon.heroSummary();
    	balrog.Summary();
		sortie sort = new sortie(hero, balrog);
		
		System.out.println("You manage to climb up from the chasm and finally get to the door.");
		System.out.println("Meadows of flowers stretch before you. The sun shines bright and warm. You have survived.");


	}
	
	private void balrog() throws IOException{
		System.out.println("The door slowly swings open to reveal an enormous room. It seems to be the remains of a working mine.");
		System.out.println("Everything is covered in dust now. You explore until you come to a bridge across a dark chasm.");
		System.out.println("Across the bridge, there's a door that looks like it leads to the way out! Finally!!");
		System.out.println("\nYou start to run along the bridge, when suddenly...");
		System.out.println("\n\n\tROOOOOAAAAARRRR!!!!!!!!!!");
		
		System.out.println("\n\nA huge, fiery beast with a human-like skull and horns is below you. A BALROG!");
		System.out.println("It cracks its flaming whip towards you, nearly grabbing you! Quick, what do you do?!");
		System.out.println("(A) RUN! \n(B) FIGHT!");
		
    	String ans = input.readLine();    	
    	int toss = 0;

    	
    	
    	if (ans.equals("a") || ans.equals("A")){
    		
    		toss = random.nextInt(11);
    		
    		if (hero.getStrength() > 7 || toss > 5){
    			System.out.println("OH NO!!! You've been knocked down to the bottom of the chasm by the balrog's whip!\nFight for your life!");
    			
    			balrogSortie();
    		}
    		
    		else {
    			//TODO you get out!
    			System.out.println("You manage to get across the bridge in time! You run to the door and throw it open!");
    			System.out.println("Meadows of flowers stretch before you. The sun shines bright and warm. You have survived.");
    		}    		
    	}
    	
    	else {
    		balrogSortie();
    	}
		
		
	}
	
	
	public Moria() throws IOException{
		System.out.println("You come to a dead end.");
		System.out.println("(A) Turn around\n(B) Investigate further");
		
    	String ans = input.readLine();    	
    	if (ans.equals("a") || ans.equals("A"))
    		orc();
    	
    	else {
    		System.out.println("You step forward and touch the cool, stone wall. Suddenly, faded engravings start to glow light blue.");
    		System.out.println("It's a door!\nEngraved across the top are words: ");
    		System.out.println("\n\t'THIS IS THE DOOR TO THE MINES OF MORIA. SPEAK FRIEND AND ENTER.'\n");
    		
    		System.out.println("You have 3 tries to guess the password.");
    		int counter = 0;
    		boolean flag = true;
    		
    		while (counter < 3 && flag){
    			ans = input.readLine();
    			if (ans.equals("friend") || ans.equals("Friend")){
    				flag = false;
    			}
    			else {
    				System.out.println("\n... Nothing happens ...");
    			}
    			counter++;
    		}
    		
    		if (!flag){ 	// if the flag is false, it means they got the password right
    			balrog();
    		}
    		
    		else
    			orc();	  		    		
    	} // end investigate 
		
    	objDungeon.heroSummary();		
	} // end moria

	public static void main(String[] args) throws IOException {
		Moria moria = new Moria();

	}

}
