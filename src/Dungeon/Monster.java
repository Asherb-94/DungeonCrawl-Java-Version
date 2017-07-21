package Dungeon;

public class Monster {
	  private static int hitPoints;
	  private static int maxHitPoints;
	  private static int strength;
	  private static int maxStrength;
	  private static int potions;
	  private static int gold;
	  private static String name;
	  
	  public Monster(String name, int hitPoints, int strength, int gold){
		  this.name = name;
		  this.hitPoints = hitPoints;
		  this.maxHitPoints = hitPoints;
		  this.strength = strength;
		  this.maxStrength = strength;
		  this.gold = gold;
	  }
	  
	  public void Summary(){
		  System.out.println(getName() + ": " + this.hitPoints + "/" 
				  + this.maxHitPoints + "HP; " + this.strength + "/" + this.maxStrength 
				  + " ST; " + this.gold + " Gold");//"Monster " + 
	  }

	public static int getHitPoints() {
		if (hitPoints < 0)
		{
			return hitPoints = 0;
		}
		else
		{
			return hitPoints;
		}
		
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public static int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public static int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public static int getMaxStrength() {
		return maxStrength;
	}

	public void setMaxStrength(int maxStrength) {
		this.maxStrength = maxStrength;
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
