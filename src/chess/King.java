package chess;

public class King extends ChessPiece {
	
	protected King(Player player) {
		super(player);
	}

	public String type() {
		return "King";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		super.isValidMove(move, board);
		return false;
	}
}
