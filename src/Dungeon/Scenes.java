package Dungeon;

import java.io.IOException;

public abstract class Scenes {
	Hero hero;
	static void scene00( ) {
		Scene00 objScene00 = new Scene00();
	}
	
	static void BatScene( int monsterHit, int monsterStr ) throws IOException {
		BatScene objScene01 = new BatScene(monsterHit,monsterStr);	
	}
	
	static void SmallChestScene( int monsterHit, int monsterStr ) throws IOException {
		SmallChestScene objScene02 = new SmallChestScene(monsterHit,monsterStr);	
	}
	
	static void MouseScene( int monsterHit, int monsterStr ) throws IOException {
		MouseScene objScene03 = new MouseScene(monsterHit,monsterStr);
	}
	
	static void PumpkinScene( int monsterHit, int monsterStr ) throws IOException {
		PumpkinScene objPumpkin = new PumpkinScene(monsterHit,monsterStr);
	}
	
	static void WizardScene( int monsterHit, int monsterStr ) throws IOException {
		WizardScene objWizard = new WizardScene();	
	}
	
	static void Shrek( int monsterHit, int monsterStr ) throws IOException {
		Shrek objShrek = new Shrek(monsterHit,monsterStr);
	}
	
	
	static void BoulderScene( int monsterHit, int monsterStr ) throws IOException {
		BoulderScene objBoulder = new BoulderScene(monsterHit,monsterStr);
	}
	
	static void OldManScene( int monsterHit, int monsterStr ) throws IOException {
		OldManScene objOldMan = new OldManScene( monsterHit,  monsterStr);
		
	}

		static void WizardRevengeScene( int monsterHit, int monsterStr ) throws IOException {
			if (Hero.getKey() >=1){
				WizardRevengeScene objWizardRev = new WizardRevengeScene();
			}
		}
		
		static void GoldElfScene( int monsterHit, int monsterStr ) throws IOException {
			GoldElfScene objGoldElf = new GoldElfScene( monsterHit,  monsterStr);
			
		}
		
		static void TravelScene()
		{
			System.out.println("As you continue to travel into the dungeon...");
		}
		
		static void Moria(  ) throws IOException {
			Moria objMoria = new Moria();
			
		}
	

	static void potionScene() {
	}

}
