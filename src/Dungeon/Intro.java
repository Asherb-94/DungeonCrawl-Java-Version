package Dungeon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Intro {

	//public static final char[] buffer = new char[132];
	public Hero objHero;
	
	public void intro() throws IOException
	{
		int flag = 1;
		//char answersub;
		String test = "abcd";
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\n");
		System.out.print("  You approach a ruined dwarven mine, ");
		System.out.print("  rummored to be filled with lost treasure, \n");
		System.out.print("  but guarded by ");
		System.out.print("monsters dangerous and most foul.\n\n");
		System.out.print("   None but the brave dare enter.\n\n");
		
		while (flag == 1)
		{
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			System.out.println(" Do you wish to continue? (y or n) ");
		    //answersub = scan.next(".").charAt(0);
		    //buffer[0] = answer;
			System.out.println();
            String answer = input.readLine();
		    
            if (answer.equals("n") || answer.equals("N"))
		    {
		    	System.out.println("  You turn tail and run.  ");
		    	System.out.println("  From the trees around you, wood nymphs giggle derisively. \n\n");
		    	System.out.println("  In your panic, you step on a bear trap and die.\n");
		    	objHero.setHitPoints(0);
		    	flag = 0;
		    }
            if (answer.equals("y") || answer.equals("Y"))
		    {
		    	
		    	int flagSub = 1;
		    	System.out.println("  Spoken like a true Hero!.  ");
		    	while (flag == 1)// loop for name length
		    	{
			    	System.out.println("  Enter your name, Hero: ");
			    	//Scanner objName = new Scanner(System.in);
			    	String objName = input.readLine();
			    	//Hero objHero = new Hero(objName.next(),4,4,0,0);
			    	Hero objHero = new Hero(objName,4,4,0,0);
			    	
			    	if (objHero.getName().isEmpty() || objHero.getName().length() < test.length() )//test is 4 
			    	{
			    		System.out.println("  You call *that* a name for a Hero? Try again: ");
			    		
			    	}
			    	else
			    	{
			    		
			    		System.out.println("\n Now *thats* a Heroic name\n");
			    		flagSub = 0;//this will stop the loop 
			    		flag = 0;
			    		
			    	}    		
		        }
		    	        
		    }
		}
		
	
  }
}
