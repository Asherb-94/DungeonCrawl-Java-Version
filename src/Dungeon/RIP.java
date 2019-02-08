//RIP Class
package Dungeon;

public class RIP {
	//TODO: get global hero
	//Hero hero;
	Hero hero;
	
	public void display(){
		StringBuilder sb = new StringBuilder();
		int length = 18;
		String name = hero.getName();
		
		//set up text to place into the gravestone so it is the correct length.
		for(int i = 0; i < (length - name.length())/2; i++)
		{
			sb.append(" ");
		}
		for(int i = 0; (i < length && i < name.length()); i++){
			sb.append(name.charAt(i));
		}
		for(int i = 0; i < ((length - name.length()+1)/2); i++){
			sb.append(" ");
		}
		
		
		System.out.println();
		System.out.println("");
		System.out.println("        *           *                       ");
		System.out.println("                          *                ");
		System.out.println("           ______________        *                       ");
		System.out.println("          /___________  /\\                  ");
		System.out.println("         /              \\ \\                  ");
		System.out.println("        /                \\ \\        *        ");
		System.out.println("       |                  ||                ");
		System.out.println("       |    R. I. P.      ||               ");
		System.out.println("       |                  ||                ");
		System.out.println("  *    |" + sb.toString()  +"||               ");
		System.out.println("       |                  ||                 ");
		System.out.println("       |                  ||    *            ");
		System.out.println("       |                  ||                 ");
		System.out.println("       |                  ||                 ");
		System.out.println("       |                  ||               ");
		System.out.println("//////\\\\/\\\\///\\\\////\\\\/\\/\\///\\////\\\\");
		System.out.println("");
	}
	
}
