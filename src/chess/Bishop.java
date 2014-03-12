package chess;

public class Bishop extends ChessPiece {

	protected Bishop(Player player) {
		super(player);
	}

	public String type() {
		return "Bishop";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (super.isValidMove(move, board)) {
			if (Math.abs(move.fromRow - move.toRow) == Math.abs(move.fromColumn - move.toColumn)) {
				return true;
			}
		}

		return false;
	}
}
