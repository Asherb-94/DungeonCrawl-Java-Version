package Dungeon;
import java.util.Scanner;

public abstract class DungeonCrawl extends Scenes {
    static Hero hero; //The hero object    -- constantly updated by the game
	Monster monster; //The monster object -- constantly updated by the game
	private int hitPoints;
	private int strength;
	private String name;
	private int gold;
	 
	
	public void makeActor(String name, int hitPoints, int strength, int gold)//has to do with actor,now hero class?; 
	{
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.gold = gold;
	}
	
	public void heroSummary()
	{
		System.out.println("    Hero   : " + hero.getHitPoints() + hero.getMaxHitPoints() + 
													hero.getStrength() + hero.getMaxStrength() + hero.getGold());
	}
	
	public void monsterSummary()
	{
		System.out.println("     Monster: " + monster.getHitPoints() + monster.getMaxHitPoints() 
													+ monster.getStrength() + monster.getMaxStrength());
	}
	
	public void summary()
	{
	  hero.Summary();
	  monster.Summary();
	}
	
	
	void sceneSelect( int scene )
	{
	  if      ( scene== 0 ) scene00(  0, 0 );  /* monster-hitpoints, monster-strength  */
	  else if ( scene== 1 ) scene01(  2, 2 );
	  else if ( scene== 2 ) scene02(  0, 0 );
	  else if ( scene== 3 ) scene03(  3, 3 );
	  else if ( scene== 4 ) scene04(  5, 5 );
	  else if ( scene== 5 ) scene05(  7, 7 );
	  else if ( scene== 6 ) scene06(  9, 5 );

	  else
	  {
	    System.out.print(" No such scene number ");
	  }
	}
	
	
	
	

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int scene = 0; //current scene number
		
		//Splash Screen aka Title screen
		Splash objSplash = new Splash();
	    
		System.out.println("\n\n      (Hit Enter");
		if (scan.hasNextLine())
		{
			//Clear the screen on the cmd prompt
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
		}
		makeActor("N",4,4,0);
		Intro obj = new Intro();
		obj.intro();
		
		while (hero.getHitPoints() > 0 && scene <= 6)//MAXSCENE is a class, Actor is too for hero
		{
			System.out.println("\n\n (Hit enter)");
			if (scan.hasNextLine())
			{
				//Clear the screen on the command prompt
		        final String os = System.getProperty("os.name");
		        if (os.contains("Windows"))
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        else
		            Runtime.getRuntime().exec("clear");
			}
			
			
		}

	}

}
