package packageName;
import java.util.*;

class Game {
	
		private List<Player> players;
		private Board board;
		private Dice dice;
		private Player currentPlayer;

		/*
		 * Initializes the game with a name list for players.
		 * @param playerNames List of player names plying the game.
		 */
		public Game(List<String>playerNames) {
			players = new ArrayList<>();
			board = new Board();
			dice = new Dice();
			for(String name : playerNames) {
				players.add(new Player(name, new Piece()));
			}
			currentPlayer = players.get(0);
		}
		
		/**
		 * start the game loop where players take turn until a winner is found.
		 */
		public void startGame() {
			while(true) {
				playTurn();
				if(checkWinCondition()) {
					System.out.println(currentPlayer.getName() + " wins");
					break;
				}
				switchTurn();
			}
			
		}
		/**
		 * generates a random number between 2 and 12 and updates
		 * player's position on the board
		 */
		private void playTurn() {
			int roll = dice.roll();
			System.out.println(currentPlayer.getName() + " rolled a " + roll);
			int newPosition = currentPlayer.move(roll);
			newPosition = board.checkForSnakeOrLadder(newPosition);
			currentPlayer.updatePosition(newPosition);
		}
		/**
		 * next player in turn 
		 */
		private void switchTurn() {
			int index = players.indexOf(currentPlayer);
			currentPlayer = players.get((index + 1) % players.size());
			
		}
		
		/*
		 * condition to check for a winner
		 * @return boolean value to check if there is a winner
		 */
		private boolean checkWinCondition() {
			return currentPlayer.getPiece().getPosition() >= 100;
		}
}
