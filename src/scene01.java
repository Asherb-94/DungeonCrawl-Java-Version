

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class scene01 {
	char[] buffer;
	Hero hero;
	Monster monster;
	
	public void part1(){
		System.out.println("What is that fluttering sound?");
		System.out.println("OH NO! It's a saber-tooth bat!");
		makeActor(monster, "Bat", monsterHit, monsterStr, 0);
		monster.Summary();
		sortie();
		if(monster.getHitPoints()<=0 && hero.getHitPoints()>0){
			part2();
		}
	}
	
	public void part2(){
		System.out.println("The dead bat lies at your feet.");
		System.out.println("Is that some gold in its teeth?");
		System.out.println("Do you wish to pry the gold from the bat's teeth? (y or n): ");
		char answer = 'n';
		try {
			answer = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if ( answer == 'y' || answer == 'Y' ){
			Random ran = new Random();
			int toss = ran.nextInt(11)+1;

		    if ( toss < 5 )
		    {
		    	System.out.println("The bat is not quite dead! It bites! You die of rabies.");
		    	hero.setHitPoints(0);
		    }
		    else
		    {
		    	System.out.println("Where did the bat ever get "+toss+" pieces of gold?");
		    	System.out.println("You pocket the gold and move on.");
		    	System.out.println();
		    	hero.setGold(hero.getGold()+toss);
		    }
		  }
	}
}
