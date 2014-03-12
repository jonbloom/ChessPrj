package chess;

public abstract class ChessPiece implements IChessPiece {

	private Player owner;

	protected ChessPiece (Player player) {
		this.owner = player;
	}

	public abstract String type();

	public Player player() {
		return owner;
	}

	public boolean isValidMove(Move move, IChessPiece[][] board) {

		if (move.fromRow != move.toRow && move.fromColumn != move.toColumn) {
			if (this == board[move.fromRow][move.fromColumn]) {
				if (board[move.toRow][move.toColumn].player() == this.owner) {
					return true;
				}
			}
		}
		return false;
	}
}
