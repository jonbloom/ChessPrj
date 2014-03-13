package chess;

public class ChessModel implements IChessModel {

	private IChessPiece[][] board;
	private Player player;
	private final static int BDSIZE = 8;
	
	public ChessModel() {
		// Set up specific pieces, to start board.
		
		//Pawns
		for (int i = 0; i < 8; i++) {
			//TO DO: Check that players is correct.
			board[i][1] = new Pawn(Player.BLACK);
			board[i][6] = new Pawn(Player.WHITE);
		}
		
		
	}
	
	public boolean isComplete() {
		return false;
	}

	public boolean isValidMove(Move move) {
		if (board[move.fromRow][move.fromColumn].isValidMove(move, board)) {
			return true;
		}
		return false;
	}

	public void move(Move move) {
		move.fromRow = move.toRow;
		move.fromColumn = move.toColumn;
	}

	public boolean inCheck(Player player) {
		return false;
	}

	public Player currentPlayer() {
		return player;
	}
	
	public int numRows() {
		return BDSIZE;
	}
	
	public int numColumns() {
		return BDSIZE;
	}

	public IChessPiece pieceAt(int row, int column) {
		return board[row][column];
	}
}
