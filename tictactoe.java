import java.util.Scanner;
import java.util.Arrays;	

public class TicTacToe3 {
	
	public static void printBoard(char[][] board) { 
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]); 
	}
	
	public static void makeMove (int move, char player, Scanner keyboard, int place, char[][] board, char placement) {		
		
		playingGame:
			
		for (int n = 0; n < 9; n++) {	
			move++;
			player = move % 2 == 0? 'X' : 'O';
			System.out.println("____________________________________________ \n PLAYER " + player + "'S MOVE");
			System.out.print("Enter where you'd like to place your move: ");
		    place = keyboard.nextInt();
		    
		    if (place > 9 || place < 1) {
				System.out.println("!!!This is an invalid place, please try again!!!");
		    	move--;
		    	n--;
		    	continue;
			}	
				
		    int counter = 0;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					counter++;
						if (counter == place) {
							if (board[i][j] == 'X'|| board[i][j] == 'O') {
								System.out.println("!!!This spot is already taken, please try again!!!");
								move--;
								n--;
								continue;
							} else { 
								board[i][j] = player;
								break;
						}
					}
				} 
			}	    
						
			placement = player == 'X'? 'O' : 'X';
			printBoard(board);
		 
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if ((board[i][0] == board[i][1] && board[i][1] == board[i][2]) || (board[0][j] == board[1][j] && board[2][j] == board[1][j])) {
						System.out.println("CONGRATS! \nPLAYER " + player + " HAS WON!");
						break playingGame;
					}	
				}	
			}	
					  		
			if((board[0][0] == board[1][1] && board[0][0] == board[2][2]) || (board[0][2] == board[1][1] && board[2][0] == board[1][1])) {	
				System.out.println("CONGRATS! \nPLAYER " + player + " HAS WON!");	
				break playingGame;
				}
			
			if (n == 8) {
				System.out.println("We have a tie!");
				break playingGame;
			}		
		}
		
	System.out.println("Thanks for playing!");	
	}

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	char player = ' ';
	char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	int move = 1;
	int place = 0;
	char placement = 'X';

	System.out.println("Welcome to TicTacToe!");
	System.out.println("This is a two player game that runs on a 3 x 3 grid labelled by numbers as references to spots to place your move \nHere's an example of the board");
	printBoard(board);
	System.out.println("Note that you cannot place a move in a spot that is already occupied or taken \nPlayers take turns placing moves with X's and O's until one gets three in a row horizontally, vertically, or diagonally \nGoodluck!");
	makeMove(move, player, keyboard, place, board, placement);
	}
}



