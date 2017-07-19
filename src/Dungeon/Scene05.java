package Dungeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Scene05 {
	//TODO make global hero or pass it as parameter
	DungeonCrawl obj = new DungeonCrawl();
	Hero hero;
    //char[] buffer = new char[132];
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	
	public Scene05(int monsterHP, int monsterStr) throws IOException{
		System.out.println("You enter a room full of sparkling purple crystals.\nThey glint in the light of your torch.");
		System.out.println("Sitting in a geode in the middle of the cavernous room is a strange looking figure... \n\nA wizard.");
		System.out.println("\n**********");
		System.out.println("\tWelcome " + hero.getName() + ". I am Kamek the Wise.");
		System.out.println("\tI have been expecting you.");
		System.out.println("\tYou have shown great courage, battle prowess, and wisdom. Now, you must make your final choice.\n\n");
		System.out.println("  |~|    |~|    |~|");
		System.out.println("  | |    | |    | |");
		System.out.println(".' A `..' B `..' C `.");
		System.out.println("`.___.'`.___.'`.___.'");
		System.out.println("\n\t Before you sit three potions. Choose one and drink it to seal your fate.");
		System.out.println("(a or b or c)");
		
		//Scanner scan = new Scanner(System.in);
        String answer = input.readLine();
	    Random random = new Random();
	    int toss = random.nextInt(2);
	    
        if ( answer.equals("a")|| answer.equals("A")){
    		System.out.println("You uncork the potion. Immediately, you get a whiff of blood.");
    		System.out.println("\tThis is the blood of your slain opponents. Do you drink? (y or n)");
    		
    		//answer = scan.next(".").charAt(0);
    	    //buffer[0] = answer;
    		String answerOne = input.readLine();
    	    
    	    if (answerOne.equals("y")|| answerOne.equals("Y")){
    	    	System.out.println("It is hard to swallow, but you manage to finish the bottle.");
    	    	System.out.println("You feel a surge of energy within yourself.");
    	    	System.out.println("Your body is filled with the strength of your enemies. You gain 4 strength.");
    	    	hero.setStrength(hero.getStrength()+4);
    	    }
    	    
    	    else {
    	    	System.out.println("You set the potion down. Out of of the bottle comes a demon from hell.");
    	    	System.out.println("It looks to be a horrible mutant made of all the monsters you've slain.");
    	    	Monster demon = new Monster("Demon", 7, 5, 3);
    	    	sortie srtie = new sortie(hero, demon);
    	    }    
        }
        
        else if (answer.equals("b") || answer.equals("B")){
        	System.out.println("You uncork the potion and take a long swig.");
        	System.out.println("Suddenly feeling woozy, you fall to the ground.");
        	System.out.println("As you slowly fade out of consciousness, you hear the cackling of the wizard.");
        	hero.setHitPoints(0);
        	//RIP rip = new RIP();
        	//rip.display();
        }
        
        else {
        	System.out.println("You uncork the potion and gulp it down eagerly.");
        	System.out.println("It tastes like nothing. The wizard nods approvingly.");
        	System.out.println("\tYou have done well. Now you must choose one final time.");
        	System.out.println("\tTake the gold I have in my hand and leave or fight me for incredible power. (a or b)");
        	
    		//answer = scan.next(".").charAt(0);
    	    //buffer[0] = answer;
        	String answerTwo = input.readLine();
    	    
    	    if (answerTwo.equals("b")|| answerTwo.equals("B")){
	    		System.out.println("Hesitantly, you move toward the wizard and take the bag of gold in his hand.");
    	    	if (toss == 0){
    	    		System.out.println("Ow!! The gold is molten hot and melts through your hand!");
    	    		System.out.println("It falls to the ground with a sickening sizzle, covering the sparkling purple floor with blood.");
    	    		hero.setHitPoints(1);
    	    	}
    	    	else {
    	    		System.out.println("You pocket the gold and leave the cave the way you came, greateful to come out unscathed.");
    	    		hero.setGold(100);
    	    	}
    	    }
    	    else {
    	    	Monster wizard = new Monster("Wizard", 10, 10, 100);
    	    	sortie srt = new sortie(hero, wizard);
    	    }
        }
        
        obj.heroSummary();
		
		
	}
	
	public static void main(String args[]) throws IOException{
		Scene05 sc = new Scene05(5, 5);
	}
}
