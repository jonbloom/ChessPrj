package chess;

public class ChessModel implements IChessModel {

	private IChessPiece[][] board;
	private Player player;
	private final static int BDSIZE = 8;
	private Pawn pawn;
	
	public ChessModel() {
		// Set up specific pieces, to start board. FUCK IT ALLLLLL!
		//Pawns
		board[0][1] = pawn;
		board[1][1] = pawn;
		board[2][1] = pawn;
		board[3][1] = pawn;
		board[4][1] = pawn;
		board[5][1] = pawn;
		board[6][1] = pawn;
		board[7][1] = pawn;
		board[8]
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
