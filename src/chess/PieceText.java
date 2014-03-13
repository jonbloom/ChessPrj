package chess;

public class PieceText {
	public static final String WHITE_KING = "\u2654";
	public static final String WHITE_QUEEN = "\u2655";
	public static final String WHITE_ROOK = "\u2656";
	public static final String WHITE_BISHOP = "\u2657";
	public static final String WHITE_KNIGHT = "\u2658";
	public static final String WHITE_PAWN = "\u2659";
	public static final String BLACK_KING = "\u265A";
	public static final String BLACK_QUEEN = "\u265B";
	public static final String BLACK_ROOK = "\u265C";
	public static final String BLACK_BISHOP = "\u265D";
	public static final String BLACK_KNIGHT = "\u265E";
	public static final String BLACK_PAWN = "\u265F";
	public static void print(){
		System.out.print(WHITE_KING);
		System.out.print(WHITE_QUEEN);
		System.out.print(WHITE_ROOK);
		System.out.print(WHITE_BISHOP);
		System.out.print(WHITE_KNIGHT);
		System.out.print(WHITE_PAWN);
		System.out.print(BLACK_KING);
		System.out.print(BLACK_QUEEN);
		System.out.print(BLACK_ROOK);
		System.out.print(BLACK_BISHOP);
		System.out.print(BLACK_KNIGHT);
		System.out.print(BLACK_PAWN);
	}
	public static void main(String args[]){
		print();
	}
}
