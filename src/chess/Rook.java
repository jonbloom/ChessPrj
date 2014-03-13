package chess;

public class Rook extends ChessPiece {

	protected Rook(Player player) {
		super(player);
	}

	public String type() {
		return "Rook";
	}
	public String icon(){
		if (super.player() == Player.WHITE)
			return PieceText.WHITE_ROOK;
		else
			return PieceText.BLACK_ROOK;
		
	}

	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (super.isValidMove(move, board)) {

			if (move.fromRow == move.toRow || move.fromColumn == move.toColumn) {
				return true;
			}
		}

		return false;
	}



}
