package Dungeon;

import java.io.IOException;

public abstract class Scenes {
	//public static final int MAXSCENE = 6;
	
	
	
	static void scene00( ) {
		Scene00 objScene00 = new Scene00();
		
		
	}
	static void scene01( int monsterHit, int monsterStr ) throws IOException {
		scene01 objScene01 = new scene01(monsterHit,monsterStr);
		
		
	}
	static void scene02( int monsterHit, int monsterStr ) {
		Scene02 objScene02 = new Scene02(monsterHit,monsterStr);
		
	}
	static void scene03( int monsterHit, int monsterStr ) {
		Scene03 objScene03 = new Scene03(monsterHit,monsterStr);
		
	}
	static void scene04( int monsterHit, int monsterStr ) {
		Scene04 objScene04 = new Scene04(monsterHit,monsterStr);
		
	}
	static void scene05( int monsterHit, int monsterStr ) {
		
		
	}
	static void scene06( int monsterHit, int monsterStr ) {
		
		
	}

	static void potionScene() {
		
		
	}

}
