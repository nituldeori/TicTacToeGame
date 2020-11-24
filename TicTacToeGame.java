package TicTacToe;

public class TicTacToeGame {
	public static void main(String[] args) {
		System.out.println("********** Welcome to Tic Tac Toe Game ***************");
		char[] Board=new char[10];
		for(int i=1;i<Board.length;i++) {
			Board[i]=' ';
		}
		System.out.println(Board);
	}

}
