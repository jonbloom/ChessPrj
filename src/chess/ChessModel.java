package chess;

import javax.swing.JButton;

public class ChessModel implements IChessModel {

	private ChessPiece[][] board;
	private Player player;
	private final static int BDSIZE = 8;


	public ChessModel() {
		board = new ChessPiece[BDSIZE][BDSIZE];
		// Set up specific pieces, to start board.

		//Pawns
		for (int i = 0; i < 8; i++) {
			board[1][i] = new Pawn(Player.BLACK);
			board[6][i] = new Pawn(Player.WHITE);
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
		return true;
	}

	public boolean isValidMove(Move move) {
		return (board[move.fromRow][move.fromColumn].isValidMove(move, board));
	}

	public void move(Move move) {
		board[move.toRow][move.toColumn] = board[move.fromRow][move.fromColumn];
		board[move.fromRow][move.fromColumn] = null;
	}

	public boolean inCheck(Player player) {
		if (player == Player.WHITE){
			int kingR = -1,kingC = -1;
			for (int row = 0; row < BDSIZE; row++)
				for (int col = 0; col < BDSIZE; col++){
					try{
						if (pieceAt(row,col).type().equals("King") && pieceAt(row,col).player() == Player.WHITE){
							kingR = row;
							kingC = col;
						}
					}
					catch(NullPointerException e){
					}
				}

			for (int row = 0; row < BDSIZE; row++)
				for (int col = 0; col < BDSIZE; col++){
					try{
						if (pieceAt(row,col).player() == Player.BLACK && pieceAt(row,col).isValidMove(new Move(row,col,kingR,kingC), board)){
							return true;
						}
					}
					catch(NullPointerException e){
					}
				}
		}
		else{
			int kingR = -1,kingC = -1;
			for (int row = 0; row < BDSIZE; row++)
				for (int col = 0; col < BDSIZE; col++){

					try{
						if (pieceAt(row,col).type().equals("King") && pieceAt(row,col).player() == Player.BLACK){
							kingR = row;
							kingC = col;
						}
					}
					catch(NullPointerException e){
					}
				}

			for (int row = 0; row < BDSIZE; row++)
				for (int col = 0; col < BDSIZE; col++){
					try{
						if (pieceAt(row,col).player() == Player.WHITE && pieceAt(row,col).isValidMove(new Move(row,col,kingR,kingC), board)){
							return true;
						}
					}
					catch(NullPointerException e){
					}
				}
		}
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

	public ChessPiece pieceAt(int row, int column) {
		return board[row][column];
	}
}
