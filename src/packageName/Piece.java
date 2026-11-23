package packageName;


/**
 * Player's piece that moves across the board.
 */
class Piece {
	
	private int position;
	
	public Piece() {
		this.position=0;
	}
	public int getPosition() {
		return position;
	}
	public void updatePosition(int newPosition) {
		this.position = newPosition;
	}
}
