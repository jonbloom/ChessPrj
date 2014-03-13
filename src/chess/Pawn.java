package chess;

public class Pawn extends ChessPiece {

	protected Pawn(Player player) {
		super(player);
	}

	public String type() {
		return "Pawn";
	}
	public String icon(){
		if (super.player() == Player.WHITE)
			return PieceText.WHITE_PAWN;
		else
			return PieceText.BLACK_PAWN;
	}

	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (super.isValidMove(move, board)) {
			// Check this logic.
			if(super.player() == Player.BLACK){
					if(move.fromRow == 1){
						if (move.toRow == (move.fromRow) + 2 || move.toColumn == (move.fromColumn) + 2) {
							return true;
						}
					if (move.toRow == (move.fromRow) + 1 || move.toColumn == (move.fromColumn) + 1) {
						return true;
					}
				}
			}else if(super.player() == Player.WHITE){
					if(move.fromRow == 6){
						if (move.toRow == (move.fromRow) - 2 || move.toColumn == (move.fromColumn) - 2) {
							return true;
						}
					if (move.toRow == (move.fromRow) - 1 || move.toColumn == (move.fromColumn) - 1) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
