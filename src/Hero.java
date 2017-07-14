public class Hero {
	  private int hitPoints;
	  private int maxHitPoints;
	  private int strength;
	  private int maxStrength;
	  private int potions;
	  private int gold;
	  private String name;
	  
	  public Hero(String name, int hitPoints, int strength, int gold){
		  this.name = name;
		  this.hitPoints = hitPoints;
		  this.maxHitPoints = hitPoints;
		  this.strength = strength;
		  this.maxStrength = strength;
		  this.gold = gold;
	  }
	  
	  public void Summary(){
		  System.out.println("Hero " + this.name +": " + this.hitPoints + "/" 
				  + this.maxHitPoints + "HP; " + this.strength + "/" + this.maxStrength 
				  + " ST; " + this.gold + "Gold");
	  }

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints(int maxHitPoints) {
		this.maxHitPoints = maxHitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMaxStrength() {
		return maxStrength;
	}

	public void setMaxStrength(int maxStrength) {
		this.maxStrength = maxStrength;
	}

	public int getPotions() {
		return potions;
	}

	public void setPotions(int potions) {
		this.potions = potions;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	  
	public String getName(){
		return this.name;
	}
	  
}