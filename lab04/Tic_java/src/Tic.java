
public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;

	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public boolean Equals(Tic tic) {
		if (!(this.rows == tic.rows && this.cols == tic.cols)) {
			return false;
		} else {
			for (int i = 0; i < tic.rows; i++) {
				for (int j = 0; j < tic.cols; j++) {
					if (this.board[i][j] != tic.board[i][j]) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
