package packageName;


/**
 * unit tests 
 *
public class GameTest {

	@Test
	void testPlayerMovement() {
		Piece piece = new Piece();
		Player player = new Player("TestPlayer", piece);
		player.updatePosition(10);
		assertEquals(10,player.getPiece().getPosition());
	}
	
	@Test
	void testDiceRoll() {
		Dice dice = new Dice();
		int roll = dice.roll();
		assertTrue(roll>= 2 && roll <= 12);
	}
	
	@Test
	void testSnakeEffect() {
		Board board = new Board();
		int newPosition = board.checkForSnakeOrLadder(99);
		assertEquals(5, newPosition);
	}
	
	@Test 
	void testLadderEffect() {
		Board board = new Board();
			int newPosition = board.checkForSnakeOrLadder(4);
			assertEquals(25, newPosition);
	}
}
*/