package packageName;

import java.util.Random;


/**
 * Dice class generates a random number between 2 and 12.
 */
public class Dice {

	private Random rand;
	public Dice() {
		rand = new Random();
	}
	public int roll() {
		int roll1 = rand.nextInt(6)+1;
		int roll2 = rand.nextInt(6)+1;
		int sum = roll1 + roll2;
		return sum;
	}
}
