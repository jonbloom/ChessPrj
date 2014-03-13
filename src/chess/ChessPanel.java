package chess;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

	public class ChessPanel extends JPanel { 

		private JButton[][] board; 
		private ChessModel model;
		private final int BDSIZE = 8;

		// declare other instance variables as needed 

		private ButtonListener buttonListener = new ButtonListener(); 

		public ChessPanel() { 
			board = new JButton[BDSIZE][BDSIZE];
			
			for (int row = 0; row < BDSIZE; row++) {
				for (int col = 0; col < BDSIZE; col++) {
					board[row][col] = new JButton();
				}
			}
			
		}

		// method that updates the board 
		private void displayBoard() { 
			for (int row = 0; row < BDSIZE; row++) {
				for (int col = 0; col < BDSIZE; col++) {
					board[row][col].setText(model.pieceAt(row,col).icon());
				}
			}
		} 

		// add other helper methods as needed 

		// inner class that represents action listener for buttons 
		private class ButtonListener implements ActionListener { 

			public void actionPerformed(ActionEvent event) { 
				// complete this 
			} 
		} 
	} 
