package packageName;

import java.util.Arrays;
import java.util.List;


/**
 *  run the game 
 */
public class Main {

	public static void main(String[] args) {
		
		List<String>playerNames = Arrays.asList("Alice", "Bob");
		Game game = new Game(playerNames);
		game.startGame();
	}

}
