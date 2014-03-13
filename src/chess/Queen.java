package chess;

public class Queen extends ChessPiece {

	protected Queen(Player player) {
		super(player);
	}

	public String type() {
		return "Queen";
	}
	
	public String icon(){
		if (super.player() == Player.WHITE)
			return PieceText.WHITE_QUEEN;
		else
			return PieceText.BLACK_QUEEN;
		
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (super.isValidMove(move, board)) {
			if (Math.abs(move.fromRow - move.toRow) == Math.abs(move.fromColumn - move.toColumn)) {
				return true;
			}
			else if (move.fromRow == move.toRow || move.fromColumn == move.toColumn){
				return true;
			}
		}
		return false;
	}
}
