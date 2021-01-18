// A small testing program with a main method to test your animals.
// Most of your testing should be done in CritterMain.java, but this smaller
// file can help you to test simpler behavior or see a bit about how
// the CritterMain uses your animals.

// 0. Bird class works fine if Hippo test is commented out...
// 1. Hippo class not found!!
// 2. Hippo class reports incorrect <hunger>

public class MiniMain {
    public static String[][] grid;

    public static void main(String[] args) {
		test();
    }
	
    // Small, very simple test.
    public static void test() {
		System.out.println("Test 1 (Bird):");
			
		// create an Ant and move it 10 times
		Bird birdy = new Bird();
		System.out.print(birdy.toString() + " ");
			
		for (int i = 1; i <= 10; i++) {
			Critter.Direction move = birdy.getMove(grid);
			System.out.print(move + " " + birdy.toString() + " ");
		}
		System.out.println();
		
		System.out.println("Test 2 (Hippo):");
		// create an Ant and move it 10 times
		Hippo animal = new Hippo();
		System.out.print(animal.toString() + " ");
			
		for (int i = 1; i <= 10; i++) {
			Critter.Direction move = animal.getMove(grid);
			System.out.print(move + " " + animal.toString() + " ");
		}			
    }

    // Moves the given animal the given number of times and prints which
    // way the animal wanted to move each time.
    public static void moves(Critter critter, int times) {
		System.out.print(critter.getClass().getName() 
						+ " moving " + times + " times: ");
		System.out.print(critter.toString() + " ");
		for (int i = 1; i <= times; i++) {
			Critter.Direction move = critter.getMove(grid);
			System.out.print(move + " ");
		}
		System.out.println(critter.toString());
    }
	
    // Asks the given animal if he wants to eat the given number of times
    // and prints whether the animal wanted to eat each time.
    public static void eating(Critter critter, int times) {
	System.out.print(critter.getClass().getName() 
                    + " eating " + times + " times: ");
	System.out.print(critter.toString() + " ");
	for (int i = 1; i <= times; i++) {
	    boolean ate = critter.eat();
	    System.out.print(ate + " " + critter.toString() + " ");
	}
	System.out.println();
    }
}
