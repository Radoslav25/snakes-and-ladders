turn based multiplayer gameplay in the console
two dices 2-12 steps per turn
board with configurable snakes and ladders

main.java initializes players and starts the game
game.java manages the game loop, player turns, and win condition - position >= 100
board.java stores positions of snakes and ladders and resolves tile transitions
dice.java simulates rolling two dice
player.java represents a player and delegates movement to their piece
piece.java tracks a player's current position on the board.
gametest.java JUnit tests covering core game mechanics

To run the game run main.java
