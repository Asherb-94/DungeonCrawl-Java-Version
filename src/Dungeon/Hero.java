package Dungeon;
public class Hero {
	  public static int hitPoints;
	  private static int maxHitPoints;
	  private static int strength;
	  private static int maxStrength;
	  private static int potions;
	  private static int gold;
	  private static String name;
	  
	  public Hero(String name, int hitPoints, int strength, int gold){
		  this.name = name;
		  this.hitPoints = hitPoints;
		  this.maxHitPoints = hitPoints;
		  this.strength = strength;
		  this.maxStrength = strength;
		  this.gold = gold;
	  }
	  
	  public static void Summary(){
		  System.out.println("Hero " + name +": " + hitPoints + "/" 
				  + maxHitPoints + "HP; " + strength + "/" + maxStrength 
				  + " ST; " + gold + "Gold");
	  }

	public static int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public static int getMaxHitPoints() {
		return maxHitPoints;
	}

	public static void setMaxHitPoints(int maxHitPoints) {
		maxHitPoints = maxHitPoints;
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		strength = strength;
	}

	public static int getMaxStrength() {
		return maxStrength;
	}

	public static void setMaxStrength(int maxStrength) {
		maxStrength = maxStrength;
	}

	public static int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	public static int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	  
	public static String getName(){
		return name;
	}
	  
}