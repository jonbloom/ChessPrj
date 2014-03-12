package chess;

public class Knight extends ChessPiece {

	protected Knight(Player player) {
		super(player);
	}

	public String type() {
		return "Knight";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		super.isValidMove(move, board);
		return false;
	}
}
