package Dungeon;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Splash 
{
  public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException 
   {
	    
	  for (char ch:data.toCharArray()) 
	    {
	        System.out.print(ch);
	        unit.sleep(delay);
	    }
   }
	static void splash() throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);

     printWithDelays("....What if I told you that you were in the fight for your life. \n",TimeUnit.MILLISECONDS, 70);
     printWithDelays("A fight against an ancient evil that came from above.  \n",TimeUnit.MILLISECONDS, 70);	
     printWithDelays("The battle for good and evil is always raging around us. \n",TimeUnit.MILLISECONDS, 70);	
     printWithDelays("Do you believe this? \n",TimeUnit.MILLISECONDS, 70);	
     //printWithDelays("....Can you see it?....Can you feel it?.....Do you even know? \n",TimeUnit.MILLISECONDS, 80);		
     /*printWithDelays("....Can you feel it? \n",TimeUnit.MILLISECONDS, 80);		
     printWithDelays(".....Do you even know? \n",TimeUnit.MILLISECONDS, 80);*/		
     System.out.println("\n     (Hit Enter)");
     if (scan.hasNextLine()){
	 }	
     System.out.print("\n\n\n\n\n");
     System.out.print(" ==================================\n");
     System.out.print(" ====                          ====\n");
     System.out.print(" ====        Welcome to        ====\n");
     System.out.print(" ====                          ====\n");
     System.out.print(" ====     DUNGEON: JERICHO     ====\n");
     System.out.print(" ====                          ====\n");
     System.out.print(" ==================================\n");
  
	  
/*System.out.println("        *     ///_,");
System.out.println("       *     / ` ' '>");
System.out.println("         )  o o __/_'>");
System.out.println("      (    /  _/  )_\'>");
System.out.println("        ( \'__/   /_//_>");
System.out.println("            ____/_/_/_/");
System.out.println("           /,---, _/ /|");
System.out.println("          {{   /_/_/_/|"+"                    ");
System.out.println("             /_(_ (_ (_|                 _    ");
System.out.println("            (   /_/_/_|"       +"                / ) |   ");   
System.out.println("            \'__/_/_/_/__              )   /  ");
System.out.println("             //____|___/__)          / _ /");
System.out.println("             |  _  \'___'_(          /_   '  ");
System.out.println("              /_ (-'/'___'_/      __,'_'");
System.out.println("              __) /  \\___(_   __/.__,'");
System.out.println("           ,((,-,__/  '"+"_ /_ /_ /   /");
System.out.println("                        '"+"./_._._-'");*/


	} 
}

