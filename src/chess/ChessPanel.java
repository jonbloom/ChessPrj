package chess;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChessPanel extends JPanel { 

<<<<<<< HEAD
	private JButton[][] board; 
	private ChessModel model;
	private final int BDSIZE = 8;
	private int sRow = -1;
	private int sCol = -1;
=======
		private JButton[][] board; 
		private ChessModel model;
		private final int BDSIZE = 8;
		private int sRow = -1;
		private int sCol = 01;
>>>>>>> FETCH_HEAD

	// declare other instance variables as needed 

	private ButtonListener buttonListener = new ButtonListener(); 

	public ChessPanel() { 
		board = new JButton[BDSIZE][BDSIZE];
		model = new ChessModel();
		setLayout(new GridLayout(8,8));
		for (int row = 0; row < BDSIZE; row++) {
			for (int col = 0; col < BDSIZE; col++) {
				board[row][col] = new JButton("");
				board[row][col].setFont(new Font("Dialog",1,36));
				add(board[row][col]);
				board[row][col].addActionListener(buttonListener);
			}
		}
		displayBoard();

	}

	// method that updates the board 
	private void displayBoard() { 
		for (int row = 0; row < BDSIZE; row++) {
			for (int col = 0; col < BDSIZE; col++) {
				board[row][col].setOpaque(true);
				board[row][col].setBorderPainted(false);
				if (row % 2 == 0){
					if (col % 2 == 0){
						board[row][col].setBackground(Color.WHITE);
					}
					else{
						board[row][col].setBackground(Color.GRAY);
					}
				}
				else{
					if (col % 2 == 0){
						board[row][col].setBackground(Color.GRAY);
					}
<<<<<<< HEAD
					else{
						board[row][col].setBackground(Color.WHITE);
=======
					catch(NullPointerException e){
						board[row][col].setText("");
>>>>>>> FETCH_HEAD
					}
				}
				try{
					board[row][col].setText(model.pieceAt(row,col).icon());
				}
				catch(NullPointerException e){
					board[row][col].setText("");
				}
			}
		}
	} 

	// add other helper methods as needed 

	// inner class that represents action listener for buttons 
	private class ButtonListener implements ActionListener { 

		public void actionPerformed(ActionEvent event) { 

			for (int row = 0; row < BDSIZE; row++) {
				for (int col = 0; col < BDSIZE; col++) {
					if (board[row][col] == event.getSource()) {
						sRow = row;
						sCol = col;
						board[row][col].setBackground(Color.BLUE);
					}
				}
			}
		} 
	} 
} 
