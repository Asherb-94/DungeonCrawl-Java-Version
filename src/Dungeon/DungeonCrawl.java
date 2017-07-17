package Dungeon;
import java.io.IOException;
import java.util.Scanner;

public class DungeonCrawl extends Scenes{
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
	
	
	static void sceneSelect( int scene )
	{
	  if      ( scene== 0 ) scene00();  /* monster-hitpoints, monster-strength  */
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
	
	
	
	

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		Scanner scan = new Scanner(System.in);
		int scene = 0; //current scene number
		
		//Splash Screen aka Title screen
		Splash objSplash = new Splash();//making splash next 
	    
		System.out.println("\n\n      (Hit Enter)");
		if (scan.hasNextLine())
		{
			//Clear the screen on the command prompt
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
		}
		//Hero hero = new Hero("dummy",4,4,0);
		Intro obj = new Intro();
		obj.intro();
		//System.out.println(hero.getHitPoints());
		//System.out.println(hero.Summary());
		
		while (hero.getHitPoints() > 0 && scene <= 6)//MAXSCENE is a class, Actor is too for hero
		{
			Scanner scanSub = new Scanner(System.in);
			System.out.println("\n\n      (Hit Enter)");
			if (scanSub.hasNextLine())
			{
				//Clear the screen on the command prompt
		        final String os = System.getProperty("os.name");
		        if (os.contains("Windows"))
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        else
		            Runtime.getRuntime().exec("clear");
			}
			System.out.println();
			hero.Summary();
			
			//go to the current scene
			sceneSelect(  scene ); 
			scene++;
			
			//Play hits enter to continue
			if (scanSub.hasNextLine())
			{
				//Clear the screen on the command prompt
		        final String os = System.getProperty("os.name");
		        if (os.contains("Windows"))
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        else
		            Runtime.getRuntime().exec("clear");
			}
			hero.Summary();
			
			
			 /* If hit points are low, place a magic potion in the Hero's path */
			  if (  hero.getHitPoints() > 0 && hero.getHitPoints() < scene/4 + 2  ) 
			  {
				  PotionScene objPotion = new PotionScene();
				  objPotion.potionScene();
			  }
			  
			  /* End of Game Summary */
			  if ( hero.getHitPoints() <= 0 )
			  {
			    System.out.print("\n\nYou Lose.\n");
			    RIP objRIP = new RIP();
			    objRIP.display();
			  }
			  if(scene == 6)
			  {
				int finalGold = 0;
			    System.out.print("\n\n  You reach the end of the mine and find 100 pieces of gold\n\n");
			    finalGold = hero.getGold() + 100;
			    System.out.print("  You now have " + finalGold + " pieces of gold and have WON the game.\n\n");
			    //System.out.println("            (Hit enter)"); 
/*			    gets( buffer ); 
			    system("cls");
			    winner( hero.gold );
			    printf("\n\n\n            (Hit enter)"); 
			    gets( buffer );*/
			  }
			  
			
		}

	}

}
