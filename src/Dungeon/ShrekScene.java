package Dungeon;

import java.io.IOException;

public class ShrekScene {
	
	Hero hero = new Hero("Fiona", 5, 5, 5);
	
	public ShrekScene() throws IOException{
		System.out.println("As you continue into the cave, the floor starts getting muddier.");
		System.out.println("A stench fills your nostrils like none you've ever smelled.");
		System.out.println("You round a corner and see a hut with a huge, green monster standing outside of it.");
		System.out.println("\n\n\n\n\n\n IT'S SHREK!!!!");
		
		
		System.out.println("                   ,-'     `._ ");
		System.out.println("                 ,'           `.        ,-. ");
		System.out.println("               ,'               )       ),.) ");
		System.out.println("     ,.       /                  \\     ((  );");
		System.out.println("    /'\\     ,o.        ,ooooo.   \\  ,'  `-')");
		System.out.println("    )) )`. d8P''Y8.    ,8P''''Y8.  `'  .--''");
		System.out.println("   (`-'   `Y'  `Y8    dP       `'     /");
		System.out.println("    `----.(   __ `    ,' ,---.       (");
		System.out.println("           ),--.`.   (  ;,---.        )");
		System.out.println("          / (O_,' )   \\ ( O_,'        |");
		System.out.println("         ;  `-- ,'       `---'        |");
		System.out.println("         |    -'         `.           | ");
		System.out.println("        _;    ,            )          : ");
		System.out.println("     _.'|     `.:._   ,.::' `..       |");
		System.out.println("  --'   |   .'     '''         `      |`. ");
		System.out.println("        |  :;      :   :     _.       |`.`.-'--. ");
		System.out.println("        |  ' .     :   :__.,'|/       |   ");
		System.out.println("        `     |--.__.-'|_|_|-/        /   )");
		System.out.println("         |     {_   `--^'__,'        ,    |");
		System.out.println("         ;  `    `--^---'          ,'     |");
		System.out.println("          {  `                    /      /");
		System.out.println("           {   `    _ _          /");
		System.out.println("            |           `       /");
		System.out.println("             |           '    ,' ");
		System.out.println("              `.       ,   _,' ");
		System.out.println("                `-.___.---' ");
		
		System.out.println("\n\n\t 'GET OUT OF MY SWAMP!'");
		
		System.out.println("\n\nYou prepare for battle.");
		
		Monster shrek = new Monster("Shrek", 6, 6, 0);
		sortie sort = new sortie(hero, shrek);
		
	}

	public static void main(String[] args) throws IOException {
		ShrekScene shrek = new ShrekScene();

	}

}
