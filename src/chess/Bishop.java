package chess;

public class Bishop extends ChessPiece {

	protected Bishop(Player player) {
		super(player);
	}

	public String type() {
		return "Bishop";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		super.isValidMove(move, board);
		return false;
	}
}
