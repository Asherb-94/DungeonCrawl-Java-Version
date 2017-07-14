public class Scene00 {
	//TODO get external hero
	public static Hero hero;

	public static void main(String[] args) {
		System.out.println("\n\n\n\nYou enter the mine and walk a few feet.");
		System.out.println("You find a piece of gold and pick it up.");
		
		hero.setGold(hero.getGold()+1);
		
		System.out.println("It makes a pleasant clink in your bag of treasure.");
		System.out.println("\nYou continue walking into the mine.");
		System.out.println("Everything is fine, so far.");
	}

}
