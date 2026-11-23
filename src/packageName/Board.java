package packageName;

import java.util.HashMap;
import java.util.Map;

/*
 * Game board which includes snakes and ladders.
 */

public class Board {

	private Map<Integer, Integer>snakes;
	private Map<Integer, Integer>ladders;
	
	public Board() {
		snakes = new HashMap<>();
		ladders = new HashMap<>();
		initializeBoard();
	}
	
	
	private void initializeBoard() {
		snakes.put(99, 5);
		snakes.put(87, 36);
		ladders.put(4, 25);
		ladders.put(12, 50);
	}
	
	
	public int checkForSnakeOrLadder(int position) {
		if(snakes.containsKey(position)) {
			System.out.println("Snake! at position: " + position + " new position: " + snakes.get(position));
			return snakes.get(position);
		} else if (ladders.containsKey(position)) {
			System.out.println("Ladder! at position: " + position + " new position: " + ladders.get(position));
			
			return ladders.get(position);
		}
		return position;
	}
}
