package chess;

public class Pawn extends ChessPiece {

	protected Pawn(Player player) {
		super(player);
	}

	public String type() {
		return "Pawn";
	}

	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (super.isValidMove(move, board)) {
			// Check this logic.
			if (move.toRow == (move.fromRow) - 1 || move.toColumn == (move.fromColumn) - 1) {
				return true;
			}
		}
		return false;
	}
}
