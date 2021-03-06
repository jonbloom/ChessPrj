package chess;

public class King extends ChessPiece {
	
	protected King(Player player) {
		super(player);
	}

	public String type() {
		return "King";
	}
	public String icon(){
		if (super.player() == Player.WHITE)
			return PieceText.WHITE_KING;
		else
			return PieceText.BLACK_KING;
		
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
        if (super.isValidMove(move, board)) {
            if (move.fromRow == move.toRow + 1 || move.fromColumn == move.toColumn + 1
                    || move.fromRow == move.toRow || move.fromColumn == move.toColumn
                    || move.fromRow == move.toRow - 1 || move.fromColumn == move.toColumn -1) {
                return true;
            }
        }
		return false;
	}
}
