package Dungeon;
public class Hero {
	  private static  int hitPoints;
	  private static int maxHitPoints;
	  private static int strength;
	  private static int maxStrength;
	  private static int potions;
	  private static int gold;
	  private static int intelligence;
	  private static String name;
	  
	  public Hero(String name, int hitPoints, int strength, int gold){
		  this.name = name;
		  this.hitPoints = hitPoints;
		  this.maxHitPoints = hitPoints;
		  this.strength = strength;
		  this.maxStrength = strength;
		  this.gold = gold;
		  this.intelligence = 0;
	  }
	  

	public void Summary(){
		  System.out.println("Hero " + name +": " + Hero.hitPoints + "/" 
				  + this.maxHitPoints + "HP; " + this.strength + "/" + this.maxStrength 
				  + " ST; " + this.gold + " Gold");
	  }

	public static int getHitPoints() {
		return hitPoints;
	}

	public static void setHitPoints(int hitPoints) {
		Hero.hitPoints = hitPoints;
	}

	public static int getMaxHitPoints() {
		return maxHitPoints;
	}

	public static void setMaxHitPoints(int maxHitPoints) {
		Hero.maxHitPoints = maxHitPoints;
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		Hero.strength = strength;
	}

	public static int getMaxStrength() {
		return maxStrength;
	}

	public static void setMaxStrength(int maxStrength) {
		Hero.maxStrength = maxStrength;
	}

	public static int getPotions() {
		return potions;
	}

	public static void setPotions(int potions) {
		Hero.potions = potions;
	}

	public static int getGold() {
		return gold;
	}

	public static void setGold(int gold) {
		Hero.gold = gold;
	}
	
	public static String getName(){
		return name;
	}
	
	public static int getIntelligence(){
		return intelligence;
	}
	
	public static void setIntelligence(int intel){
		intelligence = intel;
	}
	  
}