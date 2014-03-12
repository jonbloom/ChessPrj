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
		
		//Rook
		board[0][0] = new Rook(Player.BLACK);
		board[0][7] = new Rook(Player.BLACK);
		board[7][0] = new Rook(Player.WHITE);
		board[7][7] = new Rook(Player.WHITE);
		
		//Knight
		board[0][1] = new Knight(Player.BLACK);
		board[0][6] = new Knight(Player.BLACK);
		board[7][1] = new Knight(Player.WHITE);
		board[7][6] = new Knight(Player.WHITE);
		
		//Bishop
		board[0][2] = new Bishop(Player.BLACK);
		board[0][5] = new Bishop(Player.BLACK);
		board[7][2] = new Bishop(Player.WHITE);
		board[7][5] = new Bishop(Player.WHITE);
		
		//Queen
		board[0][3] = new Queen(Player.BLACK);
		board[7][4] = new Queen(Player.WHITE);
		
		//King 
		board[0][4] = new King(Player.BLACK);
		board[7][3] = new King(Player.WHITE);
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
