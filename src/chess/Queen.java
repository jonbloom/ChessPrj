package chess;

public class Queen extends ChessPiece {

	protected Queen(Player player) {
		super(player);
	}

	public String type() {
		return "Queen";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		super.isValidMove(move, board);
		return false;
	}
}
