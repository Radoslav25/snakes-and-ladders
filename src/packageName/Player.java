package packageName;


/**
 * Player class with their pieces and move logic.
 */
public class Player {

	private String name;
	private Piece piece;
	
	public Player(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
	}
	public String getName() {
		return name;
	}
	public int move(int steps) {
		return piece.getPosition()+steps;
	}
	public void updatePosition(int newPosition) {
		piece.updatePosition(newPosition);
	}
	public Piece getPiece() {
		return piece;
	}
}
